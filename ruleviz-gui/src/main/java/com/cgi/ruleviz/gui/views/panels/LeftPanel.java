package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;

public class LeftPanel extends VerticalLayout {

    private final Button rulesGridButton = new Button("Reguły");
    private final Button domainsGridButton = new Button("Domeny");
    private final Button constantGridButton = new Button("Stałe");

    public LeftPanel()  {

        //================= buttons configuration ======================//
        rulesGridButton.setHeight("30px");
        rulesGridButton.setWidth("100px");
        rulesGridButton.getStyle().set("color", "blue");

        domainsGridButton.setHeight("30px");
        domainsGridButton.setWidth("100px");
        domainsGridButton.getStyle().set("color", "blue");

        constantGridButton.setHeight("30px");
        constantGridButton.setWidth("100px");
        constantGridButton.getStyle().set("color", "blue");


        //================== new layout for buttons ==================//
        FlexLayout gridButtons = new FlexLayout(
                rulesGridButton,
                domainsGridButton,
                constantGridButton
        );
        gridButtons.setJustifyContentMode(FlexComponent.JustifyContentMode.EVENLY);

        // ================= adding new rules for testing ===========//
        ArrayList<Rules> rulesList = new ArrayList<>();
        rulesList.add(new Rules("Reguła1"));
        rulesList.add(new Rules("Reguła2"));
        rulesList.add(new Rules("Reguła3"));

        Grid<Rules> treeGrid = new Grid<>();
        treeGrid.setItems(rulesList);
        treeGrid.addColumn(Rules::getRule);

        // ================ new layout for tabs(buttons) and tree grid =========//
        VerticalLayout gridTreeWithButtonsLayout = new VerticalLayout(
                gridButtons,
                treeGrid
        );


        // ================ styling ==========================================//
        gridTreeWithButtonsLayout.getStyle().set("border", "1px solid #9E9E9E");
        setSizeFull();
        setWidthFull();
        gridTreeWithButtonsLayout.setMinWidth("350px");
        gridTreeWithButtonsLayout.setMinHeight("700px");

        add (gridTreeWithButtonsLayout);


    }
}
