package com.company.Rule;

public class ThesisBlock extends RuleBlock {
    private String result;

    public ThesisBlock(String msg) {
        result = msg;
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "to " + "\"" + result + "\"";
    }
}
