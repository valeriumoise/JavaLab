import java.util.ArrayList;

public class TravelMap {

    private ArrayList<Node> nodes;
    private ArrayList<Edge> edges;

    /**
     * Default constructor for TravelMap
     */
    public TravelMap(){
        nodes= new ArrayList<Node>();
        edges= new ArrayList<Edge>();
    }

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
     * @param node1 Starting Edge
     * @param node2 Ending Edge
     * @param cost the cost of the edge
     * @param isTwoWay true if it is a twoWay edge false if it is a oneWay edge
     */
    public void addEdge(Node node1, Node node2, int cost, boolean isTwoWay)
    {
        Edge temporaryEdge = new Edge(node1, node2, cost, isTwoWay);

        edges.add(temporaryEdge);
    }

    /**
     * Getter for nodes
     * @return a string containing all  of nodes
     */
    public String getNodes()
    {

        StringBuilder stringBuilder = new StringBuilder();

        for (Node node : nodes)
        {
            stringBuilder.append( " " + node.getName() + ", ");
        }

        return stringBuilder.toString();

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
        return "TravelMap{" +
                "nodes=" + nodes +
                ", edges=" + edges +
                '}';
    }
}
