package model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private final List<Player> players = new ArrayList<>();
    private Player winner;

    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }
    //Create getters and setters

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }


    //Create the method that will start the game: start one thread for each player
    public void startGame() {
        // TODO: code this
    }

    public void setWinner(Player player) {
        this.winner = player;
    }

    public void start() {

    }
}
