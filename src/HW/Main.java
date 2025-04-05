package HW;

import HW.Driver.*;
import HW.Transport.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(null, null, 1.0, new DriverCatB("name" + 0, (Math.round(Math.random())) == 1, 9));
        Car car2 = new Car("ford", "explorer", 4.0, null);
        Car car3 = new Car("mazda", "cx9", 3.0, new DriverCatB("name" + 2, (Math.round(Math.random())) == 1, 9));
        Car car4 = new Car("toyota", "corolla", 1.8, new DriverCatB("name" + 3, (Math.round(Math.random())) == 1, 9));

        Bus bus1 = new Bus("PAZ", "the pazik", 4.5, new DriverCatD("name" + 4, (Math.round(Math.random())) == 1, 9));
        Bus bus2 = new Bus("UAZ", "bukhanka", 2.7, new DriverCatD("name" + 5, (Math.round(Math.random())) == 1, 9));
        Bus bus3 = new Bus("GAZ", "vector", 3.0, new DriverCatD("name" + 6, (Math.round(Math.random())) == 1, 9));
        Bus bus4 = new Bus("KAZ", null, 3.0, new DriverCatD("name" + 7, (Math.round(Math.random())) == 1, 9));

        Truck truck1 = new Truck("KAMAZ", "4310", 6.0, new DriverCatC("name" + 8, (Math.round(Math.random())) == 1, 9));
        Truck truck2 = new Truck("IVECO", "lorry", 5.2, new DriverCatC("name" + 9, (Math.round(Math.random())) == 1, 9));
        Truck truck3 = new Truck("Freightliner", "american", 9.2, new DriverCatC("name" + 10, (Math.round(Math.random())) == 1, 9));
        Truck truck4 = new Truck("Daf", "abcxz", 4.2, new DriverCatC("name" + 11, (Math.round(Math.random())) == 1, 9));

        Transport[] transports = new Transport[]{car1, car2, car3, car4, bus1, bus2, bus3, bus4, truck1, truck2, truck3, truck4};

        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
            transports[i].toBeginMoving();
            transports[i].toFinishMoving();
            if (transports[i] instanceof Competitive) {
                ((Competitive) transports[i]).pitstop();
                ((Competitive) transports[i]).bestLapTime();
                ((Competitive) transports[i]).highestSpeed();
                transports[i].readyToCompetition();
                if (transports[i].getDriver() != null) {
                    transports[i].getDriver().toStart();
                    transports[i].getDriver().toStop();
                    transports[i].getDriver().toRefuel();
                }
            }
            System.out.println("_______________");
        }
    }
}