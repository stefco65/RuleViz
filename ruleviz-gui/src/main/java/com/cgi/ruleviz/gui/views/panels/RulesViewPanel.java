package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;

public class RulesViewPanel extends VerticalLayout {

    public RulesViewPanel() {

        ArrayList<Rules> rulesList = new ArrayList<>();
        rulesList.add(new Rules("Reguła1"));
        rulesList.add(new Rules("Reguła2"));
        rulesList.add(new Rules("Reguła3"));

        Grid<Rules> treeGrid = new Grid<>();
        treeGrid.setItems(rulesList);
        treeGrid.addColumn(Rules::getRule);
        //treeGrid.setSizeFull();
        add(treeGrid);
    }
}
