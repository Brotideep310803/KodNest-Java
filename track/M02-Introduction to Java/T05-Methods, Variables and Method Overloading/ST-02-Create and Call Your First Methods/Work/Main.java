package track.M02-Introduction to Java.T05-Methods, Variables and Method Overloading.ST-02-Create and Call Your First Methods;


class Robot {
    void speak(){
        System.out.println("Beep beep! Java is my superpower");
    }
}


public class Main {
public static void main(String[] args) {
    Robot r = new Robot();

    r.speak();
}
    
}