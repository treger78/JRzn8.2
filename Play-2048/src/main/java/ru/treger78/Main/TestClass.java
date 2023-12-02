package main.java.ru.treger78.Main;

import main.java.ru.treger78.Board.Board;
import main.java.ru.treger78.Board.SquareBoard;
import main.java.ru.treger78.Game.Game;
import main.java.ru.treger78.Game.Game2048;

public class TestClass {
    public static void main(String[] args) {
        Board board = new SquareBoard(4);

        Game game2048 = new Game2048(board);

        System.out.println(game2048.canMove());
    }
}
