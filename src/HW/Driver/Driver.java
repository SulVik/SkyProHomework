package HW.Driver;

import HW.Transport.*;

public abstract class Driver<T extends Transport & Competitive> {
    private String fio;
    private boolean isHasLicense;
    private int yearOfExperience;
    private T competitiveTransport;

    public Driver(String fio, boolean isHasLicense, int yearOfExperience, T competitiveTransport) {
        setFio(fio);
        this.isHasLicense = isHasLicense;
        setYearOfExperience(yearOfExperience);
        setCompetitiveTransport(competitiveTransport);
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

    public T getCompetitiveTransport() {
        return competitiveTransport;
    }

    public void setCompetitiveTransport(T competitiveTransport) {
        this.competitiveTransport = competitiveTransport;
    }

    public void toStart() {
        if (this.isHasLicense && this.competitiveTransport != null) {
            System.out.println(fio + " начинает движение");
        } else {
            System.out.println(fio + " не может начать движение (не управляет ТС)");
        }
    }

    public void toStop() {
        if (this.isHasLicense && this.competitiveTransport != null) {
            System.out.println(fio + " останавливается");
        } else {
            System.out.println(fio + " не может останавиться (не управляет ТС)");
        }
    }

    public void toRefuel() {
        if (this.isHasLicense && this.competitiveTransport != null) {
            System.out.println(fio + " заправился");
        } else {
            System.out.println(fio + " не может заправиться (не управляет ТС)");
        }
    }

    public void readyToCompetition() {
        if (this.isHasLicense && this.competitiveTransport != null) {
            System.out.println("водитель " + fio + " управляет автомобилем " + competitiveTransport.toString() + " и будет участвовать в заезде");
        } else {
            System.out.println("водитель " + fio + " не может участвовать в заезде");
        }
    }


}
