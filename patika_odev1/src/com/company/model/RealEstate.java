package com.company.model;

import java.math.BigDecimal;

public abstract class RealEstate {

    public RealEstate(int id, BigDecimal price, int numberOfRoom, int m2) {
        this.id = id;
        this.price = price;
        this.numberOfRoom = numberOfRoom;
        this.m2 = m2;
    }

    protected int id;
    protected BigDecimal price;
    protected int numberOfRoom;
    protected int m2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }
}
