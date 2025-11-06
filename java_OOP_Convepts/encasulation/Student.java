package java_OOP_Convepts.encasulation;

public class Student {

    private String name;
    private int age;
    private String address;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // simple validation
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
    
}
