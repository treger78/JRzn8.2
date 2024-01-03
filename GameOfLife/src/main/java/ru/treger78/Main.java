package main.java.ru.treger78;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static main.java.ru.treger78.FullNeighboursChecker.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter field size - rows and columns:");

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        System.out.println("Enter the number of non-empty cells:");

        int fullCells = scanner.nextInt();

        int[][] fullCellsPosition = new int[fullCells][2];

        int fullCellsRowIndex = 0;
        int fullCellsColumnIndex = 1;

        generateInitialFullCellsPositions(fullCells, rows, columns, fullCellsPosition,
                fullCellsRowIndex, fullCellsColumnIndex);

        System.out.println("Full cells at: " + Arrays.deepToString(fullCellsPosition));

        Cell[][] field = new Cell[rows][columns];

        char emptyCell = '.';
        char fullCell = '*';

        fillInitialField(rows, columns, emptyCell, field);

        addInitialFullCellsByGeneratedPositions(fullCells, fullCellsPosition, fullCellsRowIndex,
                fullCellsColumnIndex, field, fullCell);

        boolean isWin = false; //Если следующее состояние повторяет текущее
        boolean isGameOver = false; //Если не осталось ни одной полной ячейки

        while (!isWin || !isGameOver) {
            System.out.println();

            printField(field, rows, columns);

            /**
             * Подсчитываем количество полных ячеек по соседству с каждой ячейкой
             */
            for (int i = 0; i < rows; i += 1) {
                for (int j = 0; j < columns; j += 1) {
                    if (i == 0 && j == 0) {
                        checkLeftTopCornerNeighbours(field, i, j);

                        continue;
                    }

                    if (i == 0 && j == columns - 1) {
                        checkRightTopCornerNeighbours(field, i, j);

                        continue;
                    }

                    if (i == rows - 1 && j == 0) {
                        checkLeftBottomCornerNeighbours(field, i, j);

                        continue;
                    }

                    if (i == rows - 1 && j == columns - 1) {
                        checkRightBottomCornerNeighbours(field, i, j);

                        continue;
                    }

                    if (i == 0) {
                        checkTopWallNeighbours(field, i, j);

                        continue;
                    }

                    if (j == 0) {
                        checkLeftWallNeighbours(field, i, j);

                        continue;
                    }

                    if (j == columns - 1) {
                        checkRightWallNeighbours(field, i, j);

                        continue;
                    }

                    if (i == rows - 1) {
                        checkBottomWallNeighbours(field, i, j);

                        continue;
                    }

                    checkCellNeighbours(field, i, j);
                }
            }

            calculateNextGeneration(field, rows, columns, fullCell, emptyCell);
        }
    }

    private static void generateInitialFullCellsPositions(int fullCells, int rows, int columns,
                                                  int[][] fullCellsPosition, int fullCellsRowIndex,
                                                  int fullCellsColumnIndex) {
        for (int i = 0; i < fullCells; i += 1) {
            int randomRow = ThreadLocalRandom.current().nextInt(0, rows);
            int randomColumn = ThreadLocalRandom.current().nextInt(0, columns);

            fullCellsPosition[i][fullCellsRowIndex] = randomRow;
            fullCellsPosition[i][fullCellsColumnIndex] = randomColumn;
        }
    }

    private static void fillInitialField(int rows, int columns, char emptyCell, Cell[][] field) {
        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                field[i][j] = new Cell(emptyCell);
            }
        }
    }

    private static void addInitialFullCellsByGeneratedPositions(int fullCells, int[][] fullCellsPosition,
                                                         int fullCellsRowIndex, int fullCellsColumnIndex,
                                                         Cell[][] field, char fullCell) {
        for (int i = 0;  i < fullCells; i += 1) {
            int x = fullCellsPosition[i][fullCellsRowIndex];
            int y = fullCellsPosition[i][fullCellsColumnIndex];

            field[x][y].setFullNow(true);
            field[x][y].setSymbol(fullCell);
        }
    }

    private static void printField(Cell[][] field, int rows, int columns) {
        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                System.out.print(field[i][j].getSymbol());
            }

            System.out.println();
        }
    }

    private static void calculateNextGeneration(Cell[][] field, int rows, int columns, char fullCell, char emptyCell) {
        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                if (!field[i][j].isFullNow() && field[i][j].getFullNeighboursCount() == 3) {
                    field[i][j].setWillBeFull(true);
                }

                if (field[i][j].isFullNow() && (field[i][j].getFullNeighboursCount() < 2 ||
                        field[i][j].getFullNeighboursCount() > 3)) {
                    field[i][j].setWillBeFull(false);
                }

                field[i][j].setFullNeighboursCount(0);
            }
        }

        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                if (field[i][j].isWillBeFull()) {
                    field[i][j].setSymbol(fullCell);
                } else {
                    field[i][j].setSymbol(emptyCell);
                }
            }
        }
    }
}
