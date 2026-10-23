package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-03-Find the Smallest and Largest Values.Work;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] ans = new int[2];
        
        // Loop 1: Take inputs and find min/max at the exact same time
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            
            // Initialize on the very first element (i == 0)
            if (i == 0) {
                ans[0] = arr[0]; // min
                ans[1] = arr[0]; // max
            } else {
                // Check for new minimum
                if (ans[0] > arr[i]) {
                    ans[0] = arr[i];
                }
                // Check for new maximum
                if (ans[1] < arr[i]) {
                    ans[1] = arr[i];
                }
            }
        }
        
        // Loop 2: Print the results
        for (int elm : ans) {
            System.out.print(elm + " ");
        }
        
        sc.close(); // Correctly placed inside the main method body
    }
}
