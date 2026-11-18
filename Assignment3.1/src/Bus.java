public class Bus extends Car {

    int passengers = 0;

    public void passengerEnter() {
        passengers++;
        System.out.println("Passenger entered.");
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
            System.out.println("Passenger exited.");
        } else {
            System.out.println("Bus is empty.");
        }
    }

    public void showPassengers() {
        System.out.println("Passengers: " + passengers);
    }
}