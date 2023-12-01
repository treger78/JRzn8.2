package main.java.ru.treger78;

public class FullNeighboursChecker {
    public static void checkLeftTopCornerNeighbours(Cell[][] field, int i, int j) {
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

    public static void checkRightTopCornerNeighbours(Cell[][] field, int i, int j) {
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

    public static void checkLeftBottomCornerNeighbours(Cell[][] field, int i, int j) {
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

    public static void checkRightBottomCornerNeighbours(Cell[][] field, int i, int j) {
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

    public static void checkTopWallNeighbours(Cell[][] field, int i, int j) {
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

    public static void checkLeftWallNeighbours(Cell[][] field, int i, int j) {
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

    public static void checkRightWallNeighbours(Cell[][] field, int i, int j) {
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

    public static void checkBottomWallNeighbours(Cell[][] field, int i, int j) {
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

    public static void checkCellNeighbours(Cell[][] field, int i, int j) {
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
