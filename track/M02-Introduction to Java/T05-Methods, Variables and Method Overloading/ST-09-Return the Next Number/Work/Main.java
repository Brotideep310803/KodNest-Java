package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-09-Return the Next Number.Work;
import java.util.*;

class NumberUtility{
    int getNextNumber(int number){
        return  number+1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        NumberUtility num = new NumberUtility();

        int result = num.getNextNumber(number);

        System.out.println(result);
    }
}
