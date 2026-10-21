package track.M02-Introduction to Java.T06-Constructor And Constructor Overloading.ST-02 Observe Automatic Constructor Execution.Work;
class Welcome {
    // write the constructor
    Welcome(){
        System.out.println("Object Created");
    }
}

public class Main {
    public static void main(String[] args) {
        // create one object
        Welcome w = new Welcome();
    }
}

