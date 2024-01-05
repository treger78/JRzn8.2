package main.java.ru.treger78;

public class FullNeighboursChecker {
    private void checkLeftTopCornerNeighbours(Cell[][] field, int i, int j) {
        if (field[i][j + 1].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }

        if (field[i + 1][j + 1].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }

        if (field[i + 1][j].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }
    }

    private void checkRightTopCornerNeighbours(Cell[][] field, int i, int j) {
        if (field[i][j - 1].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }

        if (field[i + 1][j].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }

        if (field[i + 1][j - 1].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }
    }

    private void checkLeftBottomCornerNeighbours(Cell[][] field, int i, int j) {
        if (field[i - 1][j].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }

        if (field[i - 1][j + 1].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }

        if (field[i][j + 1].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }
    }

    private void checkRightBottomCornerNeighbours(Cell[][] field, int i, int j) {
        if (field[i - 1][j - 1].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }

        if (field[i - 1][j].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }

        if (field[i][j - 1].isFullNow()) {
            field[i][j].setFullNeighboursCount(field[i][j].getFullNeighboursCount() + 1);
        }
    }

    private void checkTopWallNeighbours(Cell[][] field, int i, int j) {
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
    }

    private void checkLeftWallNeighbours(Cell[][] field, int i, int j) {
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
    }

    private void checkRightWallNeighbours(Cell[][] field, int i, int j) {
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
    }

    private void checkBottomWallNeighbours(Cell[][] field, int i, int j) {
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
    }

    private void checkCellNeighbours(Cell[][] field, int i, int j) {
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

    public void calculateFullNeighboursCount(int rows, int columns, Cell[][] field) {
        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                if (i == 0 && j == 0) {
                    this.checkLeftTopCornerNeighbours(field, i, j);

                    continue;
                }

                if (i == 0 && j == columns - 1) {
                    this.checkRightTopCornerNeighbours(field, i, j);

                    continue;
                }

                if (i == rows - 1 && j == 0) {
                    this.checkLeftBottomCornerNeighbours(field, i, j);

                    continue;
                }

                if (i == rows - 1 && j == columns - 1) {
                    this.checkRightBottomCornerNeighbours(field, i, j);

                    continue;
                }

                if (i == 0) {
                    this.checkTopWallNeighbours(field, i, j);

                    continue;
                }

                if (j == 0) {
                    this.checkLeftWallNeighbours(field, i, j);

                    continue;
                }

                if (j == columns - 1) {
                    this.checkRightWallNeighbours(field, i, j);

                    continue;
                }

                if (i == rows - 1) {
                    this.checkBottomWallNeighbours(field, i, j);

                    continue;
                }

                checkCellNeighbours(field, i, j);
            }
        }
    }
}
