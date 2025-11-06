import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Mortgage Calculator ---");

        double principal = readDouble(scanner, "Enter principal amount (e.g., 100000): ");
        double annualRate = readDouble(scanner, "Enter annual interest rate (percent, e.g., 5 for 5%): ");
        int years = (int) readDouble(scanner, "Enter period in years (e.g., 15): ");

        double monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double monthlyPayment;
        if (numberOfPayments <= 0) {
            System.out.println("Period must be at least 1 month.");
            scanner.close();
            return;
        }

        if (monthlyRate == 0) {
            // No interest loan
            monthlyPayment = principal / numberOfPayments;
        } else {
            double factor = Math.pow(1 + monthlyRate, numberOfPayments);
            monthlyPayment = principal * monthlyRate * factor / (factor - 1);
        }

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("\nMonthly payment: " + currency.format(monthlyPayment));
        System.out.println("Loan summary: principal=" + currency.format(principal) +
                           ", annual rate=" + annualRate + "%, years=" + years);

        scanner.close();
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please try again.");
            }
        }
    }
}