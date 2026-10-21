package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-06-Store Three Marks.Work;
import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);

        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[1]);
    }
}

