package com.cgi.ruleviz.model.concept;

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
