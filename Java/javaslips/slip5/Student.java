import java.util.Scanner;

class Student {
    // Attributes
    int rollno;
    String name;
    String className; // 'class' is a reserved keyword, so use className
    double per;

    // Method to read student information
    public void readStudentInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Class: ");
        className = sc.nextLine();

        System.out.print("Enter Percentage: ");
        per = sc.nextDouble();
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number : " + rollno);
        System.out.println("Name        : " + name);
        System.out.println("Class       : " + className);
        System.out.println("Percentage  : " + per);
    }
     public static void main(String[] args) {
        Student s = new Student();
        
        // Read student info from console
        s.readStudentInfo();
        
        // Display student info
        s.displayStudentInfo();
    }
}
