package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-05-Search for a Target.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int[] numbers = new int[size];
        
        // read array
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        // read target
        int target = sc.nextInt();
        // search
        for(int elm: numbers){
            if(elm == target){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
        
        sc.close();
    }
}

