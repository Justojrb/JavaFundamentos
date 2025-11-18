package datastructure;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class SortingTest {

    public static void main(String[] args) {
        String[] names = {"Pablo", "Juan", "Ana", "Justo", "Ruben"};
        int[] scores = {12, 1000, 3423, 34, 2, 20, 3, 2};
        sort(scores);
        System.out.println("ordered array " + Arrays.toString(scores));

        boolean isExisting = busquedabinaria(3, scores);
        System.out.println(isExisting);

        isExisting = Busquedalineal(3, scores);
        System.out.println("busqueda lineal " + isExisting);
    }

    /**
     * // En este algoritmo buscamos y elemento especifico en un array ordenado comparando los elementos de uno en uno
     * the time soncumed in this algoritms is averagely proportional to the size of the array
     *
     * @param elemento
     * @param elementos
     * @return
     */

    private static boolean Busquedalineal(int elemento, int[] elementos) {
        /**
         * steps
         * 1 create a loop to traverse the element in the array
         * 2 in the body of the loop, we compare the element with
         * the element of the array, if there is a match, we return
         * true
         */
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == elemento) {
                return true;

            }

        }

        return false;
    }

    private static boolean busquedabinaria(int elemento, int[] elementos) {
        //1 calculate the index of the middle
        int middleIndex = elementos.length / 2;
        if (elementos[middleIndex] == elemento) {
            return true;
        } else if (elementos[middleIndex] == elemento) {

        } else if (elementos[middleIndex] > elemento){

        }

        return false;
    }

    private static void sort(int[] arr) {

        int j = 0;

//*  for (int i = 0; i < arr.length - 1 - j; i++) {
//			 int previous = arr[i];
//			 int next = arr[i + 1];
//			 if(previous > next) {
//
//				 ArrayTest.switchValues(arr, i, i + 1);
//				 System.out.println(Arrays.toString(arr));
//			 }
//		 }
//		 j++;
//
//		 for (int i = 0; i < arr.length - 1 - j; i++) {
//			 int previous = arr[i];
//			 int next = arr[i + 1];
//			 if(previous > next) {
//
//				 ArrayTest.switchValues(arr, i, i + 1);
//				 System.out.println(Arrays.toString(arr));
//			 }
//		 }
//		 j++;
//
//		 for (int i = 0; i < arr.length - 1 - j; i++) {
//			 int previous = arr[i];
//			 int next = arr[i + 1];
//			 if(previous > next) {
//
//				 ArrayTest.switchValues(arr, i, i + 1);
//				 System.out.println(Arrays.toString(arr));
//			 }
//		 }
//		 j++;

        while (j < arr.length) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                int previous = arr[i];
                int next = arr[i + 1];
                if (previous > next) {

                    ArrayTest.SwitchValues(arr, i, i + 1);
                    System.out.println(Arrays.toString(arr));
                }

            }
            j++;

        }


    }

}
