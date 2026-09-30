package track.M02-Introduction to Java.T02-Control Flow and Loops.ST-17-Find the Larger Number.Work;

public class Main {
    public static void main(String[] args) {
        int first = 25;
        int second = 40;

        if(first<second){
            System.out.println("Larger: " + second);
        }else if(second<first){
            System.out.println("Larger: " + first);
        }else{
            System.out.println("Equal");
        }
    }
}
