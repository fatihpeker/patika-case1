package com.company.controller;

import com.company.model.RealEstate;
import com.company.services.RealEstateService;

import java.math.BigDecimal;
import java.util.List;

public class RealEstateController {

    private final RealEstateService realEstateService;

    public RealEstateController(RealEstateService realEstateService) {
        this.realEstateService = realEstateService;
    }


    public BigDecimal getAllPrice(){
        return realEstateService.getAllPrice();
    }

    public BigDecimal getAllAvarageOfM2(){
        return realEstateService.getAllAvarageOfM2();
    }

    public List<RealEstate> getAllByRoom(int numberOfRoom){
        return realEstateService.getRealEstateByRoom(numberOfRoom);
    }
}
