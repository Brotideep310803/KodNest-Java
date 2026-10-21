package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-13-Read a Selected Array Position.Work;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        System.out.println(arr[index]);
    }
}

