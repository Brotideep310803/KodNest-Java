package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-15-Cinema Seat Analyzer.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int freeSeat = 0;

        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                arr[r][c] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == 0){
                    freeSeat++;
                }
            }
        }

        System.out.println("Available seats: " + freeSeat);
    }
}
