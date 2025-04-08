package HW.Transport;

import HW.Driver.*;
import HW.Enums.*;

public class Truck extends Transport<DriverCatC> implements Competitive{

    private LoadCapacity loadCapacity;
    private final Type type = Type.TRUCK;

    public Truck(String brand, String model, double engineVolume, DriverCatC driverCatC, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driverCatC);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printType() {
        if (loadCapacity != null) {
            System.out.println(loadCapacity);
        } else {
            System.out.println("Данных по ТС недостаточно");
        }
    }


    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public Type getType() {
        return type;
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
