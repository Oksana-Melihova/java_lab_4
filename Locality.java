package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Locality implements CityAPI{
    private int yearOfFoundation;
    private String country;
    private int population;
    private double area;
    private double coordinateOfLocation[];
    private String currentMayor;
    private String language;
    private double wealth;
    private String status;
    private ArrayList<String> laws;
    private int countOfLaws;
    private int countOfPatient;

    public Locality(int yearOfFoundation, String country){
        setYearOfFoundation(yearOfFoundation);
        setCountry(country);
        population = 1;
        area = 0;
        coordinateOfLocation = new double[]{0, 0};
        currentMayor = "nobody";
        language = "";
        wealth = 0;
        status = "normal";
        laws = new ArrayList<>();
        countOfLaws = 0;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCoordinateOfLocation(double latitude, double longitude) {
        this.coordinateOfLocation[0] = latitude;
        this.coordinateOfLocation[1] = longitude;
    }

    public void setCountOfPatient(int countOfPatient) {
        this.countOfPatient = countOfPatient;
    }

    public void setNewMayor(String newMayor) {
        currentMayor = newMayor;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public double[] getCoordinateOfLocation() {
        return coordinateOfLocation;
    }

    public String getCurrentMayor() {
        return currentMayor;
    }

    public String getLanguage() {
        return language;
    }

    public void changePopulation(int variableNumber){
        this.population += variableNumber;
        if (population < 0){
            this.population = 0;
        }
    }

    public void changeWealth(int variableNumber){
        wealth += variableNumber;
        if (wealth < 0){
            wealth = 0;
        }
    }

    public String getStatus(){
        if(status == "normal"){
            if(countOfPatient/population >= 0.5){
                return "quarantine";
            }else{
                return "normal";
            }
        }else{
            return "quarantine";
        }
    }

    public void changeStatus(){
        if(status == "normal"){
            status = "quarantine";
        }else{
            status = "normal";
        }
    }

    public void addLaw(String law){
        countOfLaws++;
        laws.add("№"+countOfLaws+": "+law);
    }
    public void changeLaw(int num, String law){
        laws.remove(num - 1);
        laws.add(num - 1, "№"+(num-1)+": "+law);
    }

    @Override
    public String toString() {
        return "City{" +
                "yearOfFoundation=" + yearOfFoundation +
                ", country='" + country + '\'' +
                ", population=" + population +
                ", area=" + area + "\n" +
                "coordinateOfLocation=" + Arrays.toString(coordinateOfLocation) +
                ", currentMayor='" + currentMayor + '\'' +
                ", language='" + language + '\'' +
                ", wealth=" + wealth +
                ", status='" + status + '\'' + "\n" +
                "laws=" + laws +
                ", countOfLaws=" + countOfLaws +
                ", countOfPatient=" + countOfPatient +
                '}';
    }
}
