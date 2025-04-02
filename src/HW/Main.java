package HW;

import HW.Driver.*;
import HW.Transport.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(null, null, 1.0);
        Car car2 = new Car("ford", "explorer", 4.0);
        Car car3 = new Car("mazda", "cx9", 3.0);
        Car car4 = new Car("toyota", "corolla", 1.8);

        Bus bus1 = new Bus("PAZ", "the pazik", 4.5);
        Bus bus2 = new Bus("UAZ", "bukhanka", 2.7);
        Bus bus3 = new Bus("GAZ", "vector", 3.0);
        Bus bus4 = new Bus("KAZ", null, 3.0);

        Truck truck1 = new Truck("KAMAZ", "4310", 6.0);
        Truck truck2 = new Truck("IVECO", "lorry", 5.2);
        Truck truck3 = new Truck("Freightliner", "american", 9.2);
        Truck truck4 = new Truck("Daf", "abcxz", 4.2);

        Transport[] transports = new Transport[]{car1, car2, car3, car4, bus1, bus2, bus3, bus4, truck1, truck2, truck3, truck4};


        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
            transports[i].toBeginMoving();
            transports[i].toFinishMoving();
            if (transports[i] instanceof Competitive) {
                ((Competitive) transports[i]).pitstop();
                ((Competitive) transports[i]).bestLapTime();
                ((Competitive) transports[i]).highestSpeed();
                Driver driver = null;
                if (transports[i] instanceof Car) {
                    driver = new DriverCatB("name" + i, (Math.round(Math.random())) == 1, 9, (Car) transports[i]);
                } else if (transports[i] instanceof Truck) {
                    driver = new DriverCatC("name" + i, (Math.round(Math.random())) == 1, 9, (Truck) transports[i]);
                } else if (transports[i] instanceof Bus) {
                    driver = new DriverCatD("name" + i, (Math.round(Math.random())) == 1, 9, (Bus) transports[i]);
                }
                if (driver != null) {
                    driver.readyToCompetition();
                    driver.toStart();
                    driver.toStop();
                    driver.toRefuel();
                }
            }
            System.out.println("_______________");
        }
    }
}