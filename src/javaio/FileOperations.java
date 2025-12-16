package javaio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Justo
 * 16 dic 2025
 */

public class FileOperations {

    public static void main(String[] args) {

        File file = new File("log.txt");
        File directory = new File("logs");

        // Show current working directory
        System.out.println("working directory : " + System.getProperty("user.dir"));

        createPath(directory);
        createFile(file);
        createAbsolutePath();

        writeFile();

        // Read file using while and do-while
        readFile();
    }

    private static void readFile() {
        try {

            // FileReader reads the file character by character
            FileReader reader = new FileReader("log.txt");

            /**
             * check the condition first before executing the while body
             * FileReader.read() returns an int
             * -1 means end of file (EOF)
             */
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

            // Close reader after finishing while loop
            reader.close();

            System.out.println("\n--- Reading again using do-while ---");

            // New reader needed because the previous one was closed
            reader = new FileReader("log.txt");

            /**
             * Execute the commands inside the "do" body first,
             * then check the condition, if it is true repeat
             * the execution
             */
            do {
                c = reader.read();
                if (c != -1) {
                    System.out.print((char) c);
                }
            } while (c != -1);

            // Close reader after do-while
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile() {
        try {

            FileWriter writer = new FileWriter("log.txt");

            writer.write("Black holes\n");
            writer.write("pollas en vinagre\n");
            writer.write("End of file example\n");

            // close the writer and refresh the data
            writer.close();

            // refresh data we have written to the file
            // writer.flush();  // not needed if we close the writer

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createAbsolutePath() {

        // create directory using absolute path
        File absoluteDir = new File(System.getProperty("user.dir") + "/logs");
        absoluteDir.mkdir();
    }

    private static void createPath(File file) {

        System.out.println(file.isAbsolute());
        System.out.println(file.getPath());

        // create directories specified by the "file" object
        file.mkdirs();

        System.out.println(file.getAbsolutePath());
    }

    private static void createFile(File file) {

        if (file.exists()) {
            System.out.println("the log file exists");
        } else {
            System.out.println("the log file does not exist");
            try {
                file.createNewFile();
            } catch (IOException e) {
                // With try catch, we can continue executing the program without interruption
                e.printStackTrace();
            }
            System.out.println("finished");
        }
    }
}
