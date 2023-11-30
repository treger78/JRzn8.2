package main.java.ru.treger78;

import java.util.List;

public class SquareBoard extends Board {
    int size;

    public SquareBoard(int size) {
        super();
        this.size = size;
    }

    @Override
    public void fillBoard(List<Integer> list) {

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
