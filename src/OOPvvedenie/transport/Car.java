package OOPvvedenie.transport;

import java.util.*;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmissionType;
    private final String carBodyStyle;
    private String registrationID;
    private final int numberOfSeats;
    private boolean isWinterTyres;
    private final Key key;


    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmissionType, String carBodyStyle, String registrationID,
               int numberOfSeats, boolean isWinterTyres, Key key) {

        if (brand == null) {
            this.brand = "Бренд неизвестен";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "Модель неизвестна";
        } else {
            this.model = model;
        }

        setEngineVolume(engineVolume);

        setColor(color);

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null) {
            this.productionCountry = "страна производитель отсутствует";
        } else {
            this.productionCountry = productionCountry;
        }

        setTransmissionType(transmissionType);

        if (carBodyStyle == null || carBodyStyle.isEmpty()) {
            this.carBodyStyle = "sedan";
        } else {
            this.carBodyStyle = carBodyStyle;
        }

        setRegistrationID(registrationID);

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        this.isWinterTyres = isWinterTyres;

        this.key = key;
    }

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
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else {
            this.color = color;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        if (transmissionType == null || transmissionType.isEmpty()) {
            this.transmissionType = "manual";
        } else {
            this.transmissionType = transmissionType;
        }
    }

    public String getCarBodyStyle() {
        return carBodyStyle;
    }

    public String getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(String registrationID) {
        if (registrationID == null) {
            this.registrationID = "Рег.номер неизвестен";
        } else {
            this.registrationID = registrationID;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isWinterTyres() {
        return isWinterTyres;
    }

    public void setWinterTyres(boolean winterTyres) {
        isWinterTyres = winterTyres;
    }

    public void setCurrentSeasonTyres() {
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        if (currentMonth >= 11 || currentMonth <= 3) {
            isWinterTyres = true;
        } else {
            isWinterTyres = false;
        }
    }

    public Key getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", carBodyStyle='" + carBodyStyle + '\'' +
                ", registrationID='" + registrationID + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", isWinterTyres=" + isWinterTyres +
                ", key=" + key +
                '}';
    }

    public static class Key {
        private final boolean remoteEngineControl;
        private final boolean isKeyless;

        public Key(boolean remoteEngineControl, boolean isKeyless) {
            this.remoteEngineControl = remoteEngineControl;
            this.isKeyless = isKeyless;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineControl=" + remoteEngineControl +
                    ", isKeyless=" + isKeyless +
                    '}';
        }
    }
}
