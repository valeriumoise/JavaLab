package model;

import java.util.List;
import java.util.Random;

public class Graph {
    List<Edge> edges;

    public Graph(List<Edge> edges) {
        this.edges = edges;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public void extractEdge() {
        Random rand = new Random();
        edges.remove(rand.nextInt(edges.size()-1)+1);
    }
}
