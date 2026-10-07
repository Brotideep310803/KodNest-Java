package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-11-Calculate Rectangle Area Using a Method.Work;
import java.util.Scanner;

class Rectangle {
    int calculateArea(int length, int breadth) {
        // Return area
        return (length*breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();

        // Create object
        Rectangle r = new Rectangle();
        // Call calculateArea()
        int area = r.calculateArea(length, breadth);
        // Print area
        System.out.println("Area: " + area);
    }
}
