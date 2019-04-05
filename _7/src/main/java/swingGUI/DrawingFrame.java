package swingGUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class DrawingFrame extends JFrame {
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private int height = screenSize.height / 2;
    private int width = screenSize.width / 2;
    static Toolbar form;
    private Canvas drawArea;
    private ControlPanel control;

    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == control.resetButton) {
                drawArea.clear();
            } else if (e.getSource() == control.loadButton) {
                try {
                    load();
                } catch (IOException e1) {
                    System.out.println("Fisierul nu exista sau formatul nu este bun.");
                }
            } else if (e.getSource() == control.saveButton) {
                try {
                    save();
                } catch (IOException e1) {
                    System.out.println("Destinatia nu exista sau nu ai drept de salvare.");
                }
            } else if (e.getSource() == form.drawButton) {
                int repeat = Integer.parseInt(form.shapesNo.getText());

                drawArea.drawShapeRandom(repeat);
                repaint();
            }
        }
    };

    public DrawingFrame() {
        super("JAVA Paint");
        rootPane.setBorder(BorderFactory.createTitledBorder("Drawing panel"));
        rootPane.setPreferredSize(new Dimension(width, height));
        init();
        addComponents();
        this.pack();
    }

    private void init() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form = new Toolbar(this);
        drawArea = new Canvas();
        control = new ControlPanel(this);
        form.drawButton.addActionListener(actionListener);
        control.resetButton.addActionListener(actionListener);
        control.saveButton.addActionListener(actionListener);
        control.loadButton.addActionListener(actionListener);
    }

    private void addComponents(){
        add(form, BorderLayout.NORTH);
        add(drawArea, BorderLayout.CENTER);
        add(control, BorderLayout.SOUTH);
    }

    private void save() throws IOException {
        ImageIO.write(drawArea.getImage(), "PNG", new File("lab6_node.png"));
    }

    private void load() throws IOException {
        drawArea.setImage(ImageIO.read(new File("lab6_node.png")));
        repaint();
    }
}