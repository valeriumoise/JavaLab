package model;

public class Graph {

    private String name;
    private String description;
    private String imagePath;
    private String tgfPath;

    /**
     * Default constructor
     */
    public Graph(){

    }

    /**
     * Constructor for a new graph
     * @param name graph name
     * @param imagePath graph image path
     * @param tgfPath graph tgf path ( details )
     */
    public Graph(String name, String imagePath, String tgfPath) {
        this.name = name;
        this.imagePath = imagePath;
        this.tgfPath = tgfPath;
    }

    /**
     * Getter for description
     * @return graph description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the graph description
     * @param description graph description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get graph name
     * @return graph name
     */
    public String getName() {
        return name;
    }

    /**
     * Set graph name
     * @param name graph name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get graph image path
     * @return image path
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Set graph image path
     * @param imagePath image path
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * Get the tgf (details) of the graph
     * @return the  path to the tgf for the graph
     */
    public String getTgfPath() {
        return tgfPath;
    }

    /**
     * Set the path for the tgf (details) of the graph
     * @param tgfPath the path for the tgf of the graph
     */
    public void setTgfPath(String tgfPath) {
        this.tgfPath = tgfPath;
    }


    @Override
    public String toString() {
        return "Graph{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", tgfPath='" + tgfPath + '\'' +
                '}';
    }
}
