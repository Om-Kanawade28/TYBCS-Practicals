import java.util.*;

class MenuProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Volume of Cylinder");
            System.out.println("2. Factorial of a Number");
            System.out.println("3. Check Armstrong Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    double volume = Math.PI * r * r * h;
                    System.out.println("Volume of Cylinder = " + volume);
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= num; i++)
                        fact *= i;
                    System.out.println("Factorial = " + fact);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    int temp = n, rem, sum = 0;
                    while (n > 0) {
                        rem = n % 10;
                        sum += rem * rem * rem;
                        n /= 10;
                    }
                    if (sum == temp)
                        System.out.println(temp + " is an Armstrong number.");
                    else
                        System.out.println(temp + " is not an Armstrong number.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
