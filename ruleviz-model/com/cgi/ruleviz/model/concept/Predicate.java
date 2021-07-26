package com.cgi.ruleviz.model.concept;

public class Predicate {
    private Argument constant;
    private Operator operator;

    public Predicate (Operator op, Argument c) {
        constant = c; operator = op;
    }

    public boolean calculate(EntityAttribute controlValue) {
        // oblicz na podstawie operatora i przekazanego cv czy prawda czy fałsz
        return false;
    }

    @Override
    public String toString() {
        return operator.toString() + " " + constant.toString();
    }
}
