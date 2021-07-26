package com.cgi.ruleviz.model.concept;

public class EntityAttribute extends Argument {
    private String name;

    public String getName() {
        return name;
    }

    public EntityAttribute(int value) {
        super(value);
    }
    public EntityAttribute(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
