package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.charts.model.Pane;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;

public class TreeVisualizationPanel extends VerticalLayout {

    private final TextArea treeView = new TextArea();

    TreeVisualizationPanel() {

        treeView.setSizeFull();
        treeView.setPlaceholder("Drzewo");
    }
}
