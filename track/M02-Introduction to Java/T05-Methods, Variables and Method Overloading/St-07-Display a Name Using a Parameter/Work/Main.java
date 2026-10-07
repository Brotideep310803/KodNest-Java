package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.St-07-Display a Name Using a Parameter.Work;

import java.util.Scanner;

class StudentUtility {
    void displayName(String name) {
        // Print student name
        System.out.println("Student: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        // Create object
        StudentUtility std = new StudentUtility();
        // Call displayName()
        std.displayName(name);
    }
}

