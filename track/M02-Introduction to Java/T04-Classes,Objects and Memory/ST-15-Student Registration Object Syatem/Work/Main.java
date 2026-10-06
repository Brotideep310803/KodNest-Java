package track.M02-Introduction to Java.T04-Classes,Objects and Memory.ST-15-Student Registration Object Syatem.Work;
import java.util.Scanner;

class Student {
    // Declare registrationId, name and attendancePercentage
    int regId;
    String name;
    double attendance;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create and populate firstStudent
        Student s1 = new Student();
        s1.regId = sc.nextInt();
        sc.nextLine();
        s1.name = sc.nextLine();
        s1.attendance = sc.nextDouble();
        
        // Create and populate secondStudent
        Student s2 = new Student();
        s2.regId = sc.nextInt();
        sc.nextLine();
        s2.name = sc.nextLine();
        s2.attendance = sc.nextDouble();
        
        // Read the selected ID and new attendance
        int id = sc.nextInt();
        double newAttendance = sc.nextDouble();
        sc.nextLine();
        
        Student selectedStudent;
        
        // Make selectedStudent refer to the matching existing object
        if(id == s1.regId){
            selectedStudent = s1;
        }else if(id == s2.regId){
            selectedStudent = s2;
        }else{
            selectedStudent = null;
        }
        
        // Update attendance if a match was found
        if(selectedStudent != null) {
            selectedStudent.attendance = newAttendance;
        }
        
        // Display both records
        if(selectedStudent == null){
            System.out.println("Student not found");
        }else{
            System.out.println("Selected Student: " + selectedStudent.name);
        }        
        System.out.println(s1.regId + " - " + s1.name + " - " + s1.attendance);
        System.out.println(s2.regId + " - " + s2.name + " - " + s2.attendance);

        sc.close();
    }
}
