package main.java.ru.treger78;

public interface Game {
    public void init();

    public boolean canMove();

    public boolean move(Direction direction);

    public void addItem();

    public Board getGameBoard();

    public boolean hasWin();
}
