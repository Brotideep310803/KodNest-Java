package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-04-Return a Number from a Method.Work;

class NumberUtility {
    int getNumber() {
        // Return 10
        return 10;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create object
        NumberUtility num = new NumberUtility();
        // Call getNumber()
        int ans = num.getNumber();
        // Print returned value
        System.out.println(ans);
    }
}

