package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;

public class constansViewPanel extends VerticalLayout {

    public constansViewPanel() {

        ArrayList<Constans>  constansList = new ArrayList<>();
        constansList.add(new Constans("Stała1"));
        constansList.add(new Constans("Stała2"));
        constansList.add(new Constans("Stała3"));

        Grid<Constans> treeGrid = new Grid<>();
        treeGrid.setItems(constansList);
        treeGrid.addColumn(Constans::getRule);
        //treeGrid.setSizeFull();
        add(treeGrid);
    }
}
