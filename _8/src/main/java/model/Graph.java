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

    public Edge pullFirst() {

        Edge edge = edges.get(0);
        edges.remove(0);
        return edge;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }


    public boolean isEmpty() {
        return edges.isEmpty();
    }

    public void extractEdge() {
        Random rand = new Random();
        edges.remove(rand.nextInt(edges.size() - 1) + 1);

    }

}