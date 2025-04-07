package HW.Driver;

import HW.Transport.*;

public class DriverCatB extends Driver{

    private final String CATEGORY = "B";

    public DriverCatB(String fio, boolean isHasLicense, int yearOfExperience) {
        super(fio, isHasLicense, yearOfExperience);
    }

    public String getCATEGORY() {
        return CATEGORY;
    }
}
