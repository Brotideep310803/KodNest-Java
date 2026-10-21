package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-19-Student Result Report.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        for (int index = 0; index < marks.length; index++) {
            marks[index] = scanner.nextInt();
        }

        // Calculate total.
        int total = 0;
        for(int mark: marks){
            total += mark;
        }

        // Calculate average.
        double avg = (total/marks.length);

        // Print total and average.
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        scanner.close();
    }
}
