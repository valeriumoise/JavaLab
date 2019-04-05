package ui;

import javax.swing.*;
import java.awt.*;

public class CatalogFrame extends JFrame {
    private GraphForm form;
    private CatalogList list;
    private ui.ControlPanel control;

    public CatalogFrame() {
        super("Visual Graph Manager");
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);

        this.getContentPane().setLayout(new BorderLayout());

        this.form = new GraphForm(this);
        this.getContentPane().add(BorderLayout.NORTH, form);

        this.list = new CatalogList();
        this.getContentPane().add(BorderLayout.CENTER, list);

        this.control = new ControlPanel(this);
        this.getContentPane().add(BorderLayout.SOUTH, control);

        form.setOpaque(true);

//        this.pack();
        this.setVisible(true);

    }
}