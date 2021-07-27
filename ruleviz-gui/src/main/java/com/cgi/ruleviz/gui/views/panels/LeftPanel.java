package com.cgi.ruleviz.gui.views.panels;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

import java.util.HashMap;
import java.util.Map;

public class LeftPanel extends VerticalLayout {

    private final Tab rulesGridTab = new Tab("Reguły");
    private final Tab domainsGridTab = new Tab("Domeny");
    private final Tab constantGridTab = new Tab("Stałe");

    private final RulesViewPanel gridRules = new RulesViewPanel();
    private final DomainViewPanel gridDomains = new DomainViewPanel();
    private final ConstansViewPanel gridConstans = new ConstansViewPanel();


    public LeftPanel()  {

        //================= buttons configuration ======================//
        rulesGridTab.getStyle().set("color", "blue");

        domainsGridTab.getStyle().set("color", "blue");

        constantGridTab.getStyle().set("color", "blue");

        gridConstans.setVisible(false);
        gridDomains.setVisible(false);

        // ================ hash map for tabs  ==========================//
        Map<Tab, Component> tabsToPages = new HashMap<>();
        tabsToPages.put(rulesGridTab, gridRules);
        tabsToPages.put(domainsGridTab, gridDomains);
        tabsToPages.put(constantGridTab, gridConstans);

        //================== adding tabs  ==============================//
        Tabs tabs = new Tabs(
                rulesGridTab,
                domainsGridTab,
                constantGridTab
        );

        // ================= tabs styling ============================ //
        tabs.setSelectedTab(rulesGridTab);
        tabs.getStyle().set("border", "1px solid #9E9E9E");
        tabs.setMinWidth("350px");
        tabs.setFlexGrowForEnclosedTabs(1);
        tabs.setWidthFull();

        // ================= grids styling ========================= //
        gridRules.setSizeFull();
        gridRules.setMinWidth("350px");
        gridRules.setMinHeight("650px");

        gridDomains.setSizeFull();
        gridDomains.setMinWidth("350px");
        gridDomains.setMinHeight("650px");

        gridConstans.setSizeFull();
        gridConstans.setMinWidth("350px");
        gridConstans.setMinHeight("650px");

        // ================ styling ==========================================//
        getStyle().set("border", "1px solid #9E9E9E");
        setSizeFull();
        setWidthFull();
        setMinWidth("400px");
        setMinHeight("700px");


        tabs.addSelectedChangeListener(event -> {
            tabsToPages.values().forEach(page -> page.setVisible(false));
            Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
            selectedPage.setVisible(true);
        });

        add(
                tabs,
                gridRules,
                gridDomains,
                gridConstans
        );

    }
}
