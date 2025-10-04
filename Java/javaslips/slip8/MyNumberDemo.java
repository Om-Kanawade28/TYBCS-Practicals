class MyNumber {
    private int num;

    // Default constructor
    public MyNumber() {
        this.num = 0;
    }

    // Parameterized constructor
    public MyNumber(int num) {
        this.num = num;   // using this keyword
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isZero() {
        return num == 0;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }
}

public class MyNumberDemo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as command line argument.");
            return;
        }

        int value = Integer.parseInt(args[0]); 
        MyNumber obj = new MyNumber(value);

        System.out.println("Number: " + value);
        System.out.println("Negative? " + obj.isNegative());
        System.out.println("Positive? " + obj.isPositive());
        System.out.println("Zero?     " + obj.isZero());
        System.out.println("Odd?      " + obj.isOdd());
        System.out.println("Even?     " + obj.isEven());
    }
}
