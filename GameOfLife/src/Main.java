import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter field size - width and height:");

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        System.out.println("Enter the number of non-empty cells:");

        int fullCells = scanner.nextInt();

        HashMap<Integer, Integer> fullCellsPosition = new HashMap<>();

        for (int i = 0; i < fullCells; i += 1) {
            int randomWidth = ThreadLocalRandom.current().nextInt(0, width);
            int randomHeight = ThreadLocalRandom.current().nextInt(0, height);

            fullCellsPosition.put(randomWidth, randomHeight);
        }

        char[][] field = new char[width][height];

        char dot = 46; //symbol . = 46;
        char star = 42; //symbol * = 42;

        for (int i = 0; i < width; i += 1) {
            for (int j = 0; j < height; j += 1) {
                if (fullCellsPosition.containsKey(i) && fullCellsPosition.get(i) == j) {
                    field[i][j] = star;
                } else {
                    field[i][j] = dot;
                }
            }
        }

        for (int i = 0; i < field.length; i += 1) {
            System.out.println(Arrays.toString(field[i]));
        }
    }
}
