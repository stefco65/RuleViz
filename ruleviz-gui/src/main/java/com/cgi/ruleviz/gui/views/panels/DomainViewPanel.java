package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;

public class DomainViewPanel extends VerticalLayout {

    public DomainViewPanel() {

        ArrayList<Domains> domainsList = new ArrayList<>();
        domainsList.add(new Domains("Domena1"));
        domainsList.add(new Domains("Domena2"));
        domainsList.add(new Domains("Domena3"));

        Grid<Domains> treeGrid = new Grid<>();
        treeGrid.setItems(domainsList);
        treeGrid.addColumn(Domains::getRule);
        //treeGrid.setSizeFull();
        add(treeGrid);
    }
}
