package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-06-Add Two Numbers Using Parameters.Work;

import java.util.Scanner;

class Calculator {
    int add(int first, int second) {
        // Return sum
        return (first+second);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        Calculator c = new Calculator();
        // Call add()
        int ans = c.add(first, second);
        // Print returned sum
        System.out.println(ans);
    }
}
