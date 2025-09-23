package project.playground.essence.plant;

import project.playground.essence.Matter;

public abstract class Plant extends Matter {
    protected String name;

    public Plant(String name, int mass) {
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