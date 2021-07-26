package com.cgi.ruleviz.model.concept;

public enum Operator {
    EQUAL { public String toString() { return "="; }},
    GREATER { public String toString() { return ">"; }},
    LESS { public String toString() { return "<"; }},
    OTHERWISE { public String toString() { return ""; }};

    public abstract String toString();
}