package graph;

public class Edge {


    private Node startingNode;
    private Node endingNode;

    private boolean isTwoWay;

    private int cost;

    public Edge(Node startingNode, Node endingNode, int cost) {
        this.startingNode = startingNode;
        this.endingNode = endingNode;
        this.cost = cost;
        this.isTwoWay = true;
    }

    public Edge(Node startingNode, Node endingNode, int cost, boolean isTwoWay) {
        this.startingNode = startingNode;
        this.endingNode = endingNode;
        this.isTwoWay = isTwoWay;
        this.cost = cost;
    }

    public Node getStartingNode() {
        return startingNode;
    }

    public void setStartingNode(Node startingNode) {
        this.startingNode = startingNode;
    }

    public Node getEndingNode() {
        return endingNode;
    }

    public void setEndingNode(Node endingNode) {
        this.endingNode = endingNode;
    }

    public boolean isTwoWay() {
        return isTwoWay;
    }

    public void setTwoWay(boolean twoWay) {
        isTwoWay = twoWay;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
