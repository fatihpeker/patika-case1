package com.company.services;

import com.company.model.Apartment;
import com.company.model.OnSale;
import com.company.model.SummerHouse;
import com.company.model.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SummerHouseService {

    private final OnSale onSale;

    private List<SummerHouse> summerHouseList = new ArrayList<>();

    public SummerHouseService( OnSale onSale) {
        this.onSale = onSale;
    }

    // Add a new summer house
    public void addNewSummerHouse(SummerHouse summerHouse){
        summerHouseList = onSale.getSummerHouseList();
        summerHouseList.add(summerHouse);
        onSale.setSummerHouseList(summerHouseList);
    }

    //Delete an summer house
    public void deleteSummerHouse(SummerHouse summerHouse){
        summerHouseList = onSale.getSummerHouseList();
        summerHouseList.remove(summerHouse);
        onSale.setSummerHouseList(summerHouseList);
    }

    ////get sum of summer house price
    public BigDecimal getVillaPriceSum(){
        BigDecimal sum = new BigDecimal("0");
        summerHouseList = onSale.getSummerHouseList();
        for (SummerHouse summerHouse : summerHouseList){
            sum = sum.add(summerHouse.getPrice());
        }
        return sum;
    }

    //get avarage of m^2
    public BigDecimal getAvarageofM2(){
        int sum = 0;
        BigDecimal avarage;
        summerHouseList = onSale.getSummerHouseList();
        for (SummerHouse summerHouse : summerHouseList){
            sum += summerHouse.getM2();
        }
        avarage = BigDecimal.valueOf(sum/summerHouseList.size());
        return avarage;
    }
}
