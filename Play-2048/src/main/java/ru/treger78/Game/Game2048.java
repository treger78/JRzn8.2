package main.java.ru.treger78.Game;

import main.java.ru.treger78.Board.Board;
import main.java.ru.treger78.Direction.Direction;

import java.util.Random;

public class Game2048 implements Game {
    private GameHelper helper = new GameHelper();
    private Random random = new Random();

    private Board board;

    public Game2048(Board board) {
        this.board = board;
    }

    @Override
    public void init() {

    }

    @Override
    public boolean canMove() {
        return false;
    }

    @Override
    public boolean move(Direction direction) {
        return false;
    }

    @Override
    public void addItem() {

    }

    @Override
    public Board getGameBoard() {
        return null;
    }

    @Override
    public boolean hasWin() {
        return false;
    }
}
