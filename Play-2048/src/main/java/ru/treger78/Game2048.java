package main.java.ru.treger78;

import java.util.Random;

public class Game2048 implements Game {
    GameHelper helper = new GameHelper();

    Board board;

    public Game2048(Board board) {
        this.board = board;
    }

    Random random = new Random();

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
