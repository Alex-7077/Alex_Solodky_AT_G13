package project.playground.essence.creatures.vertebrata;

import project.playground.essence.creatures.Animal;
import project.playground.essence.creatures.insect.Insect;

public abstract class Vertebrata extends Animal {
    public Vertebrata(String name, int mass) {
        super(name, mass);
    }


    public void eat(Insect food) {
        String N = this.name;
        String D = (food != null ? food.getName() : "null");
        System.out.println("I am " + N + " and I am eating " + D);
    }
}