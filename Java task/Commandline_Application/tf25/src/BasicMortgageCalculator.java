// MortgageCalculator.java
import java.util.Scanner;
import java.text.NumberFormat;

public class BasicMortgageCalculator {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Simple Mortgage Calculator ---");

        // Reading user input
        System.out.print("Enter loan principal amount: ");
        int principal = scanner.nextInt();

        System.out.print("Enter annual interest rate (e.g., 5 for 5%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter loan period in years: ");
        int years = scanner.nextInt();

        // Core calculations for monthly payment
        double monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double factor = Math.pow(1 + monthlyRate, numberOfPayments);
        double monthlyPayment = principal * (monthlyRate * factor) / (factor - 1);

        // Formatting the output
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedPayment = currency.format(monthlyPayment);

        System.out.println("\nEstimated Monthly Payment: " + formattedPayment);
        System.out.println("Principal: " + currency.format(principal));
        System.out.println("Annual Interest Rate: " + annualRate + "%");
        System.out.println("Period: " + years + " years");

        scanner.close();
    }
}