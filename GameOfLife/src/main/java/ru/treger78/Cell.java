package main.java.ru.treger78;

public class Cell {
    private boolean isFullNow;
    private int fullNeighboursCount;
    private char symbol;

    public Cell(char symbol) {
        this.symbol = symbol;
        this.isFullNow = false;
        this.fullNeighboursCount = 0;
    }

    public boolean isFullNow() {
        return this.isFullNow;
    }

    public void setFullNow(boolean isFullNow) {
        this.isFullNow = isFullNow;
    }

    public int getFullNeighboursCount() {
        return this.fullNeighboursCount;
    }

    public void setFullNeighboursCount(int fullNeighboursCount) {
        this.fullNeighboursCount = fullNeighboursCount;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
