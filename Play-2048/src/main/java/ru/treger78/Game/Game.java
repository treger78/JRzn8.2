package main.java.ru.treger78.Game;

import main.java.ru.treger78.Board.Board;
import main.java.ru.treger78.Direction.Direction;

public interface Game {
    public void init();

    public boolean canMove();

    public boolean move(Direction direction);

    public void addItem();

    public Board getGameBoard();

    public boolean hasWin();
}
