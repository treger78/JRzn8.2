package main.java.ru.treger78;

import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Board {
    int weight;
    int height;
    Map<Key, Integer> board = new HashMap<>();
    public Board(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public abstract void fillBoard(List<Integer> list);

    public abstract List<Key> avaiableSpace();

    public abstract void addItem(Key key, Integer value);
}
