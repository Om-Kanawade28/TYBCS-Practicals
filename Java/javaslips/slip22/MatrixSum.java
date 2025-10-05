import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Sum of diagonal elements");
            System.out.println("2. Sum of upper diagonal elements");
            System.out.println("3. Sum of lower diagonal elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int sum = 0;
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++)
                        sum += a[i][i];
                    System.out.println("Sum of diagonal elements: " + sum);
                    break;

                case 2:
                    for (int i = 0; i < n; i++)
                        for (int j = i + 1; j < n; j++)
                            sum += a[i][j];
                    System.out.println("Sum of upper diagonal elements: " + sum);
                    break;

                case 3:
                    for (int i = 0; i < n; i++)
                        for (int j = 0; j < i; j++)
                            sum += a[i][j];
                    System.out.println("Sum of lower diagonal elements: " + sum);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
