package com.company.Rule;

public class DecisionMatch {
    private Predicate acceptanceCriteria;
    //private String condition;
    private RuleBlock nextBlock;

    public DecisionMatch(RuleBlock rb) {
        acceptanceCriteria = null; // to jest ostatni match w.p.p. który wszystko akceptuje
        nextBlock = rb;
    }
//    public DecisionMatch(String cond, RuleBlock rb) {
//        condition = cond;
//        nextBlock = rb;
//    }
    public DecisionMatch(Predicate pred, RuleBlock rb) {
        acceptanceCriteria = pred;
        nextBlock = rb;
    }

    @Override
    public String toString() {
        if (acceptanceCriteria == null)
            return nextBlock.toString();
        return  acceptanceCriteria.toString() + " " + nextBlock.toString();
    }
}
