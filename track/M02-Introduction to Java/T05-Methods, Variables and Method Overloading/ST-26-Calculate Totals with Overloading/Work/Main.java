package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-26-Calculate Totals with Overloading.Work;
import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        // Return the total of two marks
        
        return (first+second);
    }

    int getTotal(int first, int second, int third) {
        // Return the total of three marks
        return (first+second+third);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read three marks
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        // Create one ResultCalculator object
        ResultCalculator rc = new ResultCalculator();
        // Call both overloaded methods and print both totals
        System.out.println("Two-Mark Total: " + rc.getTotal(m1, m2));
        System.out.println("Three-Mark Total: " + rc.getTotal(m1, m2, m3));

    }
}
