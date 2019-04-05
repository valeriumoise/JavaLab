package ui;

import model.Catalog;

import javax.swing.*;

public class CatalogList extends JList<Catalog> {
    private DefaultListModel model = new DefaultListModel<>();

    public CatalogList() {
        String title = "<html><i><font color='blue'>" +
                "Catalog Graphs" + "</font></i></hmtl>";
        this.setBorder(BorderFactory.createTitledBorder(title));
        this.setModel(model);
    }

    public void addGraph(String item) {
        model.addElement(item);
    }
}

