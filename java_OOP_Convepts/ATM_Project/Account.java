import java.util.HashMap;
import java.util.Map;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    // Map to simulate a database of users
    private static Map<Integer, Integer> customerData = new HashMap<>();

    static {
        // Preload with some sample data (customerNumber -> PIN)
        customerData.put(12345, 1111);
        customerData.put(67890, 2222);
    }

    public boolean login(int customerNumber, int pinNumber) {
        if (customerData.containsKey(customerNumber) && customerData.get(customerNumber) == pinNumber) {
            this.customerNumber = customerNumber;
            this.pinNumber = pinNumber;
            return true;
        }
        return false;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void depositChecking(double amount) {
        if (amount > 0) checkingBalance += amount;
    }

    public void withdrawChecking(double amount) {
        if (amount > 0 && amount <= checkingBalance) checkingBalance -= amount;
        else System.out.println("Insufficient funds!");
    }

    public void depositSaving(double amount) {
        if (amount > 0) savingBalance += amount;
    }

    public void withdrawSaving(double amount) {
        if (amount > 0 && amount <= savingBalance) savingBalance -= amount;
        else System.out.println("Insufficient funds!");
    }
}