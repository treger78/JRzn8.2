package main.java.ru.treger78;

import java.util.Arrays;
import java.util.Scanner;

import static main.java.ru.treger78.FullNeighboursChecker.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter field size - rows and columns:");

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        System.out.println("Enter the number of non-empty cells:");

        int fullCells = scanner.nextInt();

        int[][] fullCellsPosition = new int[fullCells][2];

        int fullCellsRowIndex = 0;
        int fullCellsColumnIndex = 1;

        game.generateInitialFullCellsPositions(fullCells, rows, columns, fullCellsPosition,
                fullCellsRowIndex, fullCellsColumnIndex);

        System.out.println("Full cells at: " + Arrays.deepToString(fullCellsPosition));

        Cell[][] field = new Cell[rows][columns];
        Cell[][] tempField = new Cell[rows][columns];

        char emptyCell = '.';
        char fullCell = '*';

        game.fillInitialField(rows, columns, emptyCell, field);

        game.addInitialFullCellsByGeneratedPositions(fullCells, fullCellsPosition, fullCellsRowIndex,
                fullCellsColumnIndex, field, fullCell);

        boolean hasContinue = true;

        while (hasContinue) {
            System.out.println();

            game.printField(field, rows, columns);

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

            game.calculateNextGeneration(field, tempField, rows, columns, fullCell, emptyCell);

            if (game.isWin() || game.isGameOver()) {
                hasContinue = false;

                System.out.println();

                game.printField(field, rows, columns);

                if (game.isGameOver()) {
                    System.out.println("All cells are empty. Game over.");
                } else {
                    System.out.println("You win! The generation repeated the previous state.");
                }
            }
        }
    }
}
