package oopmodeling;

public class Celestialbody {
    // las variables por defecto
    protected double mass = 1000000;
    String name = "Unknown";
    public float radius = 12343434.3f;

    public double getMass() { return mass;}
    public String getName() { return name;}
    public float getRadius() {return radius;}
    public  void  setMass(double mass) {this.mass = mass;}
    public  void  setName(String name) {this.name = name;}
    public  void  setRadius(float radius) {this.radius = radius;}
    //contructor of this class
    public Celestialbody(){}
    public Celestialbody(String name){
        this.name = name;
    }
    public Celestialbody(double mass, String name){
        this.name = name;
        this.mass = mass;
    }

    public String getSize() {
        return null;
    }

    public void setSize(int i) {
    }
}