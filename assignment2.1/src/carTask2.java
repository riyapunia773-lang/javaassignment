public class carTask2 {
    private double gasolineTankCapacity;
    private double gasolineLevel;
    private double topSpeed;
    private double speed;

    public carTask2() {
        gasolineTankCapacity = 40;
        gasolineLevel = 0;
        topSpeed = 180;
        speed = 0;
    }

    public carTask2(double gasolineTankCapacity, double topSpeed) {
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.gasolineLevel = 0;
        this.topSpeed = topSpeed;
        this.speed = 0;
    }

    public double getGasolineTankCapacity() {
        return gasolineTankCapacity;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate() {
        if (speed < topSpeed) {
            speed++;
        }
    }

    public void decelerate() {
        if (speed > 0) {
            speed--;
        }
    }
}