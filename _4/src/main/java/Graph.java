public class Graph {

    private String name;
    private String description;
    private String imagePath;
    private String tgfPath;

    public Graph(){

    }

    public Graph(String name, String imagePath, String tgfPath) {
        this.name = name;
        this.imagePath = imagePath;
        this.tgfPath = tgfPath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getTgfPath() {
        return tgfPath;
    }

    public void setTgfPath(String tgfPath) {
        this.tgfPath = tgfPath;
    }
}
