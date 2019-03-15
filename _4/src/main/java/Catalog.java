import java.awt.*;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.awt.Desktop;
import java.util.Objects;

public class Catalog implements Serializable {

    private List<Graph> graphList = new LinkedList<Graph>();
    private String path;

    public Catalog(String path) {
        this.path = path;
    }

    public List<Graph> getGraphList() {
        return graphList;
    }

    public void setGraphList(List<Graph> graphList) {
        this.graphList = graphList;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void add (Graph graph){
        graphList.add(graph);
    }

    public void open(String graphName){
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(new File(graphName));
        } catch (IOException e) {
            System.out.println("No file found having this name. Please retry.");
            e.printStackTrace();
        }
    }

    public void list(){
        graphList.forEach(graph -> System.out.println(graph.toString()));
    }

}
