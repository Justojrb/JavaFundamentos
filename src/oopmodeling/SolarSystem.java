package oopmodeling;

public class SolarSystem {
    public static void main(String[] args) {
        Object obj = new Planet();
        Planet obj2 = new Planet();
        Planet jupiter = new Planet(3276, "Jupiter");
        Planet mars = new Planet(68738, "mars", 2587);

        System.out.print(mars.getName());
    }
}
