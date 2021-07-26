package com.cgi.ruleviz.model.concept;

public class AcceptancePredicate {
    private EntityAttribute argumentCV; // TODO może zamist Entity dac Argument
    private Operator operator;
    private Argument argument2;

    public AcceptancePredicate(Operator op, Argument arg2) {
        operator = op; argument2 = arg2;
    }

    public void setControlValue(EntityAttribute argumentCV) {
        this.argumentCV = argumentCV;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setArgument2(Argument argument2) {
        this.argument2 = argument2;
    }

    @Override
    public String toString() {
        return argumentCV.toString() + " " + operator.toString() + " " + argument2.toString();
    }
}