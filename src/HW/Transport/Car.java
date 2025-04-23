package HW.Transport;

import HW.Driver.*;
import HW.Enums.*;
import HW.Mechanic.*;

import java.util.*;

public class Car extends Transport<DriverCatB> implements Competitive {

    private final CabinType cabinType;
    private static final Type TYPE = Type.CAR;

    public Car(String brand, String model, double engineVolume, DriverCatB driverCatB, ArrayList<Mechanic> mechanics, CabinType cabinType) {
        super(brand, model, engineVolume, driverCatB, mechanics);
        this.cabinType = cabinType;
    }

    @Override
    public void toDoDiagnostic() {
        System.out.println(this.getBrand() + " " + this.getModel() + " - диагностика пройдена");
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
