import java.util.Random;

/**
 * Shared resource class to hold the generated number and manage thread synchronization.
 */
class SharedResource {
    private int number;
    private boolean isAvailable = false;

    // Method for the consumer threads (Square and Cube) to wait and process the number
    public synchronized void processNumber() {
        while (!isAvailable) {
            try {
                wait(); // Wait for the producer to generate a number
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }

        if (number % 2 == 0) {
            System.out.println("Thread 2 (Square): " + number + "^2 = " + (number * number));
        } else {
            System.out.println("Thread 3 (Cube): " + number + "^3 = " + (number * number * number));
        }

        isAvailable = false; // Mark the number as consumed
        notifyAll(); // Notify the producer that it can generate a new number
    }

    // Method for the producer thread to set the number
    public synchronized void setNumber(int number) {
        while (isAvailable) {
            try {
                wait(); // Wait for the consumer to process the current number
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread Interrupted");
            }
        }
        this.number = number;
        System.out.println("Thread 1 (Generator): Generated " + number);
        isAvailable = true; // Mark that a new number is available
        notifyAll(); // Notify consumer threads
    }
}

/**
 * Thread 1: Generates a random integer every 1 second.
 */
class RandomNumberGenerator implements Runnable {
    private SharedResource resource;
    private Random random = new Random();

    public RandomNumberGenerator(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int randomNumber = random.nextInt(100); // Generate a random number 0-99
                resource.setNumber(randomNumber);
                Thread.sleep(1000); // Wait for 1 second
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Generator thread interrupted.");
        }
    }
}

/**
 * Threads 2 & 3: Process the number (square for even, cube for odd).
 */
class NumberProcessor implements Runnable {
    private SharedResource resource;

    public NumberProcessor(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true) {
            resource.processNumber();
        }
    }
}

public class MultiThreadNumber {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread generatorThread = new Thread(new RandomNumberGenerator(resource), "Generator");
        Thread squareThread = new Thread(new NumberProcessor(resource), "SquareCalculator");
        Thread cubeThread = new Thread(new NumberProcessor(resource), "CubeCalculator");

        generatorThread.start();
        squareThread.start();
        cubeThread.start();
    }
}