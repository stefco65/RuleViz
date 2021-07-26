package com.cgi.ruleviz.model.concept;

public class DecisionRule {
    private DecisionBlock root;

    public void setMainBlock(DecisionBlock mainBlock) {
        this.root = mainBlock;
    }

    public DecisionRule() {
    }

    public DecisionRule(DecisionBlock mainBlock) {
        root = mainBlock;
    }

    public String toTextRepresentation() {
        return root.toString();
    }
}