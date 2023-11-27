import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter field size - rows and columns:");

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        System.out.println("Enter the number of non-empty cells:");

        int fullCells = scanner.nextInt();

        int[][] fullCellsPosition = new int[fullCells][2];

        int fullCellsRowIndex = 0;
        int fullCellsColumnIndex = 1;

        for (int i = 0; i < fullCells; i += 1) {
            int randomRow = ThreadLocalRandom.current().nextInt(0, rows);
            int randomColumn = ThreadLocalRandom.current().nextInt(0, columns);

            fullCellsPosition[i][fullCellsRowIndex] = randomRow;
            fullCellsPosition[i][fullCellsColumnIndex] = randomColumn;
        }

        System.out.println("Full cells at: " + Arrays.deepToString(fullCellsPosition));

        char[][] field = new char[rows][columns];

        char dot = 46; //symbol . = 46;
        char star = 42; //symbol * = 42;

        for (int i = 0; i < rows; i += 1) {
            for (int j = 0; j < columns; j += 1) {
                field[i][j] = dot;
            }
        }

        for (int i = 0;  i < fullCells; i += 1) {
            int x = fullCellsPosition[i][fullCellsRowIndex];
            int y = fullCellsPosition[i][fullCellsColumnIndex];

            field[x][y] = star;
        }

        for (int i = 0; i < field.length; i += 1) {
            System.out.println(Arrays.toString(field[i]));
        }
    }
}
