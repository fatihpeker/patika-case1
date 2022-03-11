package com.company.model;

import java.math.BigDecimal;

public class Villa extends RealEstate {
    private int numberOfFloors;
    private boolean isThereYard;

    public Villa(int id, BigDecimal price, int numberOfRoom, int m2, int numberOfFloors, boolean isThereYard) {
        super(id,price, numberOfRoom, m2);
        this.numberOfFloors = numberOfFloors;
        this.isThereYard = isThereYard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isThereYard() {
        return isThereYard;
    }

    public void setThereYard(boolean thereYard) {
        isThereYard = thereYard;
    }
}
