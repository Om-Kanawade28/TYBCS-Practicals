class MyNumber {
    private int num;

    MyNumber() {
        this.num = 0;
    }

    MyNumber(int num) {
        this.num = num;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isOdd() {
        return num % 2 != 0;
    }

    boolean isEven() {
        return num % 2 == 0;
    }
}

public class MyNumberTest {
    public static void main(String[] args) {
        int val = 0;
        if (args.length > 0)
            val = Integer.parseInt(args[0]);

        MyNumber obj = new MyNumber(val);

        System.out.println("Number: " + val);
        System.out.println("Positive? " + obj.isPositive());
        System.out.println("Negative? " + obj.isNegative());
        System.out.println("Zero? " + obj.isZero());
        System.out.println("Even? " + obj.isEven());
        System.out.println("Odd? " + obj.isOdd());
    }
}
