package main.java.ru.treger78.Game;

import main.java.ru.treger78.Board.Board;
import main.java.ru.treger78.Direction.Direction;

import java.util.Random;

public class Game2048 implements Game {
    private GameHelper helper = new GameHelper();
    private Random random = new Random();

    private Board board;

    public Game2048(Board board) {
        this.board = board;
    }

    //Инициирует начало игры
    @Override
    public void init() {

    }

    //Проверяет возможно ли сделать ход
    @Override
    public boolean canMove() {
        return false;
    }

    //Делает ход в направлении
    @Override
    public boolean move(Direction direction) {
        return false;
    }

    //Добавляет новый элемент в игру
    @Override
    public void addItem() {

    }

    //Получение игрового поля
    @Override
    public Board getGameBoard() {
        return null;
    }

    //Случилось ли событие победы
    @Override
    public boolean hasWin() {
        return false;
    }
}
