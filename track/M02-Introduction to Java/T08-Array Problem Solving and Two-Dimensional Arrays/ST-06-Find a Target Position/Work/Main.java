package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-06-Find a Target Position.Work;
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
        for(int i=0; i<size; i++){
            if(arr[i] == target){
                System.out.println(i);
                return;
            }
        }
        
        System.out.println("-1");
        sc.close();
    }
}
