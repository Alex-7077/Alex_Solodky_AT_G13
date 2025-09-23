package project.playground.essence.creatures.insect;


import project.playground.essence.plant.vegetable.Carrot;

public class Beetle extends Insect {
    public Beetle(String name, int mass) {
        super(name, mass);
    }

    public void nest(Carrot home) {
        if (home == null || this.mass <= 0) {
            System.out.println("This carrot is too small for nesting :(");
            return;
        }
        String N = this.name;
        int beetleMass = this.mass;
        int carrotMass = home.getMass();

        if (beetleMass < carrotMass) {
            int D = carrotMass / beetleMass;
            System.out.println("I am " + N + " and I will nest there with " + D + " my family members!");
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}