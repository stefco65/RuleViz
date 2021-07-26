package com.cgi.ruleviz.model.concept;

import java.util.List;

public class DecisionBlock extends RuleBlock {
    private EntityAttribute controlValue;
    private List<DecisionMatch> decisionMatches;

    public DecisionBlock (EntityAttribute cv, List<DecisionMatch> dms) {
        decisionMatches = dms;
        controlValue = cv;
        updateDecisionMatches();
    }

    public void setControlValue(EntityAttribute controlValue) {
        this.controlValue = controlValue;
        updateDecisionMatches();
    }

    public void setDecisionMatches(List<DecisionMatch> decisionMatches) {
        this.decisionMatches = decisionMatches;
        updateDecisionMatches();
    }

    private void updateDecisionMatches() {
        for(DecisionMatch dm : decisionMatches) {
            dm.setControlValue(controlValue);
        }
    }

    // TODO public add decisionmatch i odrazu ustawia atttrbut cv w predykacie

    @Override
    public String toString() {
        String result = "";
        int i = 0;
        for(DecisionMatch dm : decisionMatches) {
            if (i == 0)
                result += "\nJeżeli " + dm.toString();
            else if (i == decisionMatches.size() - 1)
                result += "\nw.p.p. " + dm.toString();
            else
                result += "\nw.p.p. jeżeli " + dm.toString();
            i++;
        }
        return result;
    }
}
