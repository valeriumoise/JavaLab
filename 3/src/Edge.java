public  class Edge {


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

}
