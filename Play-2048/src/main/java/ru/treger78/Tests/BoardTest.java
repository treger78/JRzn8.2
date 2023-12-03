package main.java.ru.treger78.Tests;

import main.java.ru.treger78.Board.Board;
import main.java.ru.treger78.Board.SquareBoard;

import static java.util.Arrays.asList;
import static main.java.ru.treger78.Tests.utils.Utils.assertEquals;

public class BoardTest {
    private final static Board board = new SquareBoard(2);

    public static void main(String[] args) {
        board.fillBoard(asList(1,2,3,null));

        if (board.availableSpace().get(0) != board.getKey(1,1)) {
            throw new RuntimeException("availableSpase not work =(");
        }

        if (!board.getKey(0,0).equals(board.getKey(0, 0))) {
            throw new RuntimeException("Keys must be same");
        }

        if (board.getKey(2,2) != null) {
            throw new RuntimeException("Not found key must be null");
        }

        if (board.getValue(board.getKey(1, 1)) != null) {
            throw new RuntimeException("getValue not work =(");
        }

        if (!board.hasValue(null) || !board.hasValue(3)) {
            throw new RuntimeException("hasValue not work =(");
        }

        assertEquals(board.getColumn(0), asList(board.getKey(0,0), board.getKey(1,0)));
        assertEquals(board.getRow(0), asList(board.getKey(0,0), board.getKey(0,1)));
        assertEquals(board.getValues(board.getColumn(0)), asList(1, 3));

        board.fillBoard(asList(5,6,7,8));

        if (!board.availableSpace().isEmpty()) {
            throw new RuntimeException("fillBoard not correct work =(");
        }
    }
}
