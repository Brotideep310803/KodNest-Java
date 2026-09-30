package track.M02-Introduction to Java.T02-Control Flow and Loops.St-14-Control Flow Practice.Work;

public class Main {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        boolean placementReady = (marks >= 60 && attendance >= 75) ? true : false ;

        if (placementReady) {
            System.out.println("Placement Ready");
        }else{
            System.out.println("Continue Preparation");
        }

        for(int i=1; i<=practiceDays; i++){
            System.out.println("Practice Day: " + i);
        }

    }
}
