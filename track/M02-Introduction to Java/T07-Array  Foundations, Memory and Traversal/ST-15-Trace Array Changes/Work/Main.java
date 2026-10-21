package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-15-Trace Array Changes.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] original = new int[size];
        for(int i = 0; i < size; i++){
            original[i] = sc.nextInt();
        }

        int updateIndex = sc.nextInt();
        int updatedValue = sc.nextInt();
        int requestedIndex = sc.nextInt();

        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        for(int i = 0; i < original.length; i++){
            snapshot[i] = original[i];
        }

        int[] liveView = original;
        // Update through liveView.
        liveView[updateIndex] = updatedValue;

        // Display original, snapshot and the reference comparison.
        System.out.print("Original: ");
        for(int i = 0; i < original.length; i++){
            System.out.print(original[i] + " ");
        }

        System.out.println();
        System.out.print("Snapshot: ");
        for(int elm: snapshot){
            System.out.print(elm + " ");
        }

        System.out.println();

        boolean sameObject = (original == liveView);

        System.out.println("Same object: " + sameObject);

        // Validate requestedIndex before accessing original.
        if(requestedIndex < original.length && requestedIndex >= 0){
            System.out.println("Requested value: " + original[requestedIndex]);
        }else{
            System.out.println("Requested value: Invalid index");
        }

        sc.close();
    }
}
