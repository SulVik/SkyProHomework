package HW.Enums;

public enum CabinType {
    SEDAN("седан"),
    HATCHBACK("хетчбек"),
    COUPE("купе"),
    WAGON("универсал"),
    SUV("внедорожник"),
    CROSSOVER("кроссовер"),
    PICKUP("пикап"),
    VAN("фургон"),
    MINIVAN("минивэн");

    private final String cabinTypeInRussian;

    CabinType(String cabinTypeInRussian) {
        this.cabinTypeInRussian = cabinTypeInRussian;
    }

    public String getCabinTypeInRussian() {
        return cabinTypeInRussian;
    }

    @Override
    public String toString() {
        return "cabinTypeInRussian: " + cabinTypeInRussian;
    }
}
