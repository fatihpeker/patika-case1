package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class OnSale {

    private List<Apartment> apartmentList = new ArrayList<>();

    private List<Villa> villaList = new ArrayList<>();

    private List<SummerHouse> summerHouseList = new ArrayList<>();

    public List<Apartment> getApartmentList() {
        return apartmentList;
    }

    public void setApartmentList(List<Apartment> apartmentList) {
        this.apartmentList = apartmentList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public void setVillaList(List<Villa> villaList) {
        this.villaList = villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }

    public void setSummerHouseList(List<SummerHouse> summerHouseList) {
        this.summerHouseList = summerHouseList;
    }
}
