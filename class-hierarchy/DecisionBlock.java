package com.company.Rule;

import java.util.List;

public class DecisionBlock extends RuleBlock {
    private EntityAttribute controlValue;
    private List<DecisionMatch> decisionMatches;

    public DecisionBlock (EntityAttribute cv, List<DecisionMatch> dms) {
        controlValue = cv; decisionMatches = dms;
    }

    @Override
    public String toString() {
        String result = "";
        int i = 0;
        for(DecisionMatch dm : decisionMatches) {
            if (i == 0)
                result += "Jeżeli " + controlValue.toString() + " " + dm.toString();
            else if (i == decisionMatches.size() - 1)
                result += "\nw.p.p. " + dm.toString();
            else
                result += "\nw.p.p. jeżeli " + controlValue.toString() + " " + dm.toString();
            i++;
        }
        return result;
    }
}
