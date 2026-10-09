package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-15-Use Instance,Parameter and Local Variable;
import java.util.Scanner;

class Student {
    int mark;

    void showFinalMark(int bonus) {
        // Create finalMark
        // Calculate mark + bonus
        int finalMark = mark + bonus;
        // Print mark
        System.out.println(mark);
        // Print finalMark
        System.out.println(finalMark);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.mark = sc.nextInt();
        int bonus = sc.nextInt();

        student.showFinalMark(bonus);
        sc.close();
    }
}
