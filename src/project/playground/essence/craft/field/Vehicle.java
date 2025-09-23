package project.playground.essence.craft.field;

import project.playground.essence.Matter;

public abstract class Vehicle extends Matter {
    protected String name;

    public Vehicle(String name, int mass) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}