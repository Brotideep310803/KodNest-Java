package track.M02-Introduction to Java.T03-Console Input with Scanner.ST-06-Personal Expense Calculator.Work;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Read income and expenses
double monthlyIncome = scanner.nextDouble();
double rentExpense = scanner.nextDouble();
double foodExpense = scanner.nextDouble();
double travelExpense = scanner.nextDouble();

// Calculate and display the budget details
double totalExpense = rentExpense + foodExpense + travelExpense;
double remainingAmount = monthlyIncome - totalExpense;

String status;

if (remainingAmount >= 0) {
    status = "Within budget";
} else {
    status = "Over budget";
}

System.out.println("Total expense: " + totalExpense);
System.out.println("Remaining: " + remainingAmount);
System.out.println("Status: " + status);

scanner.close();
    }
}
