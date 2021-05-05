package com.company;

public interface CityAPI {
    void setYearOfFoundation(int yearOfFoundation);
    void setCountry(String countryOfFoundation);
    void setPopulation(int population);
    void setArea(double area);
    void setCoordinateOfLocation(double latitude, double longitude);
    void setNewMayor(String newMayor);
    void setLanguage(String language);
    void setCountOfPatient(int countOfPatient);
    void changeStatus();
    void addLaw(String law);
    public void changeLaw(int num, String law);
    void changePopulation(int variableNumber);
    void changeWealth(int variableNumber);
}
