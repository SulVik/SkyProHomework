package HW.Driver;

import HW.Transport.*;

public class DriverCatC extends Driver {

    private final String CATEGORY = "C";

    public DriverCatC(String fio, boolean isHasLicense, int yearOfExperience) {
        super(fio, isHasLicense, yearOfExperience);
    }

    public String getCATEGORY() {
        return CATEGORY;
    }
}
