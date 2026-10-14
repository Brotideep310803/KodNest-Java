package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-25-Create Two Simple Overloaded Methods.Work;
import java.util.Scanner;

class Printer {
    void show(int number) {
        // Print the number
        System.out.println("Number: " + number);
    }

    void show(String word) {
        // Print the word
        System.out.println("Word: " + word);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        String Word = sc.nextLine();
        Printer p = new Printer();

        p.show(num);
        p.show(Word);
        sc.close();
    }
}
