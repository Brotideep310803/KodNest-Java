package track.M02-Introduction to Java.T02-Control Flow and Loops.ST-15-Check Positive or Negative.Work;

public class Main {
    public static void main(String[] args) {
        int number = -8;

        if(number<0){
            System.out.println("Negative");
        }else if(number>0){
            System.out.println("Positive");
        }else{
            System.out.println("Zero");
        }
    }
}
