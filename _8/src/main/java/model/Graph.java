package model;

import java.util.List;

public class Graph {
    List<Edge> edges;

    public Graph(List<Edge> edges) {
        this.edges = edges;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public Edge pullFirst(){

        Edge edge = edges.get(0);

        return edge;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public void addEdge(Edge edge){
        edges.add(edge);
    }

    public boolean isEmpty(){
        return edges.isEmpty();
    }
}
