package com.company.controller;

import com.company.model.Apartment;
import com.company.services.ApartmentService;

import java.math.BigDecimal;

public class ApartmentController {

    private final ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    public void addNewApartment(Apartment apartment){
        apartmentService.addNewApartment(apartment);
    }

    public void deleteApartment(Apartment apartment){
        apartmentService.deleteApartment(apartment);
    }

    public BigDecimal getSumOfPrice(){
        return apartmentService.getApartmentPriceSum();
    }

    public BigDecimal getAvarageOfM2(){
        return apartmentService.getAvarageofM2();
    }
}
