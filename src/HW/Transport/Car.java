package HW.Transport;

import HW.Driver.*;

public class Car extends Transport<DriverCatB> implements Competitive {

    public Car(String brand, String model, double engineVolume, DriverCatB driverCatB) {
        super(brand, model, engineVolume, driverCatB);
    }

    @Override
    public void pitstop() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getBrand() + " " + this.getModel() + " остановился на пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getBrand() + " " + this.getModel() + " показал лучший круг");
    }

    @Override
    public void highestSpeed() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getBrand() + " " + this.getModel() + " показал самую высокую скорость");
    }
}
