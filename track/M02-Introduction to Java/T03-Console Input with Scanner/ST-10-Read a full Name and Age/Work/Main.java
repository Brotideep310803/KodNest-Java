package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-10-Read a full Name and Age.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();

    }
}
