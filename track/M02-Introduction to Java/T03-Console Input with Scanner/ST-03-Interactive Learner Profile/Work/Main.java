package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-03-Interactive Learner Profile.Work;
import java.uitl.Scanner;

public class Main {
    public static void main(String[] args) {
        // Read and display the profile
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        int solvedProblems = sc.nextInt();
        double assessmentPercentage = sc.nextDouble();

        System.out.println("Learner: " + firstName);
        System.out.println("Problem solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);

        sc.close();
    }
}
