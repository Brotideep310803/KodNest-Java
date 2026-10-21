package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-16-Array Mutation Tracker.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Snapshot: ");
        for(int elm: arr){
            System.out.print(elm + " ");
        }
        System.out.println();
        
        int updateIndex = sc.nextInt();
        int updateValue = sc.nextInt();

        arr[updateIndex] = updateValue;
        System.out.print("Updated: ");
        for(int elm: arr){
            System.out.print(elm + " ");
        }

        sc.close();
    }
}

