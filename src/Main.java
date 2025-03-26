import OOPvvedenie.transport.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Vesta", 1.6, null, 2020,
                null, null, "universal", "o777oo77rus",
                0, false, new Car.Key(true, false));

        System.out.println(car1);

        car1.setCurrentSeasonTyres();

        System.out.println(car1);

    }
}