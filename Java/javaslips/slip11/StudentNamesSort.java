import java.util.Scanner;

public class StudentNamesSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("\nStudent names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
