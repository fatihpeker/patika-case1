package com.company.controller;

import com.company.model.SummerHouse;
import com.company.services.SummerHouseService;

import java.math.BigDecimal;

public class SummerHouseController {

    private final SummerHouseService summerHouseService;


    public SummerHouseController(SummerHouseService summerHouseService) {
        this.summerHouseService = summerHouseService;
    }

    public void addNewSummerHouse(SummerHouse summerHouse){
        summerHouseService.addNewSummerHouse(summerHouse);
    }

    public void deleteSummerHouse(SummerHouse summerHouse){
        summerHouseService.deleteSummerHouse(summerHouse);
    }

    public BigDecimal getSumOfPrice(){
        return summerHouseService.getVillaPriceSum();
    }

    public BigDecimal getAvarageOfM2(){
        return summerHouseService.getAvarageofM2();
    }
}
