package com.company.services;

import com.company.model.Apartment;
import com.company.model.OnSale;
import com.company.model.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VillaService {


    private final OnSale onSale;

    private List<Villa> villaList = new ArrayList<>();


    public VillaService(OnSale onSale) {
        this.onSale = onSale;
    }

    //add a new villa
    public void addNewVilla(Villa villa){
        villaList = onSale.getVillaList();
        villaList.add(villa);
        onSale.setVillaList(villaList);
    }

    //delete a villa
    public void deleteVilla(Villa villa){
        villaList = onSale.getVillaList();
        villaList.remove(villa);
        onSale.setVillaList(villaList);
    }

    ////get sum of villa price
    public BigDecimal getVillaPriceSum(){
        BigDecimal sum = new BigDecimal("0");
        villaList = onSale.getVillaList();
        for (Villa villa : villaList){
            sum = sum.add(villa.getPrice());
        }
        return sum;
    }

    //get avarage of m^2
    public BigDecimal getAvarageofM2(){
        int sum = 0;
        BigDecimal avarage;
        villaList = onSale.getVillaList();
        for (Villa villa : villaList){
            sum += villa.getM2();
        }
        avarage = BigDecimal.valueOf(sum/villaList.size());
        return avarage;
    }

}
