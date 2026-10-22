package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-21-Analyze Runtime Data.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] readings = new int[5];

        for (int index = 0; index < readings.length; index++) {
            readings[index] = scanner.nextInt();
        }

        // Calculate and print the total.
        int total = 0;
        for(int elm: readings){
            total += elm;
        }

        System.out.println("Total: " + total);

        scanner.close();
    }
}

