package track.M02-Introduction to Java.T04-Classes,Objects and Memory.ST-06-Create and Display a Student Object.Work;
import java.util.Scanner;

class Student {
    // Declare id, name, course and javaScore
    int id;
    String name;
    String course;
    double javaScore;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create one Student object
        Student std = new Student();

        // Read and store all values in the object
        std.id = sc.nextInt();
        sc.nextLine();

        std.name = sc.nextLine();

        std.course = sc.nextLine();
        std.javaScore = sc.nextDouble();

        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " + std.id);
        System.out.println("Name: " + std.name);
        System.out.println("Course: " + std.course);
        System.out.println("Java Score: " + std.javaScore);

        sc.close();
    }
}
