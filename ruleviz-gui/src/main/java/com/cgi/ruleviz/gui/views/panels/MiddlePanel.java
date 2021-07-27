package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class MiddlePanel extends HorizontalLayout {

    private final LeftPanel leftPanel = new LeftPanel();
    private final BoardPanel boardPanel = new BoardPanel();

    public MiddlePanel() {

        add (
                leftPanel,
                boardPanel
        );
        getStyle().set("border", "1px solid #9E9E9E");
        setSizeFull();
        //setWidthFull();
    }

}
