package com.cgi.ruleviz.model.concept;

public class DecisionMatch {
    private AcceptancePredicate acceptancePredicate;
    private RuleBlock nextBlock;

    public DecisionMatch(RuleBlock rb) {
        acceptancePredicate = null; // to jest ostatni match w.p.p. który wszystko akceptuje
        nextBlock = rb;
    }

    public DecisionMatch(AcceptancePredicate pred, RuleBlock rb) {
        acceptancePredicate = pred;
        nextBlock = rb;
    }

        // FIXME update cv z decision block
//    public void setAcceptancePredicate(AcceptancePredicate acceptancePredicate) {
//        this.acceptancePredicate = acceptancePredicate;
//    }

    public void setNextBlock(RuleBlock nextBlock) {
        this.nextBlock = nextBlock;
    }

    @Override
    public String toString() {
        if (acceptancePredicate == null)
            return nextBlock.toString();
        return  acceptancePredicate.toString() + " " + nextBlock.toString();
    }

    public void setControlValue(EntityAttribute cv) {
        if(acceptancePredicate != null)
            acceptancePredicate.setControlValue(cv);
    }
}
