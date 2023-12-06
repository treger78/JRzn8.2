package main.java.ru.treger78.Board;

import main.java.ru.treger78.Key.Key;

import java.util.List;

public class SquareBoard extends Board {
    public SquareBoard(int size) {
        super(size, size);
    }

    //Заполняем поле элементами из list, если нужно задать пустой элемент, указываем null
    @Override
    public void fillBoard(List<Integer> list) {
        for (int i = 0; i < board.size(); i += 1) {
            for (int j = 0; j < board.size(); j += 1) {
                //addItem();
            }
        }
    }

    //Возвращает все ключи, у которых значение null
    @Override
    public List<Key> availableSpace() {
        return null;
    }

    //Добавляет элемент value по ключу key
    @Override
    public void addItem(Key key, Integer value) {
        board.put(key, value);
    }

    //Ищем уже существующий ключ по координатам
    @Override
    public Key getKey(int i, int j) {
        return new Key(i ,j);
    }

    //Получаем значение по key
    @Override
    public Integer getValue(Key key) {
        return null;
    }

    //Получаем столбец ключей по которым потом можно выбрать значения
    @Override
    public List<Key> getColumn(int j) {
        return null;
    }

    //Аналогично для строчки
    @Override
    public List<Key> getRow(int i) {
        return null;
    }

    //Проверяем есть ли такое значение на поле
    @Override
    public boolean hasValue(Integer value) {
        return false;
    }

    //Получаем строчку значений по строке ключей
    @Override
    public List<Integer> getValues(List<Key> keys) {
        return null;
    }
}
