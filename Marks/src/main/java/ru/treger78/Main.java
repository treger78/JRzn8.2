package main.java.ru.treger78;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int markQuantity = scanner.nextInt();

        int[] marks = new int[markQuantity];

        int fives = 0;
        int fours = 0;
        int threes = 0;
        int twos = 0;

        for (int i = 0; i < markQuantity; i += 1) {
            marks[i] = scanner.nextInt();

            if (marks[i] == 5) { fives++; }
            if (marks[i] == 4) { fours++; }
            if (marks[i] == 3) { threes++; }
            if (marks[i] == 2) { twos++; }
        }

        System.out.println(fives + " " + fours + " " + threes + " " + twos);
    }
}
