import java.util.Scanner;

public class OperationMenu extends Account {
    private Scanner menuInput = new Scanner(System.in);

    public void getAccountType() {
        System.out.println("Select the Account you want to Access: ");
        System.out.println(" Type 1 - Checking Account");
        System.out.println(" Type 2 - Saving Account");
        System.out.println(" Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice, try again.\n");
                getAccountType();
        }
    }

    private void getChecking() {
        System.out.println("Checking Account:");
        System.out.println(" 1 - View Balance");
        System.out.println(" 2 - Withdraw");
        System.out.println(" 3 - Deposit");
        System.out.println(" 4 - Exit");
        System.out.print("Choose an option: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Checking Balance: $" + getCheckingBalance());
                getAccountType();
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                withdrawChecking(menuInput.nextDouble());
                getAccountType();
                break;
            case 3:
                System.out.print("Enter amount to deposit: ");
                depositChecking(menuInput.nextDouble());
                getAccountType();
                break;
            case 4:
                getAccountType();
                break;
            default:
                System.out.println("Invalid choice!");
                getChecking();
        }
    }

    private void getSaving() {
        System.out.println("Saving Account:");
        System.out.println(" 1 - View Balance");
        System.out.println(" 2 - Withdraw");
        System.out.println(" 3 - Deposit");
        System.out.println(" 4 - Exit");
        System.out.print("Choose an option: ");

        int selection = menuInput.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Saving Balance: $" + getSavingBalance());
                getAccountType();
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                withdrawSaving(menuInput.nextDouble());
                getAccountType();
                break;
            case 3:
                System.out.print("Enter amount to deposit: ");
                depositSaving(menuInput.nextDouble());
                getAccountType();
                break;
            case 4:
                getAccountType();
                break;
            default:
                System.out.println("Invalid choice!");
                getSaving();
        }
    }
}