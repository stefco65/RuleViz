package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;

public class RightPanel extends VerticalLayout {


    private final Button rule1 = new Button("Reguła1");
    private final Button rule2 = new Button("Reguła2");

    private final TreeVisualizationPanel treeVisualizationPanel = new TreeVisualizationPanel();

    public RightPanel() {

        FlexLayout buttonsAboveActionTree = new FlexLayout(rule1, rule2);
        buttonsAboveActionTree.getStyle().set("border", "1px solid #9E9E9E");
        buttonsAboveActionTree.setWidthFull();

        VerticalLayout actionTreeFrameLayout = new VerticalLayout(buttonsAboveActionTree, treeVisualizationPanel);
        actionTreeFrameLayout.getStyle().set("border", "1px solid #9E9E9E");
        actionTreeFrameLayout.setMinWidth("1050px");
        actionTreeFrameLayout.setMinHeight("700px");
        setSizeFull();
        actionTreeFrameLayout.setWidthFull();

        add(actionTreeFrameLayout);
    }
}
