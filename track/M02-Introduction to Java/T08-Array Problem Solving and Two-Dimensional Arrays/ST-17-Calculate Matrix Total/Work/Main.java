package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-17-Calculate Matrix Total.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int r=0; r<row; r++){
            int total = 0;
            for(int c=0; c<col; c++){
                total += arr[r][c];
            }
            System.out.println("Row " + (r+1) + " " + "total: " + total);
        }
    }
}
