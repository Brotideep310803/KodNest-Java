package track.M02-Introduction to Java.T06-Constructor And Constructor Overloading.ST-17-Create Mobile Plans Using Constructor Overloading.Work;
import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        // Set Basic and 199
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        // Store both received values
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        String planName = scanner.nextLine();
        int price = scanner.nextInt();
        // Create the default plan
        MobilePlan mp1 = new MobilePlan();
        // Create the selected plan
        MobilePlan mp2 = new MobilePlan(planName, price);
        // Display both plans
        mp1.display();
        mp2.display();

        scanner.close();
    }
}
