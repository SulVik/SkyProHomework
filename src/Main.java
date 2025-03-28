import OOPvvedenie.transport.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car2 = new Car("Lada", "Vesta", 2020, "Russia", "white",
                170, 1.6, "manual","universal", "o777oo77rus",
                5, true, new Car.Key(true, false));
        car2.setCurrentSeasonTyres();

        Bus bus1 = new Bus("LIAZ", "autobus", -15, "Russia", null, 90);
        Bus bus2 = new Bus("PAZ", "the pazik", 2020, "", null, 90);
        Bus bus3 = new Bus("GAZ", "vector", 2024, null, "grey",90);

        System.out.println(car2);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
    }
}