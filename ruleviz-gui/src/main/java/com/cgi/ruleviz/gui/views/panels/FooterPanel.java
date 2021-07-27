package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

public class FooterPanel extends HorizontalLayout {

    private final TextField searchField = new TextField();
    private final  TextArea detailsField = new TextArea();

    public FooterPanel() {
        getStyle().set("border", "1px solid #9E9E9E");
        setWidthFull();
        setPadding(true);

        searchField.setWidth("300px");
        searchField.setHeight("50px");
        searchField.setPlaceholder("Szukaj");

        detailsField.setPlaceholder("Szczegóły");
        detailsField.setWidthFull();
        detailsField.setSizeFull();

        add(
                searchField,
                detailsField
        );
    }
}
