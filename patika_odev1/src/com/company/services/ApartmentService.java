package com.company.services;

import com.company.model.Apartment;
import com.company.model.OnSale;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ApartmentService {

    private final OnSale onSale;

    private List<Apartment> apartmentList = new ArrayList<>();

    public ApartmentService(OnSale onSale) {
        this.onSale = onSale;
    }

    // Add a new apartment
    public void addNewApartment(Apartment apartment){
        apartmentList = onSale.getApartmentList();
        apartmentList.add(apartment);
        onSale.setApartmentList(apartmentList);
    }

    //Delete an apartment
    public void deleteApartment(Apartment apartment){
        apartmentList = onSale.getApartmentList();
        apartmentList.remove(apartment);
        onSale.setApartmentList(apartmentList);
    }

    //get sum of apartment price
    public BigDecimal getApartmentPriceSum(){
        BigDecimal sum = new BigDecimal("0");
        apartmentList = onSale.getApartmentList();
        for (Apartment apartment : apartmentList){
            sum = sum.add(apartment.getPrice());
        }
        return sum;
    }

    //get avarage of m^2
    public BigDecimal getAvarageofM2(){
        int sum = 0;
        BigDecimal avarage;
        apartmentList = onSale.getApartmentList();
        for (Apartment apartment : apartmentList){
            sum += apartment.getM2();
        }
        avarage = BigDecimal.valueOf(sum/apartmentList.size());
        return avarage;
    }

}
