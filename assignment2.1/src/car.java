public class car {
    private double gasolineTankCapacity;
    private double gasolineLevel;
    private double topSpeed;
    private double speed;
    private double targetSpeed;
    private boolean cruiseControlOn;

    public car() {
        gasolineTankCapacity = 40;
        gasolineLevel = 0;
        topSpeed = 180;
        speed = 0;
        targetSpeed = 0;
        cruiseControlOn = false;
    }

    public car(double gasolineTankCapacity, double topSpeed) {
        this.gasolineTankCapacity = gasolineTankCapacity;
        this.gasolineLevel = 0;
        this.topSpeed = topSpeed;
        this.speed = 0;
        this.targetSpeed = 0;
        this.cruiseControlOn = false;
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

    public void setTargetSpeed(double targetSpeed) {
        if (targetSpeed >= 30 && targetSpeed <= topSpeed) {
            this.targetSpeed = targetSpeed;
        }
    }

    public double getTargetSpeed() {
        return targetSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (targetSpeed >= 30 && targetSpeed <= topSpeed) {
            while (speed < targetSpeed) {
                accelerate();
            }

            while (speed > targetSpeed) {
                decelerate();
            }

            cruiseControlOn = true;
            return true;
        }

        return false;
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }
}