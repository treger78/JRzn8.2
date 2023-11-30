package main.java.ru.treger78;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        String[][] hall = new String[rows][seats];

        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < seats; j += 1) {
                hall[i][j] = "S";
            }
        }

        int totalSeats = seats * rows;

        if (totalSeats <= 60) {
            System.out.println("price = 100rub");
        }

        int interestedRow = scanner.nextInt();
        int interestedSeat = scanner.nextInt();

        if (totalSeats > 60) {
            if (interestedRow <= rows / 2) {
                System.out.println("price = 200rub");
            } else {
                System.out.println("price = 100rub");
            }
        }
    }
}
