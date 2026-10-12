import java.util.Scanner;
class Student {
    private String name;
    private int rollNumber;
    private int[] marks;
    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < 5; i++)
        {
            total = total + marks[i];
        }
        return total;
    }
    double calculatePercentage() {
        return calculateTotal() / 5.0;
    }
    String calculateResult() {
        for (int i = 0; i < 5; i++)
        {
            if (marks[i] < 40) {
                return  "FAIL";
            }
        }
        return "PASS";
    }
    void displayResult(){
        System.out.println("Student Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Total Marks: " + calculateResult());
    }
}
public class StudentResult {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll number: ");
        int roll = sc.nextInt();
        int[] marks = new int[5];
        System.out.println("Enter a marks : ");
        boolean valid = true;
        for (int i = 0; i < 5; i++)
        {
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                valid = false;
            }
        }
        if (valid) { 
            Student s = new Student(name, roll, marks);
            s.displayResult();
        } else {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");


        }

        sc.close();

    }

    
}
