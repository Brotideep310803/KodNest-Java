package track.M02-Introduction to Java.T04-Classes,Objects and Memory.ST-14-Learner Profile Object System.Work;
import java.util.*;

class Learner{
    int id;
    String name;
    int javaScore;
}

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Create and populate the first Learner object
    Learner firstLearner = new Learner();
    firstLearner.id = sc.nextInt();
    sc.nextLine();
    firstLearner.name = sc.nextLine();
    firstLearner.javaScore = sc.nextInt();
    
    // Create and populate the second Learner object
    Learner secondLearner = new Learner();
    secondLearner.id = sc.nextInt();
    sc.nextLine();
    secondLearner.name = sc.nextLine();
    secondLearner.javaScore = sc.nextInt();
    
    // Read the new score
    
    
    // Display both records before the update
    System.out.println("Before Update");
    System.out.println(firstLearner.id + " - " + firstLearner.name + " - " + firstLearner.javaScore);
    System.out.println(secondLearner.id + " - " + secondLearner.name + " - " + secondLearner.javaScore);
    
    // Update only the first object
    firstLearner.javaScore = sc.nextInt();
    
    // Display both records after the update
    System.out.println("After Update");
    System.out.println(firstLearner.id + " - " + firstLearner.name + " - " + firstLearner.javaScore);
    System.out.println(secondLearner.id + " - " + secondLearner.name + " - " + secondLearner.javaScore);

    sc.close();
}

}
