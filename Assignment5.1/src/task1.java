
class NumberPrinter {
    private int number = 1;
    private final int max;

    public NumberPrinter(int max) {
        this.max = max;
    }

    // Method for printing odd numbers
    public synchronized void printOdd() {
        while (number <= max) {
            while (number <= max && number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (number <= max) {
                System.out.println("Odd Thread: " + number);
                number++;
                notifyAll();
            }
        }
        notifyAll();
    }

    // Method for printing even numbers
    public synchronized void printEven() {
        while (number <= max) {
            while (number <= max && number % 2 != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (number <= max) {
                System.out.println("Even Thread: " + number);
                number++;
                notifyAll();
            }
        }
        notifyAll();
    }
}

public class task1 {
    public static void main(String[] args) {

        // Specify the maximum number
        NumberPrinter printer = new NumberPrinter(20);

        // Create two threads
        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        // Start both threads
        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Printing complete.");
    }
}
