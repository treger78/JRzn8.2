package main.java.ru.treger78;

public class Main {
    public static void main(String[] args) {
        Board board = new SquareBoard(4);

        Game game2048 = new Game2048(board);

        System.out.println(game2048.canMove());
    }
}