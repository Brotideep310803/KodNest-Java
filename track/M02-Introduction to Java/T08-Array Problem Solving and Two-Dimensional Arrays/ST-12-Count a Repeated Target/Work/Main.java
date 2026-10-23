package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-12-Count a Repeated Target.Work;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        int count = 0;
        
        // Clean and optimized for-each loop
        for(int elm: arr){
            if(elm == target){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
