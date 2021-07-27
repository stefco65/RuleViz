package com.cgi.ruleviz.gui.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouteAlias;

import java.util.ArrayList;

@PageTitle("RuleVizGUI")
@Route(value = "empty")
@RouteAlias(value = "")
public class RuleVizGUIView extends VerticalLayout {

    private final int WIDTH = 1400;
    private final int HEIGHT = 900;

    public RuleVizGUIView() {
        addClassName("rule-viz-gui-view");

        TextArea treeView = new TextArea();
        treeView.setSizeFull();
        treeView.setPlaceholder("Drzewo");

        Button fileButton = new Button("Plik");
        Button helpButton = new Button("Pomoc");

        Button rule1 = new Button("Reguła1");
        Button rule2 = new Button("Reguła2");

        Button rulesGridButton = new Button("Reguły");
        Button domainsGridButton = new Button("Domeny");
        Button constantGridButton = new Button("Stałe");

        fileButton.setHeight("44px");
        fileButton.setWidth("100px");
        fileButton.getStyle().set("color", "red");

        helpButton.setHeight("44px");
        helpButton.setWidth("100px");
        helpButton.getStyle().set("color", "red");

        rulesGridButton.setHeight("30px");
        rulesGridButton.setWidth("100px");
        rulesGridButton.getStyle().set("color", "blue");

        domainsGridButton.setHeight("30px");
        domainsGridButton.setWidth("100px");
        domainsGridButton.getStyle().set("color", "blue");

        constantGridButton.setHeight("30px");
        constantGridButton.setWidth("100px");
        constantGridButton.getStyle().set("color", "blue");

        FlexLayout header = new FlexLayout(fileButton, helpButton);
        header.getStyle().set("border", "1px solid #9E9E9E");
        header.setWidthFull();
        header.setJustifyContentMode(JustifyContentMode.BETWEEN);



        FlexLayout buttonsAboveActionTree = new FlexLayout(rule1, rule2);
        buttonsAboveActionTree.getStyle().set("border", "1px solid #9E9E9E");
        buttonsAboveActionTree.setWidthFull();

        VerticalLayout actionTreeFrameLayout = new VerticalLayout(buttonsAboveActionTree, treeView);
        actionTreeFrameLayout.getStyle().set("border", "1px solid #9E9E9E");
        actionTreeFrameLayout.setWidthFull();
        actionTreeFrameLayout.setMinWidth("1050px");
        actionTreeFrameLayout.setMinHeight("700px");

        FlexLayout gridButtons = new FlexLayout(
                rulesGridButton,
                domainsGridButton,
                constantGridButton
        );
        gridButtons.setJustifyContentMode(JustifyContentMode.EVENLY);


        ArrayList<Rules> rulesList = new ArrayList<>();
        rulesList.add(new Rules("Reguła1"));
        rulesList.add(new Rules("Reguła2"));
        rulesList.add(new Rules("Reguła3"));

        Grid<Rules> treeGrid = new Grid<>();
        treeGrid.setItems(rulesList);
        treeGrid.addColumn(Rules::getRule);

        VerticalLayout gridTreeWithButtonsLayout = new VerticalLayout(
                gridButtons,
                treeGrid
        );
        gridTreeWithButtonsLayout.getStyle().set("border", "1px solid #9E9E9E");
        gridTreeWithButtonsLayout.setWidth("350px");
        gridTreeWithButtonsLayout.setHeight("700px");

        HorizontalLayout centralLayout = new HorizontalLayout(
                gridTreeWithButtonsLayout,
                actionTreeFrameLayout);
        centralLayout.getStyle().set("border", "1px solid #9E9E9E");


        TextField searchField = new TextField();
        searchField.setWidth("300px");
        searchField.setHeight("50px");
        searchField.setPlaceholder("Szukaj");


        TextArea detailsField = new TextArea();
        detailsField.setPlaceholder("Szczegóły");
        detailsField.setWidthFull();
        detailsField.setSizeFull();

        HorizontalLayout footer = new HorizontalLayout(searchField, detailsField);
        footer.getStyle().set("border", "1px solid #9E9E9E");
        footer.setWidthFull();
        footer.setPadding(true);

        VerticalLayout mainFrame = new VerticalLayout(
                header,
                centralLayout,
                footer
        );
        mainFrame.getStyle().set("border", "1px solid #9E9E9E");
        mainFrame.setMinWidth(WIDTH+"px");
        mainFrame.setMinHeight(HEIGHT+"px");
        add(mainFrame);
    }

}
