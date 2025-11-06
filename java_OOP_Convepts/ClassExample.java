// Classes and Objects in Java

public class ClassExample {
    // Attributes (fields) of the class
    String name;
    int age;
    String address;

    // Constructor must match the class name
    public ClassExample(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
    // Creating an object of the ClassExample class
    ClassExample student1 = new ClassExample("Alice", 20, "123 Main St");
        
        // Displaying the student's information
        student1.displayInfo();
    }
}