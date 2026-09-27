package track.M02-Introduction to Java.T01-Introduction to Java & Basic Programming Construct.St-25-Practice problems Variables,casting, operators.Work;

public class Main {
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyLearningHours = 3;
        int learningDays = 5;

        double progressPercentage = (double) completedTopics * 100 / totalTopics;

        System.out.println("Completed Topics: " + completedTopics);
        System.out.println("Remaining Topics: " + (totalTopics - completedTopics));
        System.out.println("Weekly Learning Hours: " + (dailyLearningHours * learningDays));
        System.out.println("Progress Percentage: " + progressPercentage);
}
