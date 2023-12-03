package main.java.ru.treger78.Board;

import main.java.ru.treger78.Key.Key;

import java.util.List;

public class SquareBoard extends Board {
    public SquareBoard(int size) {
        super(size, size);
    }

    @Override
    public void fillBoard(List<Integer> list) {
        for (int i = 0; i < board.size(); i += 1) {
            for (int j = 0; j < board.size(); j += 1) {
                //addItem();
            }
        }
    }

    @Override
    public List<Key> availableSpace() {
        return null;
    }

    @Override
    public void addItem(Key key, Integer value) {

    }

    @Override
    public Key getKey(int i, int j) {
        return null;
    }

    @Override
    public Integer getValue(Key key) {
        return null;
    }

    @Override
    public List<Key> getColumn(int j) {
        return null;
    }

    @Override
    public List<Key> getRow(int i) {
        return null;
    }

    @Override
    public boolean hasValue(Integer value) {
        return false;
    }

    @Override
    public List<Integer> getValues(List<Key> keys) {
        return null;
    }
}
