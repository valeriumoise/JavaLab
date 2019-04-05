package model;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

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

    public boolean isSpanningTree(){
        int n = edges.size();
        int visited[] = new int[n];
        boolean isSpanningTree;

        for(int i=0; i<n; i++){
            if (visited[i]!=1)
                return false;
        }
        return true;
    }

    private void DFSUtil(int v, int visited[]){
        visited[v]++;

        List<Edge> currentNodeEdges = getCurrentNodeEdges(v);

        currentNodeEdges.forEach(edge -> {
            int dest = edge.getDestination();
            if (visited[dest]!=0)
                DFSUtil(dest,visited);
        });

    }

    private List<Edge> getCurrentNodeEdges(int v) {
        return edges.stream()
                .filter(edges -> edges.getSource() == v)
                .collect(Collectors.toList());
    }

    public void DFS(int v,int visited[]){
        int n = edges.size();
        DFSUtil(n,visited);
    }
}
