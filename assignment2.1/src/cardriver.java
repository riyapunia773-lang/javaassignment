public class cardriver {
    public static void main(String[] args) {
        car myCar = new car(40, 180);

        myCar.setTargetSpeed(100);

        if (myCar.turnOnCruiseControl()) {
            System.out.println("Cruise control is on");
            System.out.println("Target speed: " + myCar.getTargetSpeed());
            System.out.println("Current speed: " + myCar.getSpeed());
        } else {
            System.out.println("Cruise control could not be turned on");
        }

        myCar.turnOffCruiseControl();
        System.out.println("Cruise control is off");
    }
}