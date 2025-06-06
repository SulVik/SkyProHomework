package HW.Transport;

import HW.Driver.*;
import HW.Enums.*;
import HW.Mechanic.*;

import java.util.*;

public class Truck extends Transport<DriverCatC> implements Competitive {

    private final LoadCapacity loadCapacity;
    private static final Type TYPE = Type.TRUCK;

    public Truck(String brand, String model, double engineVolume, DriverCatC driverCatC, ArrayList<Mechanic> mechanics, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driverCatC, mechanics);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void toDoDiagnostic() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - диагностика пройдена");
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

    @Override
    public Type getType() {
        return TYPE;
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
