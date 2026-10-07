package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-08-Use All Four Method Types.Work;

import java.util.Scanner;

class MethodPractice {
    void showTitle() {
        System.out.println("Method Practice");
    }

    void showName(String name) {
        System.out.println("Name: " + name);
    }

    int getPassingMark() {
        return 40;
    }

    int calculateTotal(int first, int second) {
        return (first+second);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object and call all methods
        MethodPractice mp = new MethodPractice();

        mp.showTitle();
        mp.showName(name);
        System.out.println("Passing Mark: " + mp.getPassingMark());
        System.out.println("Total: " + mp.calculateTotal(first, second));
    }
}

