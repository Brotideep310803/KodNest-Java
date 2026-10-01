package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-13-Calculate Student Total Marks.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();

        System.out.println("Student: " + name);
        System.out.println("Total: " + (m1+m2));

        sc.close();
    }
}
