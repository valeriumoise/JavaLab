package swingGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Canvas extends JPanel {

    private BufferedImage image;
    private Graphics2D graphics;
    private int currentMouseX, currentMouseY;

    public Canvas() {
        this.setBorder(BorderFactory.createTitledBorder("Drawing paper:"));
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                currentMouseX = e.getX();
                currentMouseY = e.getY();
                if (graphics != null) {
                    int radius = Integer.parseInt(DrawingFrame.form.shapesRadius.getText());

                    drawShapeAt(currentMouseX, currentMouseY, radius);
                    repaint();
                }
            }
        });
    }

    protected void paintComponent(Graphics g) {
        if (image == null) {
            image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
            graphics = image.createGraphics();
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            clear();
        }
        g.drawImage(image, 0, 0, null);
    }

    public void clear() {
        graphics.setPaint(Color.white);
        graphics.fillRect(0, 0, 800, 600);
        graphics.setPaint(Color.black);
        repaint();
    }

    public void drawShapeAt(int x, int y, int radius) {
        Random rand = new Random();
        graphics.setColor(new Color(rand.nextInt(0xFFFFFF)));

        graphics.fillOval(x - (radius / 2), y - (radius / 2), radius, radius);
    }

    public void drawShapeRandom(int repeatNo) {
        while (repeatNo > 0) {
            Random rand = new Random();
            graphics.setColor(new Color(rand.nextInt(0xFFFFFF)));
            int random_x = rand.nextInt(getWidth() - 5);
            int random_y = rand.nextInt(getHeight() - 20);
            int random_radius = rand.nextInt(18 - 5) + 6;
            int random_circle_radius = rand.nextInt(50 - 5) + 6;

            graphics.fillOval(random_x, random_y, random_circle_radius, random_circle_radius);
            repeatNo--;
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
        graphics = image.createGraphics();
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    }

}
