package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-19-Array Problem Solving Checkpoint.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int row = sc.nextInt();
        int col = sc.nextInt();
        int ar[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        int arrayTotal = 0;
        int matrixTotal = 0;
        for(int elm: arr){
            arrayTotal += elm;
        }

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                matrixTotal += ar[r][c];
            }
        }

        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);
    }
}
