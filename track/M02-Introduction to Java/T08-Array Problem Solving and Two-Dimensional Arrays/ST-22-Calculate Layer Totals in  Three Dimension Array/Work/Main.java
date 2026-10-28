package track.M02-Introduction to Java.T08-Array Problem Solving and Two-Dimensional Arrays.ST-22-Calculate Layer Totals in  Three Dimension Array.Work;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int layer = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][][] = new int[layer][row][col];

        for(int i=0; i<layer; i++){
            for(int j=0; j<row; j++){
                for(int k=0; k<col; k++){
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        for(int i=0; i<layer; i++){
            int total = 0;
            for(int j=0; j<row; j++){
                for(int k=0; k<col; k++){
                    total += arr[i][j][k];
                }
            }
            System.out.println(total);
        }
    }
}
