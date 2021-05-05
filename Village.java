package com.company;

public class Village extends Locality implements CityAPI {
    public Village(int yearOfFoundation, String country){
        super(yearOfFoundation, country);
    }

    public void startHarvest(){
        this.changePopulation((int)(this.getPopulation()*0.1));
        System.out.println("Harvest ended, population increased");
    }
}
