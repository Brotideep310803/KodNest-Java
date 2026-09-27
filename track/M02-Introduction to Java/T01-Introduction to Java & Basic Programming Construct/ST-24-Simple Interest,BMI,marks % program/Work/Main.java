package track.M02-Introduction to Java.T01-Introduction to Java & Basic Programming Construct.ST-24-Simple Interest,BMI,marks % program.Work;

public class Main {
    public static void main(String[] args) {
        double principal = 10000.0;
        float rate = 6.5f;
        float time = 2.0f;

        double weight = 72.0;
        double height = 1.8;

        int sub1 = 78;
        int sub2 = 84;
        int sub3 = 69;
        int sub4 = 91;
        int sub5 = 88;

        double SI = principal * rate * time / 100;
        double totalAmount = principal + SI;

        double BMI = weight / (height * height);

        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = totalMarks * 100.0 / 500;

        System.out.println("Simple Interest: " + SI);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("BMI: " + BMI);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
    }
}
