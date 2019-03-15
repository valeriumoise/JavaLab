import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

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

    }

    public void open(String graphName){

    }

    public void save(String fileName){

    }

    public void load(String fileName){

    }

}
