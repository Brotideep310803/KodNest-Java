package track.M02-Introduction to Java.T06-Constructor And Constructor Overloading.ST-04-Create Default Course.Work;
class Course {
    String name;

    Course() {
        // assign Java
        this.name = "Java";
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        // create object
        Course c = new Course();
        // print name
    }
}

