package track.M02-Introduction to Java.T02-Control Flow and Loops.ST-20-Print a Multiplication Table.Work;

public class Main {
    public static void main(String[] args) {
        int number = 5;

        for(int i=0; i<=5; i++){
            System.out.println(number + " x " + i + " = " +number*i);
        }
    }
}
