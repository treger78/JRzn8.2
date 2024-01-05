package main.java.ru.treger78;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter field size - rows and columns:");

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        System.out.println("Enter the number of non-empty cells:");

        int fullCells = scanner.nextInt();

        Cell[][] field = new Cell[rows][columns];
        Game game = new Game(fullCells, rows, columns, field);
        FullNeighboursChecker fullNeighboursChecker = new FullNeighboursChecker(field, rows, columns);

        game.generateInitialFullCellsPositions();
        game.fillInitialField();
        game.addInitialFullCellsByGeneratedPositions();

        boolean hasContinue = true;

        while (hasContinue) {
            System.out.println();

            game.printField();

            /**
             * Подсчитываем количество полных ячеек по соседству с каждой ячейкой
             */
            fullNeighboursChecker.calculateFullNeighboursCount();

            game.calculateNextGeneration();

            if (game.isWin() || game.isGameOver()) {
                hasContinue = false;

                System.out.println();

                game.printField();

                if (game.isGameOver()) {
                    System.out.println("All cells are empty. Game over.");
                } else {
                    System.out.println("You win! The generation repeated the previous state.");
                }
            }
        }
    }
}
