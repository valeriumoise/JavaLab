package model;

public class Player implements Runnable{
    private String name;
    private Game game;
    private Graph graph;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Game game, Graph graph) {
        this.name = name;
        this.game = game;
        this.graph = graph;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    private boolean play() throws InterruptedException {
        Board board = game.getBoard();
        if (board.isEmpty()) { return false; }
        graph.addEdge( board.extract() );
        Thread.sleep(THINKING_TIME); //declare this constant
        if (graph.isSpanningTree()) {
            game.setWinner(this);
        }
        return true;
    }

    public void run() {
        this.graph.extractEdge();
        System.out.println(this.toString() + " extracted an edge...");
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    private final static int THINKING_TIME = 2000;


}
