import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.next();

        System.out.print("Enter middle name: ");
        String middle = sc.next();

        System.out.print("Enter last name: ");
        String last = sc.next();

        // Capitalize first letter of middle name
        middle = middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();

        System.out.println("\nFormatted name: " + last + ", " + first + " " + middle);

        sc.close();
    }
}
