package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class CenterPanel extends HorizontalLayout {

    private final LeftPanel leftPanel = new LeftPanel();
    private final RightPanel rightPanel = new RightPanel();

    public CenterPanel() {

        add (
                leftPanel,
                rightPanel
        );
        getStyle().set("border", "1px solid #9E9E9E");
        setSizeFull();
        //setWidthFull();
    }

}
