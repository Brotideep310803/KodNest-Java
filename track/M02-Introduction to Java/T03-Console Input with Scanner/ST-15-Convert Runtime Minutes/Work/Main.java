package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-16-Console Input with Scanner Revision.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutes = sc.nextInt();

        int hrsCount = minutes/60;
        int minCount = minutes%60;

        System.out.println("Hours: " + hrsCount);
        System.out.println("Minutes: " + minCount);

        sc.close();
    }
}
