package HW.Driver;

import HW.Transport.*;

public abstract class Driver {
    private String fio;
    private boolean isHasLicense;
    private int yearOfExperience;

    public Driver(String fio, boolean isHasLicense, int yearOfExperience) {
        setFio(fio);
        this.isHasLicense = isHasLicense;
        setYearOfExperience(yearOfExperience);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = (fio == null || fio.isEmpty()) ? "нет ФИО" : fio;
    }

    public boolean isHasLicense() {
        return isHasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        isHasLicense = hasLicense;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = (yearOfExperience < 0) ? 0 : yearOfExperience;
    }


    public void toStart() {
        if (this.isHasLicense) {
            System.out.println(fio + " начинает движение");
        } else {
            System.out.println(fio + " не может начать движение (не управляет ТС, нет прав)");
        }
    }

    public void toStop() {
        if (this.isHasLicense) {
            System.out.println(fio + " останавливается");
        } else {
            System.out.println(fio + " не может останавиться (не управляет ТС, нет прав)");
        }
    }

    public void toRefuel() {
        System.out.println(fio + " заправился");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fio='" + fio + '\'' +
                ", isHasLicense=" + isHasLicense +
                ", yearOfExperience=" + yearOfExperience +
                '}';
    }
}
