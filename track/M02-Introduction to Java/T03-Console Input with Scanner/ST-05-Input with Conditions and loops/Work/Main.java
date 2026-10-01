package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-05-Input with Conditions and loops.Work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        int total = 0;

        for(int i=0; i<=days; i++){
            int problems = sc.nextInt();
            total += problems;
        }

        String status = "";

        if(total >= 20){
            status = "Strong progress";
        }else if(total <= 19 && total >= 10){
            status = "Keep improving";
        }else{
            status = "Needs more practice";
        }

        System.out.println("Total solved: " + total);
        System.out.println("Status: " + status);

        sc.close();
    }
}
