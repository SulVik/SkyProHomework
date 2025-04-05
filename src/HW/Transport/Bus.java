package HW.Transport;

import HW.Driver.*;

public class Bus extends Transport implements Competitive{

    public Bus(String brand, String model, double engineVolume, DriverCatD driverCatD) {
        super(brand, model, engineVolume, driverCatD);
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
