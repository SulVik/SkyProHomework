package HW.Enums;

public enum PassengerCapacity {
    VERY_SMALL(null, 10),
    SMALL(null, 25),
    MEDIUM(25, 50),
    BIG(50, 80),
    VERY_BIG(80, 120);

    private final Integer minCapacity;
    private final Integer maxCapacity;

    PassengerCapacity(Integer min, Integer max) {
        this.minCapacity = min;
        this.maxCapacity = max;
    }

    public Integer getMinCapacity() {
        return minCapacity;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    public String toString() {
        String info = "Вместимость:";
        if (this.minCapacity != null) {
            info = info.concat(" нижняя граница - " + this.minCapacity);
        }
        if (this.maxCapacity != null) {
            info = info.concat(" верхняя граница - " + this.maxCapacity);
        }
        if (this.minCapacity == null && this.maxCapacity == null) {
            return "Информация о вместимости отсутствует";
        }
        return info;
    }
}
