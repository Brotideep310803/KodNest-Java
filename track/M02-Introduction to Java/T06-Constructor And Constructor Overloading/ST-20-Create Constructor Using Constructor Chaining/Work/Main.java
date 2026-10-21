package track.M02-Introduction to Java.T06-Constructor And Constructor Overloading.ST-20-Create Constructor Using Constructor Chaining.Work;
import java.util.*;
class Course{
    String name;
    int duration;
    Course(){
        this("Java",30);
    }
    Course(String name,int duration){
        this.name = name;
        this.duration = duration;
    }
    public void display(){
        System.out.println(name + " " +duration);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int duration = sc.nextInt();
        Course C2 = new Course();
        Course C1 = new Course(name, duration);
        C2.display();
        C1.display();
        sc.close();
    }
}
