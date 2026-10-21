package track.M02-Introduction to Java.T06-Constructor And Constructor Overloading.ST-01 Call Your First Constructor.Work;
class Robot {
    Robot() {
        // Print the message
        System.out.println("Beep beep! Robot reporting!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create one Robot object
        Robot r = new Robot();
    }
}
