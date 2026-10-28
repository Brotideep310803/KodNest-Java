package track.M02-Introduction to Java.T09-String Fundamentals.ST-03-Using String Methods.Work;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String label = sc.nextLine();

        // Clean the label, check the keyword and print the prefix.
        System.out.println(label.trim().toLowerCase());
        System.out.println(label.toLowerCase().contains("backend"));
        System.out.println(label.trim().toLowerCase().substring(0,4));

        sc.close();
    }
}
