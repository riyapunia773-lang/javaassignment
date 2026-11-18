public class SportsCar extends Car {

    public SportsCar() {
        super();
    }

    @Override
    public void accelerate() {
        System.out.println("Sports car accelerates faster!");
    }

    @Override
    public void brake() {
        System.out.println("Sports car stops faster!");
    }
}