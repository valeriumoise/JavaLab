import model.Board;
import model.Game;
import model.Player;

public class Main {
    public static void main(String args[]) {
        Game game = new Game();
        game.setBoard(new Board(3));
        game.addPlayer(new Player("Player 1",game));
        //game.addPlayer(new Player("Player 2",game));
//        game.addPlayer(new Player("Player 3",game));
//        game.addPlayer(new Player("Player 4",game));
//        game.addPlayer(new Player("Player 5",game));
//        game.addPlayer(new Player("Player 6",game));
//
//        for(int i=10;i<100000;i++)
//            game.addPlayer(new Player("Player "+i,game));

        game.start();

        Player winner = game.getWinner();
        if (winner == null)
            System.out.println("No one won");
        else
            System.out.println(game.getWinner().toString() + " is the winner");
    }
}
