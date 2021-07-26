package com.cgi.ruleviz.model.concept;

public class Argument {
    private int value;

    public int getValue() {
        return value;
    }

    public Argument(int v) {
        value = v;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}