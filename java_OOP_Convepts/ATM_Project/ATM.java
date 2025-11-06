import java.util.Scanner;

public class ATM extends OperationMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Welcome to your ATM Account!");
        System.out.print("Enter your Customer Number: ");
        int customerNumber = input.nextInt();
        System.out.print("Enter your PIN: ");
        int pinNumber = input.nextInt();

        if (account.login(customerNumber, pinNumber)) {
            System.out.println("Login Successful!\n");
            OperationMenu menu = new OperationMenu();
            menu.getAccountType();
        } else {
            System.out.println("Invalid Customer Number or PIN. Try again.");
        }

        input.close();
    }
}