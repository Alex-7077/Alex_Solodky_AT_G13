package project.playground.essence.creatures;

import project.playground.essence.Matter;
import project.playground.essence.plant.Plant;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(String name, int mass) {
        super(mass);
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


    public void eat(Plant food) {
        String N = this.name;
        String D = (food != null ? food.getName() : "null");
        System.out.println("I am " + N + " and I am eating " + D);
    }
}