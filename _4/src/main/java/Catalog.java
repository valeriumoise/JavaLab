import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Catalog implements Serializable {

    List<Graph> graphList = new LinkedList<Graph>();
    String path;

    public Catalog(String path) {
        this.path = path;
    }

    public void add (Graph graph){

    }

    public void open(String graphName){

    }

}
