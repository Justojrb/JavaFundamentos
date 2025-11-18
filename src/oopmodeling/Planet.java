package oopmodeling;

import oopmodeling.Celestialbody;

public class Planet extends Celestialbody {
    /**
     * Contructors used to create concrete objets of the class
     */

    public  Planet(){
        super();
    }
    //Contructor with two parameters
    public Planet (double mass, String nameOf){
        super(nameOf);
        name = nameOf;
        this.mass =mass;


    }
    //Contructor with two parameters
    public Planet(double mass, String name,float radius){
        super(mass, name);
        this.mass = mass;
        this.name = name;
        this.radius = radius;

    }

}