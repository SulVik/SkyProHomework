package HW.Transport;

import HW.Driver.*;
import HW.Enums.*;

public abstract class Transport <T extends Driver>{
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = ((brand == null) || brand.isEmpty()) ? "unknownBrand" : brand;
        this.model = ((model == null) || model.isEmpty()) ? "unknownModel" : model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public abstract void printType();

    public abstract Type getType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume < 0) ? 1.6 : engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        if (driver == null) {
            this.driver = null;
            return;
        }

        if (driver.isHasLicense()) {
            this.driver = driver;
        } else {
            System.out.println("!!! у водителя " + driver.getFio() + " нет прав");
            this.driver = null;
        }
    }

    public void toBeginMoving() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getBrand() + " " + this.getModel() + " начинает движение");
    }

    public void toFinishMoving() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getBrand() + " " + this.getModel() + " Заканчивает движение");
    }

    public void readyToCompetition() {
        if (this instanceof Competitive && driver != null) {
            System.out.println("водитель " + driver.getFio() + " управляет автомобилем " + this.toString() + " и будет участвовать в заезде");
        } else {
            System.out.println(this.toString() + " не является ТС для соревнований или водитель отсутствует");
        }
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", driver=" + driver +
                '}';
    }
}
