package HW.Transport;

import HW.Driver.*;

import java.util.*;

public class AutoService {
    private Queue<Transport> transportQueue = new LinkedList<>();

    public AutoService() {
    }

    public void addAutoInQueue(Transport transport) {
        if (transport instanceof Car || transport instanceof Truck) {
            transportQueue.add(transport);
        } else {
            System.out.println("Автобусы не нуждаются в техобслуживании");
        }
    }

    public void toDoVehicleInspection() {
        Transport transport = this.transportQueue.poll();
        if (transport == null) {
            System.out.println("очередь для техосмотра пуста");
            return;
        }

        System.out.println(transport.getBrand() + " " + transport.getModel() + " прошёл техосмотр");
    }

    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }

    public void setTransportQueue(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }
}
