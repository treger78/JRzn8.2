package main.java.ru.treger78;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        FullNeighboursChecker fullNeighboursChecker = new FullNeighboursChecker();
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
            fullNeighboursChecker.calculateFullNeighboursCount(rows, columns, field);

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
