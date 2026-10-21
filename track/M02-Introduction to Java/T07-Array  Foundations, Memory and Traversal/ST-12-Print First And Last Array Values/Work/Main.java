package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-12-Print First And Last Array Values.Work;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[0] + " " + arr[arr.length-1]);
    }
}

