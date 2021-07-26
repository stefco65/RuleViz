package com.cgi.ruleviz.model;

import com.cgi.ruleviz.model.concept.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//         Jezeli dpd < 3
//              Jeżeli ocena = 2 to "AA"
//              wpp "AAA"
//         wpp jeżeli dpd < 30 to "B"
//         wpp "0"

        List<DecisionMatch> decisions2 = new ArrayList<>();
        AcceptancePredicate predAA = new AcceptancePredicate(Operator.EQUAL, new Argument(2));
        decisions2.add(new DecisionMatch(predAA, new ThesisBlock("AA")));
        decisions2.add(new DecisionMatch(new ThesisBlock("AAA")));
        DecisionBlock decisionBlock2 = new DecisionBlock(new EntityAttribute("ocena"), decisions2);

        List<DecisionMatch> decisions = new ArrayList<DecisionMatch>();
        AcceptancePredicate predA = new AcceptancePredicate(Operator.LESS, new Argument(3));
        AcceptancePredicate predB = new AcceptancePredicate(Operator.LESS, new Argument(30));
        decisions.add(new DecisionMatch(predA, decisionBlock2));
        decisions.add(new DecisionMatch(predB, new ThesisBlock("B")));
        decisions.add(new DecisionMatch(new ThesisBlock("0"))); // to jest ostatni match w.p.p. który wszystko akceptuje

        DecisionRule decisionRule = new DecisionRule(new DecisionBlock(new EntityAttribute("DPD"), decisions));
        System.out.println(decisionRule.toTextRepresentation());
    }
}
