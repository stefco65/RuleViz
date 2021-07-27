package com.cgi.ruleviz.gui.views;

import com.cgi.ruleviz.gui.views.panels.CenterPanel;
import com.cgi.ruleviz.gui.views.panels.FooterPanel;
import com.cgi.ruleviz.gui.views.panels.HeaderPanel;
import com.cgi.ruleviz.gui.views.panels.Rules;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
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

    private HeaderPanel headerPanel = new HeaderPanel();
    private CenterPanel centerPanel = new CenterPanel();
    private FooterPanel footerPanel = new FooterPanel();

    public RuleVizGUIView() {
        addClassName("rule-viz-gui-view");


        VerticalLayout mainFrame = new VerticalLayout(
                headerPanel,
                centerPanel,
                footerPanel
        );

        mainFrame.getStyle().set("border", "1px solid #9E9E9E");
        mainFrame.setMinWidth(WIDTH+"px");
        mainFrame.setMinHeight(HEIGHT+"px");
        add(mainFrame);
    }

}
