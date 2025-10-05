import java.util.*;

class Student {
    int roll_no;
    String name;
    double percentage;

    // Constructor
    Student(int roll_no, String name, double percentage) {
        this.roll_no = roll_no;
        this.name = name;
        this.percentage = percentage;
    }

    // Static method to sort array of Students by percentage
    static void sortStudent(Student[] students,int n) {
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(students[i].percentage > students[j].percentage){
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                
            }
        }
       }
    }

    // Display details
    void display() {
        System.out.println("Roll No: " + roll_no + ", Name: " + name + ", Percentage: " + percentage);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Percentage: ");
            double perc = sc.nextDouble();
            students[i] = new Student(roll, name, perc);
        }

        // Sort students by percentage
        Student.sortStudent(students,n);

        System.out.println("\nStudents sorted by percentage:");
        for (Student s : students) {
            s.display();
        }
    }
}
