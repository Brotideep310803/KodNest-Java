package track.M02-Introduction to Java.T06-Constructor And Constructor Overloading.ST-19-Chain Constructors to Initialize a Product.Work;
import java.util.Scanner;
class Product {
    String name;
    double price;
    Product() {
        // chain to the parameterized constructor
        this("Unknown", 0.0);
    }
    Product(String name, double price) {
        // store values
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println(name + " " + price);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        Product defaultProduct = new Product();
        Product product = new Product(name, price);
        defaultProduct.display();
        product.display();
        scanner.close();
    }
}

