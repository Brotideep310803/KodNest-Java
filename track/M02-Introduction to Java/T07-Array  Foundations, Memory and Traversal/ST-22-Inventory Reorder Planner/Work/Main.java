package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-22-Inventory Reorder Planner.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] stock = new int[n];

        for (int index = 0; index < n; index++) {
            stock[index] = scanner.nextInt();
        }

        int reorderLevel = scanner.nextInt();

        // Count values that are less than or equal to reorderLevel.
        int count = 0;
        for(int elm: stock){
            if(elm<=reorderLevel){
                count++;
            }
        }

        // Print the result.
        System.out.println("Items to reorder: " + count);

        scanner.close();
    }
}
