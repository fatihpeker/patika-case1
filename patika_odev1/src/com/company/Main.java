package com.company;

import com.company.controller.ApartmentController;
import com.company.controller.RealEstateController;
import com.company.controller.SummerHouseController;
import com.company.controller.VillaController;
import com.company.model.*;
import com.company.services.ApartmentService;
import com.company.services.RealEstateService;
import com.company.services.SummerHouseService;
import com.company.services.VillaService;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        OnSale onSale = new OnSale();

        final ApartmentController apartmentController =  new ApartmentController(new ApartmentService(onSale));

        apartmentController.addNewApartment(new Apartment(1,new BigDecimal(100000),4,130));
        apartmentController.deleteApartment(new Apartment(2,new BigDecimal(150000),6,140));
        apartmentController.addNewApartment(new Apartment(3,new BigDecimal(180000),5,150));
        apartmentController.addNewApartment(new Apartment(4,new BigDecimal(200000),7,180));

        System.out.println("Sum of apartments : " + apartmentController.getSumOfPrice());
        System.out.println("Avarage of apartments : " + apartmentController.getAvarageOfM2());

        final VillaController villaController = new VillaController(new VillaService(onSale));

        villaController.addNewVilla(new Villa(1, new BigDecimal(500000),8,250,2,
                true));
        villaController.addNewVilla(new Villa(2, new BigDecimal(400000),6,300,2,
                true));
        villaController.addNewVilla( new Villa(3, new BigDecimal(800000),10,290,2,
                true));
        villaController.addNewVilla(new Villa(4, new BigDecimal(600000),12,400,2,
                true));

        System.out.println("Sum of villas : " + villaController.getSumOfPrice());
        System.out.println("Avarage of villas : " + villaController.getAvarageOfM2());

        final SummerHouseController summerHouseController = new SummerHouseController(new SummerHouseService(onSale));

        summerHouseController.addNewSummerHouse(new SummerHouse(1, new BigDecimal(200000),5,150,false));
        summerHouseController.addNewSummerHouse(new SummerHouse(2, new BigDecimal(300000),5,180,true));
        summerHouseController.addNewSummerHouse(new SummerHouse(3, new BigDecimal(350000),7,210,true));
        summerHouseController.addNewSummerHouse(new SummerHouse(4, new BigDecimal(250000),5,190,true));

        System.out.println("Sum of summer houses : " + summerHouseController.getSumOfPrice());
        System.out.println("Avarage of summer houses : " + summerHouseController.getAvarageOfM2());

        final RealEstateController realEstateController = new RealEstateController(new RealEstateService(
                new ApartmentService(onSale),
                new VillaService(onSale),
                new SummerHouseService(onSale),
                onSale
        ));

        System.out.println("Sum of all houses price : " + realEstateController.getAllPrice());
        System.out.println("Avarage of all houses : " + realEstateController.getAllAvarageOfM2());
        List<RealEstate> realEstateList = realEstateController.getAllByRoom(5);
        System.out.println("All house that have 5 room : ");
        for (RealEstate realEstate : realEstateList) {
              System.out.println(realEstate.getClass() + " " + realEstate.getId());
        }




    }
}
