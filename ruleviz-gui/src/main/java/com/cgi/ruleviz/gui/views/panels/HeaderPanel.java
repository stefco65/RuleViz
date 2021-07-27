package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

public class HeaderPanel extends FlexLayout {

    private final Button fileButton = new Button("Plik");
    private final Button helpButton = new Button("Pomoc");


    public HeaderPanel() {
        getStyle().set("border", "1px solid #9E9E9E");
        setWidthFull();
        setJustifyContentMode(JustifyContentMode.BETWEEN);

        //==================Add components to layout =======================//
        add(
                fileButton,
                helpButton
        );
    }
}
