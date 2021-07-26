package com.cgi.ruleviz.model;

import com.cgi.ruleviz.model.concept.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
// jezeli dpd < 3 to "A"
// wpp jeżeli dpd < 30 to "B"
// wpp "0"
    public static void main(String[] args) {
        // budowanie ładne całej reguły metodami/konstruktorami
        // getery setery
        // printowanie
        // TODO dodać identyfikatory mapowanie na referencje bloków
        // TODO modyfikowanie istniejących blokó, dodawanie decyzji nowych

        // TODO zakomitować w innym folderze

        EntityAttribute dpdAttr = new EntityAttribute("DPD");

        ThesisBlock thesisBlockA = new ThesisBlock("A");
        ThesisBlock thesisBlockB = new ThesisBlock("B");
        ThesisBlock thesisBlock0 = new ThesisBlock("0");
        List<DecisionMatch> decisions = new ArrayList<DecisionMatch>();
        Predicate predA = new Predicate(Operator.LESS, new Argument(3));
        Predicate predB = new Predicate(Operator.LESS, new Argument(30));
        decisions.add(new DecisionMatch(predA, thesisBlockA));
        decisions.add(new DecisionMatch(predB, thesisBlockB));
        decisions.add(new DecisionMatch(thesisBlock0)); // to jest ostatni match w.p.p. który wszystko akceptuje

        DecisionRule decisionRule = new DecisionRule(new DecisionBlock(dpdAttr, decisions));

        System.out.println(decisionRule.toTextRepresentation());
    }
}
