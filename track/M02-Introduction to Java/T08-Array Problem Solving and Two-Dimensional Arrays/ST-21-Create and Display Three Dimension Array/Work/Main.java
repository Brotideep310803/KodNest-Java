package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-21-Create and Display Three Dimension Array.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int layers = scanner.nextInt();
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][][] values = new int[layers][rows][columns];

        // read values
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    values[i][j][k] = scanner.nextInt();
                }
            }
        }

        // display layer by layer
        for (int i = 0; i < layers; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    System.out.print(values[i][j][k] + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
