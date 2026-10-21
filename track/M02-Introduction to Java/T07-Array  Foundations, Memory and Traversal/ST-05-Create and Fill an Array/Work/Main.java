package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-05-Create and Fill an Array.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        // read and store values
        for(int i=0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        // print values
        for(int elm: numbers){
            System.out.print(elm + " ");
        }

        scanner.close();
    }
}
