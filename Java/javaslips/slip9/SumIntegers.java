public class SumIntegers {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                // Skip non-integer inputs
            }
        }

        System.out.println("Sum of valid integers: " + sum);
    }
}
