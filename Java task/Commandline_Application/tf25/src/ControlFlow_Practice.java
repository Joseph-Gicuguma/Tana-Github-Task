public class ControlFlow_Practice {
    public static void main(String[] args) {

        // --- Comparison and Conditional Example ---
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        // --- Logical Operators Example ---
        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        if (hasHighIncome || hasGoodCredit) {
            System.out.println("Eligible for loan.");
        } else {
            System.out.println("Not eligible for loan.");
        }

        // --- Loops Example ---
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // --- If-Else Condition (Temperature Example) ---
        int temp = 25;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It's a nice day");
        } else {
            System.out.println("It's cold");
        }

        // --- Switch Example ---
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }

        // --- FizzBuzz Example ---
        System.out.println("FizzBuzz from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}