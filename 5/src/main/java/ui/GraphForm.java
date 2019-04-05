package ui;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GraphForm extends JPanel {
    private final CatalogFrame frame;
    private JLabel titleLabel;
    private JTextField titleField;
    private JLabel verticesLabel;
    private JSpinner verticesField;
    private JLabel typeLabel;
    private JRadioButton directedRadioButton;
    private JRadioButton undiretedRadioButton;
    private JLabel pathToDefinitionFileLabel;
    private JFileChooser pathToDefinitionFileChooser;
    private JLabel pathToImageFile;
    private JFileChooser pathToImageFileChooser;



    public GraphForm(CatalogFrame frame) {
        this.frame = frame;
        titleLabel = new JLabel("Name of the graph");
        titleField = new JTextField();
        verticesLabel = new JLabel("Number of vertices");
        verticesField = new JSpinner(new SpinnerNumberModel(500, 0,1000,1));
        typeLabel = new JLabel("Graph type");
        directedRadioButton = new JRadioButton("Directed");
        undiretedRadioButton = new JRadioButton("Undirected");
        pathToDefinitionFileLabel = new JLabel("Choose the definition file");
        pathToDefinitionFileChooser = new JFileChooser();
        pathToImageFile = new JLabel("Choose de image file");
        pathToImageFileChooser = new JFileChooser();
    }

    //    ...
    private void init() {
        frame.getContentPane().add(BorderLayout.LINE_START,titleLabel);
        frame.getContentPane().add(BorderLayout.LINE_END,titleField);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
//        addButton.addActionListener(...);
    }
    private void addGraph() {
//        frame.list.addGraph(...);
    }
}