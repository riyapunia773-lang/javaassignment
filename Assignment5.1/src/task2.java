
import java.util.Random;

public class task2 {

    public static void main(String[] args) {


        int[] numbers = new int[100000];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }


        int cores = Runtime.getRuntime().availableProcessors();

        System.out.println("Number of processor cores: " + cores);


        int portionSize = numbers.length / cores;


        long[] partialSums = new long[cores];


        Thread[] threads = new Thread[cores];


        for (int i = 0; i < cores; i++) {

            final int threadNumber = i;
            final int start = i * portionSize;


            final int end;

            if (i == cores - 1) {
                end = numbers.length;
            } else {
                end = start + portionSize;
            }

            threads[i] = new Thread(() -> {

                long sum = 0;


                for (int j = start; j < end; j++) {
                    sum += numbers[j];
                }


                partialSums[threadNumber] = sum;

                System.out.println(
                        "Thread " + threadNumber +
                                " sum: " + sum
                );
            });

            threads[i].start();
        }


        for (int i = 0; i < cores; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }


        long totalSum = 0;

        for (int i = 0; i < cores; i++) {
            totalSum += partialSums[i];
        }

        System.out.println("Total sum: " + totalSum);
    }
}

