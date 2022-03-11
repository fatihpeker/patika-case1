package com.company.services;

import com.company.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RealEstateService {

    private final ApartmentService apartmentService;

    private final VillaService villaService;

    private final SummerHouseService summerHouseService;

    private final OnSale onSale;

    private List<Apartment> apartmentList = new ArrayList<>();

    private List<SummerHouse> summerHouseList = new ArrayList<>();

    private List<Villa> villaList = new ArrayList<>();

    public RealEstateService(ApartmentService apartmentService, VillaService villaService, SummerHouseService summerHouseService, OnSale onSale) {
        this.apartmentService = apartmentService;
        this.villaService = villaService;
        this.summerHouseService = summerHouseService;
        this.onSale = onSale;
    }


    //All real estate price
    public BigDecimal getAllPrice(){
        BigDecimal sum = new BigDecimal(0);
        sum = sum.add(apartmentService.getApartmentPriceSum());
        sum = sum.add(villaService.getVillaPriceSum());
        sum = sum.add(summerHouseService.getVillaPriceSum());
        return sum;
    }

    //all real estate avarage
    public BigDecimal getAllAvarageOfM2(){
        BigDecimal sumOfAvarage = new BigDecimal(0);
        sumOfAvarage = sumOfAvarage.add(apartmentService.getAvarageofM2());
        sumOfAvarage = sumOfAvarage.add(villaService.getAvarageofM2());
        sumOfAvarage = sumOfAvarage.add(summerHouseService.getAvarageofM2());
        BigDecimal avarage = sumOfAvarage.divide(BigDecimal.valueOf(3));
        return avarage;
    }


    //all real estate by room
    public List<RealEstate> getRealEstateByRoom(int numberOfRoom){
        List<RealEstate> realEstateList = new ArrayList<>();
        realEstateList.addAll(onSale.getApartmentList());
        realEstateList.addAll(onSale.getVillaList());
        realEstateList.addAll(onSale.getSummerHouseList());

        List<RealEstate> realEstateResultList = new ArrayList<>();

        for (RealEstate realEstate : realEstateList){
            if(numberOfRoom == realEstate.getNumberOfRoom()){
                realEstateResultList.add(realEstate);
            }
        }
        return realEstateResultList;
    }

}
