
class Theater {

    private int availableSeats = 10;


    public synchronized void reserveTickets(int customerId, int tickets) {

        if (availableSeats >= tickets) {

            availableSeats = availableSeats - tickets;

            System.out.println("Customer " + customerId +
                    " reserved " + tickets + " tickets.");

        } else {

            System.out.println("Customer " + customerId +
                    " couldn't reserve " + tickets + " tickets.");
        }
    }
}

public class Task1 {

    public static void main(String[] args) {

        Theater theater = new Theater();


        int[] tickets = {2, 1, 2, 3, 2, 2, 1, 1, 3, 3};


        Thread[] customers = new Thread[tickets.length];

        for (int i = 0; i < tickets.length; i++) {

            final int customerId = i + 1;
            final int numberOfTickets = tickets[i];

            customers[i] = new Thread(() -> {
                theater.reserveTickets(customerId, numberOfTickets);
            });

            customers[i].start();
        }


        for (int i = 0; i < customers.length; i++) {

            try {
                customers[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("Reservation process complete.");
    }
}

