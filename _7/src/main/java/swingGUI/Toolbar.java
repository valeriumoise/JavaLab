package swingGUI;

import javax.swing.*;
import java.awt.*;

public class Toolbar extends JPanel {
    private Integer[] sidesNo = { 0, 3, 4, 5, 6, 7, 8 };

    private JLabel shapeNoLabel = new JLabel("Shapes number: ");
    private JLabel radiusLabel = new JLabel("Radius: ");

    JTextField shapesNo = new JFormattedTextField();
    JTextField shapesRadius = new JFormattedTextField();

    JButton drawButton = new JButton("Draw");

    public Toolbar(DrawingFrame frame) {
        this.setBorder(BorderFactory.createTitledBorder("Toolbar"));
        init();
        this.setLayout(new GridLayout(2,4, 20, 0));
    }

    private void init() {

        shapesRadius.setText("5");
        shapesNo.setText("1");

        add(shapeNoLabel);
        add(radiusLabel);
        add(drawButton);

        add(shapesNo);
        add(shapesRadius);
    }

}