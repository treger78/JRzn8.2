package main.java.ru.treger78;

public class Cell {
    private boolean isFullNow;
    private boolean isWillBeFull;
    private int fullNeighboursCount = 0;
    private char symbol;

    public Cell(boolean isFullNow, char symbol) {
        this.isFullNow = isFullNow;
        this.symbol = symbol;
    }

    public boolean isFullNow() {
        return isFullNow;
    }

    public void setFullNow(boolean fullNow) {
        isFullNow = fullNow;
    }

    public boolean isWillBeFull() {
        return isWillBeFull;
    }

    public void setWillBeFull(boolean willBeFull) {
        isWillBeFull = willBeFull;
    }

    public int getFullNeighboursCount() {
        return fullNeighboursCount;
    }

    public void setFullNeighboursCount(int fullNeighboursCount) {
        this.fullNeighboursCount = fullNeighboursCount;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
