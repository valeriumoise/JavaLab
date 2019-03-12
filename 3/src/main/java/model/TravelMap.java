package model;

import graph.Edge;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class TravelMap {

    private ArrayList<Node> nodes = new ArrayList<>();
    private ArrayList<Edge> edges = new ArrayList<>();

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    /**
     * Default constructor for model.TravelMap
     */
    public TravelMap(){ }

    /**
     * method for adding an edge to the travel map
     * @param node1 starting node of the edge
     * @param node2 ending node of the edge
     * @param cost the cost of the edge
     */
    public void addEdge(Node node1, Node node2, int cost)
    {
        Edge temporaryEdge = new Edge(node1, node2, cost);

        edges.add(temporaryEdge);
    }

    /**
     * method for adding either a oneWay or a twoWay edge
     * @param node1 Starting graph.Edge
     * @param node2 Ending graph.Edge
     * @param cost the cost of the edge
     * @param isTwoWay true if it is a twoWay edge false if it is a oneWay edge
     */
    public void addEdge(Node node1, Node node2, int cost, boolean isTwoWay)
    {
        Edge temporaryEdge = new Edge(node1, node2, cost, isTwoWay);

        edges.add(temporaryEdge);
    }

    public void addNode(Node node)
    {
        nodes.add(node);
    }
    /**
     * Getter for nodes
     * @return a string containing all  of nodes
     */
    public String getNodesToString()
    {

        String allNodes = "";
        for (Node node : nodes)
        {
            allNodes += " " + node.getName() + ", ";
        }

        return allNodes;

    }

    public List<Node> getNodes(){
        return this.nodes;
    }

    /**
     * Getter for edges
     * @return a list for edges
     */
    public ArrayList<Edge> getEdges() {
        return edges;
    }


    @Override
    public String toString() {
        return "model.TravelMap{" +
                "nodes=" + nodes +
                ", edges=" + edges +
                '}';
    }
}
