package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-14-Read a Complete Address.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String address = sc.nextLine();

        System.out.println("Address: " + address);

        sc.close();

    }
}
