// JavaBasics_Practice.java
import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Scanner;

public class JavaBasics_Practice {
    public static void main(String[] args) {

        // --- VARIABLES ---
        int age = 23;
        double salary = 85000.75;
        boolean isDeveloper = true;
        char grade = 'A';
        String name = "Joseph";

        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
        System.out.println("Developer: " + isDeveloper + ", Grade: " + grade);

        // --- PRIMITIVE TYPES ---
        byte smallNum = 10;
        int distance = 12000;
        long population = 8000000000L;
        float temperature = 36.7F;
        double height = 1.82;
        boolean isActive = false;

        System.out.println("\nPrimitive Types:");
        System.out.println("Byte: " + smallNum + ", Int: " + distance + ", Long: " + population);
        System.out.println("Float: " + temperature + ", Double: " + height + ", Boolean: " + isActive);

        // --- REFERENCE TYPES (String, Arrays, etc.) ---
        String city = new String("Nairobi");
        System.out.println("\nCity name: " + city);
        System.out.println("City in uppercase: " + city.toUpperCase());
        System.out.println("City length: " + city.length());

        // --- ESCAPE SEQUENCES ---
        System.out.println("\nEscape Sequences:");
        System.out.println("Line 1\nLine 2");
        System.out.println("Quoted: \"Hello, World!\"");
        System.out.println("Tabbed:\tThis text is indented");

        // --- ARRAYS ---
        int[] marks = { 80, 90, 70 };
        System.out.println("\nMarks: " + Arrays.toString(marks));
        marks[1] = 95; // modify value
        System.out.println("Updated Marks: " + Arrays.toString(marks));

        // --- MULTIDIMENSIONAL ARRAY ---
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("\nMatrix: " + Arrays.deepToString(matrix));

        // --- CONSTANTS ---
        final float PI = 3.14159F;
        System.out.println("\nConstant PI: " + PI);

        // --- ARITHMETIC OPERATIONS ---
        int x = 10, y = 3;
        System.out.println("\nArithmetic Operations:");
        System.out.println("Sum: " + (x + y));
        System.out.println("Difference: " + (x - y));
        System.out.println("Product: " + (x * y));
        System.out.println("Division: " + (x / y));
        System.out.println("Remainder: " + (x % y));

        // --- CASTING ---
        double result = (double) x / y;
        System.out.println("\nCasting Example: " + result);

        // --- THE MATH CLASS ---
        System.out.println("\nMath Class Examples:");
        System.out.println("Round: " + Math.round(1.7));
        System.out.println("Ceil: " + Math.ceil(1.1));
        System.out.println("Floor: " + Math.floor(1.9));
        System.out.println("Max: " + Math.max(10, 30));
        System.out.println("Random (0–100): " + (int) (Math.random() * 100));

        // --- FORMATTING NUMBERS ---
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String formattedSalary = currency.format(salary);
        System.out.println("\nFormatted Salary: " + formattedSalary);

        // --- READING INPUT ---
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your favorite programming language: ");
        String language = scanner.nextLine();

        System.out.print("Enter your monthly rent: ");
        double rent = scanner.nextDouble();

        System.out.println("You love " + language + " and pay " + currency.format(rent) + " per month.");
        scanner.close();
    }
}