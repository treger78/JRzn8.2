package main.java.ru.treger78;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private boolean isWin; //Если следующее состояние повторяет текущее
    private boolean isGameOver; //Если не осталось ни одной полной ячейки
    private final char emptyCell = '.';
    private final char fullCell = '*';
    private final int fullCells;
    private final int rows;
    private final int columns;
    private final int[][] fullCellsPosition;
    private final int fullCellsRowIndex = 0;
    private final int fullCellsColumnIndex = 1;
    private final Cell[][] field;
    private final Cell[][] tempField;

    public Game(int fullCells, int rows, int columns, Cell[][] field) {
        this.isWin = false;
        this.isGameOver = false;
        this.fullCells = fullCells;
        this.rows = rows;
        this.columns = columns;
        this.fullCellsPosition = new int[fullCells][2];
        this.field = field;
        this.tempField = new Cell[rows][columns];
    }

    public boolean isWin() {
        return this.isWin;
    }

    public boolean isGameOver() {
        return this.isGameOver;
    }

    public void generateInitialFullCellsPositions() {
        for (int i = 0; i < fullCells; i += 1) {
            int randomRow = ThreadLocalRandom.current().nextInt(0, rows);
            int randomColumn = ThreadLocalRandom.current().nextInt(0, columns);

            fullCellsPosition[i][fullCellsRowIndex] = randomRow;
            fullCellsPosition[i][fullCellsColumnIndex] = randomColumn;
        }

        System.out.println("Full cells at: " + Arrays.deepToString(fullCellsPosition));
    }

    public void fillInitialField() {
        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                field[i][j] = new Cell(emptyCell);
            }
        }
    }

    public void addInitialFullCellsByGeneratedPositions() {
        for (int i = 0;  i < fullCells; i += 1) {
            int x = fullCellsPosition[i][fullCellsRowIndex];
            int y = fullCellsPosition[i][fullCellsColumnIndex];

            field[x][y].setFullNow(true);
            field[x][y].setSymbol(fullCell);
        }
    }

    public void printField() {
        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                System.out.print(field[i][j].getSymbol());
            }

            System.out.println();
        }
    }

    public void calculateNextGeneration() {
        boolean hasFullCell = false; // if false => isGameOver = true
        boolean hasDifferentState = false; // if false => isWin = true

        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                if (
                        (!field[i][j].isFullNow() && field[i][j].getFullNeighboursCount() == 3) ||
                                (field[i][j].isFullNow() && (field[i][j].getFullNeighboursCount() == 2 ||
                                        field[i][j].getFullNeighboursCount() == 3))
                ) {
                    tempField[i][j] = new Cell(fullCell);
                    tempField[i][j].setFullNow(true);
                } else {
                    tempField[i][j] = new Cell(emptyCell);
                    tempField[i][j].setFullNow(false);
                }

                if (!hasFullCell && tempField[i][j].isFullNow()) {
                    hasFullCell = true; // if true => isGameOver = false
                }

                if (!hasDifferentState && (field[i][j].isFullNow() != tempField[i][j].isFullNow())) {
                    hasDifferentState = true; // if true => isWin = false
                }
            }
        }

        if (!hasFullCell) { this.isGameOver = true; } // if false => isGameOver = true

        if (!hasDifferentState) { this.isWin = true; } // if false => isWin = true

        for (int i = 0; i < rows; i += 1) {
            System.arraycopy(tempField[i], 0, field[i], 0, columns);
        }
    }
}
