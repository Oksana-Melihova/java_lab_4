package com.company;

public class City extends Locality implements CityAPI{
    public City(int yearOfFoundation, String country){
        super(yearOfFoundation, country);
    }

    public void startRiot(){
        this.setNewMayor("nobody");
        this.setPopulation((int)(-this.getPopulation()*0.001));
        System.out.println("Riot has happened");
    }
}
