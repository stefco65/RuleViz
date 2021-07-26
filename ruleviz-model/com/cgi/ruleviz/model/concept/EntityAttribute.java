package com.cgi.ruleviz.model.concept;

public class EntityAttribute {
    private String name;

    public String getName() {
        return name;
    }

    public EntityAttribute(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
