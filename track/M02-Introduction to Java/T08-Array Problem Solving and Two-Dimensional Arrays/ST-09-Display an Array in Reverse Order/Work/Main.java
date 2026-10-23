package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-09-Display an Array in Reverse Order.Work;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        // Loop backward from the last index down to 0
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}

