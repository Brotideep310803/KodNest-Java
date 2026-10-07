package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-05-Send a Number to a Method and Return it.Work;

import java.util.Scanner;

class NumberUtility {
    int getValue(int number) {
        // Return number
        return number;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Create object
        NumberUtility num = new NumberUtility();
        // Pass number to the method
        int ans = num.getValue(number);
        // Print returned value
        System.out.println(ans);
    }
}

