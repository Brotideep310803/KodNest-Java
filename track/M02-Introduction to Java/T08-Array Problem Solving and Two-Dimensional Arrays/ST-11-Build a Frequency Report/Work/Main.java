package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-11-Build a Frequency Report.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        int freq = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                freq++;
            }
        }
        
        System.out.print("Frequency of " + target + ": " + freq);
        
        sc.close();
    }
}
