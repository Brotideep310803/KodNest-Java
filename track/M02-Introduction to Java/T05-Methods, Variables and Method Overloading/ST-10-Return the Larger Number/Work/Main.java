package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-10-Return the Larger Number.Work;
import java.util.Scanner;

class NumberUtility {
    int getLarger(int first, int second) {
        // Return larger number
        if(first>second){
            return first;
        }else{
            return second;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        NumberUtility num = new NumberUtility();
        // Call method
        int result = num.getLarger(first, second);
        // Print result
        System.out.println(result);
    }
}
