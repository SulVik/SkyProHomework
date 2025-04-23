package HW.Mechanic;

public class Mechanic {
    private String fio;
    private String workplace;

    public Mechanic(String fio, String workplace) {
        this.fio = fio;
        this.workplace = workplace;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "fio='" + fio + '\'' +
                ", workplace='" + workplace + '\'' +
                '}';
    }

    public void doMaintenance() {
        System.out.println(this.fio + " из " + this.workplace + " провел техобслуживание.");
    }

    public void fixTransport() {
        System.out.println(this.fio + " из " + this.workplace + " починил автомобиль.");
    }

}
