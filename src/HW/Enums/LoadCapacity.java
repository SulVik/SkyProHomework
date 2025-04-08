package HW.Enums;

public enum LoadCapacity {
    N1(null, 3.5F),
    N2(3.5F, 12.0F),
    N3(12.0F, null);

    private final Float minLoadCapacity;
    private final Float maxLoadCapacity;

    LoadCapacity(Float minLoadCapacity, Float maxLoadCapacity) {
        this.minLoadCapacity = minLoadCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public Float getMinLoadCapacity() {
        return minLoadCapacity;
    }

    public Float getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    @Override
    public String toString() {
        String info = "Транспортное средство грузоподъемностью";
        if (this.minLoadCapacity != null) {
            info = info.concat(" от нижней границы " + this.minLoadCapacity);
        }
        if (this.maxLoadCapacity != null) {
            info = info.concat(" до верхней границы " + this.maxLoadCapacity);
        }
        if (this.minLoadCapacity == null && this.maxLoadCapacity == null) {
            return "Информация о грузоподъемености отсутствует";
        }
        return info;
    }
}
