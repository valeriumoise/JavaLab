package ui;

import javax.swing.*;

public class ControlPanel extends JPanel {
    private final CatalogFrame frame;
    private JButton loadBtn = new JButton("Load");
//	...
    public ControlPanel(CatalogFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        add(loadBtn);
        this.setVisible(true);
    }
}