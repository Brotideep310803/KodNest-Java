package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-08-Reverse an Array.Work;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        // Two-pointer swap logic
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        // Print reversed array
        for(int elm: arr){
            System.out.print(elm + " ");
        }
        
        sc.close();
    }
}
