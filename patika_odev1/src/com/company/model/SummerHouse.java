package com.company.model;

import java.math.BigDecimal;

public class SummerHouse extends RealEstate {
    private boolean isThereYard;

    public SummerHouse(int id, BigDecimal price, int numberOfRoom, int m2, boolean isThereYard) {
        super(id, price, numberOfRoom, m2);
        this.isThereYard = isThereYard;
    }
}
