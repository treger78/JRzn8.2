package main.java.ru.treger78;

public class Cell {
    private boolean isFullNow = false;
    private boolean isWillBeFull = false;
    private int fullNeighboursCount = 0;
    private char symbol;

    public Cell(char symbol) {
        this.symbol = symbol;
    }

    public boolean isFullNow() {
        return this.isFullNow;
    }

    public void setFullNow(boolean isFullNow) {
        this.isFullNow = isFullNow;
    }

    public boolean isWillBeFull() {
        return this.isWillBeFull;
    }

    public void setWillBeFull(boolean isWillBeFull) {
        this.isWillBeFull = isWillBeFull;
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
