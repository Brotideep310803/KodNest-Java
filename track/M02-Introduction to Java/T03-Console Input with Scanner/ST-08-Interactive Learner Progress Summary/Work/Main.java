package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-08-Interactive Learner Progress Summary.Work;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Read the learner details
String name = scanner.nextLine();
int numberOfPracticeDays = scanner.nextInt();
int total = 0;
// Calculate and display the progress summary
for(int i=1; i<=numberOfPracticeDays; i++){
    int dailySolvedProblems = scanner.nextInt();
    total += dailySolvedProblems;
}
double average = total/numberOfPracticeDays;
String status = "";

if(average >= 5.0){
    status = "Consistent";
}else{
    status = "Needs consistency";
}

System.out.println("Learner: " + name);
System.out.println("Total solved: " + total);
System.out.println("Daily average: " + average);
System.out.println("Status: " + status);

scanner.close();
    }
}
