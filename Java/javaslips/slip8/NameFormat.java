import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full name (first middle last): ");
        String first = sc.next();
        String middle = sc.next();
        String last = sc.next();

        String formattedMiddle = middle.substring(0,1).toUpperCase() + middle.substring(1).toLowerCase();

        System.out.println("Formatted Name: " + last + ", " + first + " " + formattedMiddle);
    }
}
