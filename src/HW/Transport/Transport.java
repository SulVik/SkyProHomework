package HW.Transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = ((brand == null) || brand.isEmpty()) ? "unknownBrand" : brand;
        this.model = ((model == null) || model.isEmpty()) ? "unknownModel" : model;

        setEngineVolume(engineVolume);
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
        this.engineVolume = (engineVolume < 0) ? 1.6 : engineVolume;
    }

    public void toBeginMoving() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getBrand() + " " + this.getModel() + " начинает движение");
    }

    public void toFinishMoving() {
        System.out.println(this.getClass().getSimpleName() + " " + this.getBrand() + " " + this.getModel() + " Заканчивает движение");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
