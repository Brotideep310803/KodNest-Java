package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-17-FIx Local Variable Scope.Work;
import java.util.Scanner;

class Result {
    void show(int mark) {
        // Declare message in the correct place
        String res;
        if (mark >= 60) {
            // Store "Eligible"
            res = "Eligible";
        } else {
            // Store "Keep Practising"
            res = "Keep Practising";
        }
        // Print message
        System.out.println(res);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        Result result = new Result();
        result.show(mark);
        scanner.close();
    }
}
