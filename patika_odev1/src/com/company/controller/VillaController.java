package com.company.controller;

import com.company.model.Villa;
import com.company.services.VillaService;

import java.math.BigDecimal;

public class VillaController {

    private final VillaService villaService;

    public VillaController(VillaService villaService) {
        this.villaService = villaService;
    }

    public void addNewVilla(Villa villa){
        villaService.addNewVilla(villa);
    }

    public void deleteVilla(Villa villa){
        villaService.deleteVilla(villa);
    }

    public BigDecimal getSumOfPrice(){
        return villaService.getVillaPriceSum();
    }

    public BigDecimal getAvarageOfM2(){
        return villaService.getAvarageofM2();
    }

}
