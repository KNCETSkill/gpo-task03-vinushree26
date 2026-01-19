import java.util.Scanner;

public class SmartBalanceChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double balance = sc.nextDouble();

            if (balance < 0) {
                System.out.print("Error: Invalid balance entered.");
            } else if (balance < 1000) {
                System.out.print("Alert! Your balance is lo.");
            } else {
                System.out.print("Your balance is sufficient.");
            }

        } catch (Exception e) {
            System.out.print("Error: Please enter a valid number.");
        }

        sc.close();
    }
}

