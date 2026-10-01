package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-09-Read and Add Two Numbers.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println("Sum: " + (first+second));

        sc.close();
    }
}
