package main.java.ru.treger78;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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

        //Генерируем координаты полных ячеек
        for (int i = 0; i < fullCells; i += 1) {
            int randomRow = ThreadLocalRandom.current().nextInt(0, rows);
            int randomColumn = ThreadLocalRandom.current().nextInt(0, columns);

            fullCellsPosition[i][fullCellsRowIndex] = randomRow;
            fullCellsPosition[i][fullCellsColumnIndex] = randomColumn;
        }

        System.out.println("Full cells at: " + Arrays.deepToString(fullCellsPosition));

        Cell[][] field = new Cell[rows][columns];

        char emptyCell = '.';
        char fullCell = '*';

        //Инициализируем поле, заполняя его пустыми ячейками
        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                Cell cell = new Cell(false, emptyCell);

                field[i][j] = cell;
            }
        }

        //Добавляем на поле полные ячейки по сгенерированным ранее координатам
        for (int i = 0;  i < fullCells; i += 1) {
            int x = fullCellsPosition[i][fullCellsRowIndex];
            int y = fullCellsPosition[i][fullCellsColumnIndex];

            field[x][y].setFullNow(true);
            field[x][y].setSymbol(fullCell);
        }

        boolean isWin = false;
        boolean isGameOver = false;

        while (!isWin || !isGameOver) {
            System.out.println();

            //Выводим получившееся поле на экран
            for (int i = 0; i < rows; i += 1) {
                for (int j = 0; j < columns; j += 1) {
                    System.out.print(field[i][j].getSymbol());
                }

                System.out.println();
            }

            //Подсчитываем количество полных ячеек по соседству с каждой ячейкой
            for (int i = 0; i < rows; i += 1) {
                for (int j = 0; j < columns; j += 1) {
                    if (i == 0 && j == 0) {
                        if (field[i][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        continue;
                    }

                    if (i == 0 && j == columns - 1) {
                        if (field[i][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        continue;
                    }

                    if (i == rows - 1 && j == 0) {
                        if (field[i - 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i - 1][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        continue;
                    }

                    if (i == rows - 1 && j == columns - 1) {
                        if (field[i - 1][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i - 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        continue;
                    }

                    if (i == 0) {
                        if (field[i][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        continue;
                    }

                    if (j == 0) {
                        if (field[i - 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i - 1][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        continue;
                    }

                    if (j == columns - 1) {
                        if (field[i - 1][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i - 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i + 1][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        continue;
                    }

                    if (i == rows - 1) {
                        if (field[i - 1][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i - 1][j].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i - 1][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i][j + 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        if (field[i][j - 1].isFullNow()) {
                            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                        }

                        continue;
                    }

                    if (field[i - 1][j - 1].isFullNow()) {
                        field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                    }

                    if (field[i - 1][j].isFullNow()) {
                        field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                    }

                    if (field[i - 1][j + 1].isFullNow()) {
                        field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                    }

                    if (field[i][j - 1].isFullNow()) {
                        field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                    }

                    if (field[i][j + 1].isFullNow()) {
                        field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                    }

                    if (field[i + 1][j + 1].isFullNow()) {
                        field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                    }

                    if (field[i + 1][j].isFullNow()) {
                        field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                    }

                    if (field[i + 1][j - 1].isFullNow()) {
                        field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
                    }
                }
            }

            //Определяем будет ли ячейка полной или пустой в следующей генерации
            for (int i = 0; i < rows; i += 1) {
                for (int j = 0; j < columns; j += 1) {
                    if (!field[i][j].isFullNow() && field[i][j].getFullNeighboursCount() == 3) {
                        field[i][j].setSymbol(fullCell);

                        continue;
                    }

                    if (field[i][j].isFullNow() && (field[i][j].getFullNeighboursCount() < 2 ||
                            field[i][j].getFullNeighboursCount() > 3)) {
                        field[i][j].setSymbol(emptyCell);
                    }
                }
            }
        }
    }
}
