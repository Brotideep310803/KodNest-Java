package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-02-Find Array Statistics.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
        sc.close();
    }
}
