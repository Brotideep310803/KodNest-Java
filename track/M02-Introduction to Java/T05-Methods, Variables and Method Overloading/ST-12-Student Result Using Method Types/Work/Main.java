package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-12-Student Result Using Method Types.Work;
import java.util.Scanner;

class StudentResult {
    void showTitle() {
        System.out.println("Student Result");
    }

    void displayName(String name) {
        System.out.println("Name: " + name);
    }

    int getPassingMark() {
        return 40;
    }

    int calculateAverage(int first, int second) {
        return (first+second)/2;
    }
}


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        StudentResult student = new StudentResult();
        // Call methods
        student.showTitle();
        student.displayName(name);
        // Print returned values
        System.out.println("Passing Mark: " + student.getPassingMark());
        System.out.println("Average: " + student.calculateAverage(first, second));
    }
}

