package com.company;

public class Khutor extends Locality implements CityAPI {
    public Khutor(int yearOfFoundation, String country){
        super(yearOfFoundation, country);
    }

    public void startHarvest(){
        this.changePopulation((int)(this.getPopulation()*0.3));
        System.out.println("Harvest ended, population increased");
    }
}
