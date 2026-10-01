package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-11-Calculate a Runtime Product Bill.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read product name
        String pName = scanner.nextLine();
        // Read price
        double price = scanner.nextDouble();
        // Read quantity
        int qt = scanner.nextInt();

        // Calculate and print the total
        double total = (price*qt);

        System.out.println("Product: " +pName);
        System.out.println("Total: " +total);

        scanner.close();
    }
}
