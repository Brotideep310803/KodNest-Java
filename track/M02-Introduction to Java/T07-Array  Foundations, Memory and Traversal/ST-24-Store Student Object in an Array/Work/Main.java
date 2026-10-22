package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-24-Store Student Object in an Array.Work;
import java.util.*;

class Student{
    String name;

    Student(String name){
        this.name = name;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[2];
        String sName1 = sc.nextLine();
        String sName2 = sc.nextLine();
        s[0] = new Student(sName1);
        s[1] = new Student(sName2);

        System.out.println(s[0].name);
        System.out.println(s[1].name);

        sc.close();
    }
}
