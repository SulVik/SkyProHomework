package HW;

import HW.Driver.*;
import HW.Enums.*;
import HW.Exceptions.*;
import HW.Mechanic.*;
import HW.Transport.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Mechanic mechanic1 = new Mechanic("Ivan Ivanov", "шараж монтаж инкорпорейтед");
        Mechanic mechanic2 = new Mechanic("Petr Petrov", "WestCoastCustoms");
        Mechanic mechanic3 = new Mechanic("Oleg Olegov", "EastCoastCustoms");
        Mechanic mechanic4 = new Mechanic("Uncle Bogdan", "9wrench");

        Car car1 = new Car(null, null, 1.0, new DriverCatB("name" + 0, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic1, mechanic2)), null);
        Car car2 = new Car("ford", "explorer", 4.0, null, new ArrayList<>(List.of(mechanic2, mechanic3)), CabinType.SUV);
        Car car3 = new Car("mazda", "cx9", 3.0, new DriverCatB("name" + 2, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic1)), CabinType.CROSSOVER);
        Car car4 = new Car("toyota", "corolla", 1.8, new DriverCatB("name" + 3, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic4)), CabinType.SEDAN);

        Bus bus1 = new Bus("PAZ", "the pazik", 4.5, new DriverCatD("name" + 4, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic1, mechanic2)), PassengerCapacity.MEDIUM);
        Bus bus2 = new Bus("UAZ", "bukhanka", 2.7, new DriverCatD("name" + 5, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic2, mechanic3)), PassengerCapacity.VERY_SMALL);
        Bus bus3 = new Bus("GAZ", "vector", 3.0, new DriverCatD("name" + 6, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic4, mechanic1)), PassengerCapacity.MEDIUM);
        Bus bus4 = new Bus("KAZ", null, 3.0, new DriverCatD("name" + 7, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic2, mechanic4)), PassengerCapacity.BIG);

        Truck truck1 = new Truck("KAMAZ", "4310", 6.0, new DriverCatC("name" + 8, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic1, mechanic2)), LoadCapacity.N2);
        Truck truck2 = new Truck("IVECO", "lorry", 5.2, new DriverCatC("name" + 9, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic1)), LoadCapacity.N2);
        Truck truck3 = new Truck("Freightliner", "american", 9.2, new DriverCatC("name" + 10, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic3)), LoadCapacity.N3);
        Truck truck4 = new Truck("Daf", "abcxz", 4.2, new DriverCatC("name" + 11, (Math.round(Math.random())) == 1, 9), new ArrayList<>(List.of(mechanic2, mechanic3)), LoadCapacity.N3);

        Transport[] transports = new Transport[]{car1, car2, car3, car4, bus1, bus2, bus3, bus4, truck1, truck2, truck3, truck4};

        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
            transports[i].toBeginMoving();
            transports[i].toFinishMoving();
            System.out.println(transports[i].getType());
            transports[i].printType();
            try {
                transports[i].toDoDiagnostic();
            } catch (TransportTypeException e) {
                System.out.println(e.getMessage());
            }
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

        AutoService autoService = new AutoService();

        List<Transport> transportList = Arrays.asList(transports);
        for (Transport transport : transportList) {
            autoService.addAutoInQueue(transport);
        }

        for (int i = 0; i < transportList.size(); i++) {
            autoService.toDoVehicleInspection();
        }

        System.out.println("----------------map HW ↓↓↓------------------- ");
        Map<Transport, List<Mechanic>> map = new HashMap();
        for (int i = 0; i < transports.length; i++) {
            map.put(transports[i], transports[i].getMechanics());
        }
        ;

        for (Map.Entry<Transport, List<Mechanic>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getBrand() + " " + entry.getKey().getModel() + " обслуживают: " + entry.getValue());
        }

        System.out.println("----------------set HW ↓↓↓------------------- ");
        Set<Mechanic> mechanicSet = new HashSet(List.of(mechanic1, mechanic2, mechanic3, mechanic4));

        Iterator<Mechanic> iterator = mechanicSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}