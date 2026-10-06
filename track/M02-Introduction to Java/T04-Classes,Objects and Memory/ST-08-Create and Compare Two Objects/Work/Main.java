package track.M02-Introduction to Java.T04-Classes,Objects and Memory.ST-08-Create and Compare Two Objects.Work;
import java.util.*;

class Student {
    int id;
    String name;
    int javaScore;
}

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Create and populate the first Student object
    Student s1 = new Student();
    s1.id = sc.nextInt();
    sc.nextLine();
    s1.name = sc.nextLine();
    s1.javaScore = sc.nextInt();

    // Create and populate the second Student object
    Student s2 = new Student();
    s2.id = sc.nextInt();
    sc.nextLine();
    s2.name = sc.nextLine();
    s2.javaScore = sc.nextInt();

    // Display both records
    System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
    System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

    // Compare both scores and print one result
    if(s1.javaScore > s2.javaScore){
        System.out.println(s1.name + " has the higher Java score.");
    }else if(s2.javaScore > s1.javaScore){
        System.out.println(s2.name + " has the higher Java score.");
    }else{
        System.out.println("Both students have the same Java score.");
    }
}

}
