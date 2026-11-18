
public class VehicleDemo {

    public static void main(String[] args) {

        System.out.println("Vehicle Demonstration\n");


        Vehicle[] vehicles = {
                new Car(),
                new Motorcycle(),
                new Bus(),
                new ElectricCar(),
                new ElectricMotorcycle()
        };


        for (Vehicle vehicle : vehicles) {

            vehicle.start();

            vehicle.stop();

            System.out.println(vehicle.getInfo());

            System.out.println("Fuel Efficiency: "
                    + vehicle.calculateFuelEfficiency()
                    + (vehicle instanceof ElectricVehicle
                    && (vehicle instanceof ElectricCar
                    || vehicle instanceof ElectricMotorcycle)
                    ? " kWh/km"
                    : " MPG"));

            if (vehicle instanceof ElectricVehicle) {
                ((ElectricVehicle) vehicle).charge();
            }

            System.out.println();
        }
    }
}
