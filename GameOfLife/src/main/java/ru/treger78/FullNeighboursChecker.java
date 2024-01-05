package main.java.ru.treger78;

public class FullNeighboursChecker {
    private final Cell[][] field;
    private final int rows;
    private final int columns;
    public FullNeighboursChecker(Cell[][] field, int rows, int columns) {
        this.field = field;
        this.rows = rows;
        this.columns = columns;
    }

    private void checkLeftTopCornerNeighbours(int i, int j) {
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

    private void checkRightTopCornerNeighbours(int i, int j) {
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

    private void checkLeftBottomCornerNeighbours(int i, int j) {
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

    private void checkRightBottomCornerNeighbours(int i, int j) {
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

    private void checkTopWallNeighbours(int i, int j) {
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

    private void checkLeftWallNeighbours(int i, int j) {
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

    private void checkRightWallNeighbours(int i, int j) {
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

    private void checkBottomWallNeighbours(int i, int j) {
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

    private void checkCellNeighbours(int i, int j) {
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

    public void calculateFullNeighboursCount() {
        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                if (i == 0 && j == 0) {
                    this.checkLeftTopCornerNeighbours(i, j);

                    continue;
                }

                if (i == 0 && j == columns - 1) {
                    this.checkRightTopCornerNeighbours(i, j);

                    continue;
                }

                if (i == rows - 1 && j == 0) {
                    this.checkLeftBottomCornerNeighbours(i, j);

                    continue;
                }

                if (i == rows - 1 && j == columns - 1) {
                    this.checkRightBottomCornerNeighbours(i, j);

                    continue;
                }

                if (i == 0) {
                    this.checkTopWallNeighbours(i, j);

                    continue;
                }

                if (j == 0) {
                    this.checkLeftWallNeighbours(i, j);

                    continue;
                }

                if (j == columns - 1) {
                    this.checkRightWallNeighbours(i, j);

                    continue;
                }

                if (i == rows - 1) {
                    this.checkBottomWallNeighbours(i, j);

                    continue;
                }

                checkCellNeighbours(i, j);
            }
        }
    }
}
