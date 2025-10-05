import java.util.*;

class Employee {
    int empid;
    String empname;
    double salary;

    Employee(int id, String name, double sal) {
        empid = id;
        empname = name;
        salary = sal;
    }

    static void sortEmployee(Employee[] e, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (e[i].salary > e[j].salary) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println(empid + " " + empname + " " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] e = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter id, name, salary: ");
            int id = sc.nextInt();
            String name = sc.next();
            double sal = sc.nextDouble();
            e[i] = new Employee(id, name, sal);
        }
        sortEmployee(e, n);
        System.out.println("\nEmployees sorted by salary:");
        for (Employee emp : e) emp.display();
    }
}
