public class carDriverTask2 {
    public static void main(String[] args) {
        carTask2 car1 = new carTask2();
        carTask2 car2 = new carTask2(60, 220);

        System.out.println("Car 1 tank capacity " + car1.getGasolineTankCapacity());
        System.out.println("Car 1 top speed " + car1.getTopSpeed());

        System.out.println("Car 2 tank capacity " + car2.getGasolineTankCapacity());
        System.out.println("Car 2 top speed " + car2.getTopSpeed());
    }
}
