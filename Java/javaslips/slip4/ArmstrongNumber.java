import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;

        // Count number of digits
        int n = 0;
        int temp = num;
        while (temp > 0) {
            n++;
            temp /= 10;
        }

        // Calculate sum of powers of digits
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            result += Math.pow(digit, n);
            temp /= 10;
        }

        // Check Armstrong
        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        sc.close();
    }
}
