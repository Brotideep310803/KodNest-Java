package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-Transform Array Values.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n];

        for (int index = 0; index < n; index++) {
            values[index] = scanner.nextInt();
        }

        int bonus = scanner.nextInt();

        // Add bonus to every element.
        for(int i=0; i<n; i++){
            values[i] += bonus;
        }

        // Print the updated array.
        System.out.print("Updated values: ");
        for(int elm: values){
            System.out.print(elm + " ");
        }

        scanner.close();
    }
}
