package HW.Transport;

import HW.Driver.*;
import HW.Enums.*;

public class Bus extends Transport<DriverCatD> implements Competitive {

    private final PassengerCapacity passengerCapacity;
    private static final Type TYPE = Type.BUS;

    public Bus(String brand, String model, double engineVolume, DriverCatD driverCatD, PassengerCapacity passengerCapacity) {
        super(brand, model, engineVolume, driverCatD);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void printType() {
        if (passengerCapacity != null) {
            System.out.println(passengerCapacity);
        } else {
            System.out.println("Данных по ТС недостаточно");
        }
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
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
