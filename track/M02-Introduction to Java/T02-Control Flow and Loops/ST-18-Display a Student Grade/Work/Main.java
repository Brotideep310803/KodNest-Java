package track.M02-Introduction to Java.T02-Control Flow and Loops.ST-18-Display a Student Grade.Work;

public class Main {
    public static void main(String[] args) {
        int marks = 76;

        if(marks >= 80){
            System.out.println("Grade: A");
        }else if(marks >= 60 && marks <= 79){
            System.out.println("Grade: B");
        }else if(marks >= 40 && marks <= 59){
            System.out.println("Grade: C");
        }else{
            System.out.println("Fail");
        }
    }
}
