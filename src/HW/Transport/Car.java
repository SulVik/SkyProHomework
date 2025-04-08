package HW.Transport;

import HW.Driver.*;
import HW.Enums.*;

public class Car extends Transport<DriverCatB> implements Competitive {

    private CabinType cabinType;
    private final Type type = Type.CAR;

    public Car(String brand, String model, double engineVolume, DriverCatB driverCatB, CabinType cabinType) {
        super(brand, model, engineVolume, driverCatB);
        this.cabinType = cabinType;
    }

    @Override
    public void printType() {
        if (cabinType != null) {
            System.out.println(cabinType);
        } else {
            System.out.println("Данных по ТС недостаточно");
        }
    }

    public CabinType getCabinType() {
        return cabinType;
    }

    public void setCabinType(CabinType cabinType) {
        this.cabinType = cabinType;
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
