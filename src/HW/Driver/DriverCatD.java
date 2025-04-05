package HW.Driver;

import HW.Transport.*;

public class DriverCatD extends Driver{

    private final String CATEGORY = "D";

    public DriverCatD(String fio, boolean isHasLicense, int yearOfExperience) {
        super(fio, isHasLicense, yearOfExperience);
    }

    public String getCATEGORY() {
        return CATEGORY;
    }
}
