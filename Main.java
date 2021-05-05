package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int variant;
        String mayor;
        int wealth;
        String law;
        Locality city = new Locality(1753, "Россия");
        while (true){
            System.out.println("Выберите действие: ");
            System.out.println("1: Выбрать нового мэра ");
            System.out.println("2: Изменить бюджет ");
            System.out.println("3: Изменить статус города ");
            System.out.println("4: Добавить закон ");
            System.out.println("5: Изменить закон ");
            System.out.println("6: Вывести информацию о городе ");
            Scanner scanner =new Scanner(System.in);
            variant = scanner.nextInt();
            switch (variant){
                case 1:{
                    System.out.println("Введите имя мэра");
                    mayor = scanner.next();
                    city.setNewMayor(mayor);
                    System.out.println("Выбран новый мэр: "+mayor);
                    break;
                }
                case 2:{
                    System.out.println("Введите значение на которое будет изменен бюджет");
                    wealth = scanner.nextInt();
                    city.changeWealth(wealth);
                    break;
                }
                case 3:{
                    if(city.getStatus() == "quarantine"){
                        city.changeStatus();
                        if (city.getStatus() == "quarantine"){
                            System.out.println("Статус сменить невозможно - критическое кол-во больных");
                        }else {
                            System.out.println("Статус изменён");
                        }
                    }else {
                        city.changeStatus();
                        System.out.println("Статус изменён");
                    }
                    System.out.println("Текущий статус: " + city.getStatus());
                    break;
                }
                case 4:{
                    System.out.println("Введите закон: ");
                    city.addLaw(scanner.next());
                    break;
                }
                case 5:{
                    System.out.println("Введите номер закона: ");
                    int number = scanner.nextInt();
                    System.out.println("Введите закон: ");
                    city.changeLaw(number, scanner.next());
                    break;
                }
                case 6:{
                    System.out.println(city.toString());
                    break;
                }
                default:{
                    System.out.println("Неверно введён вариант!");
                    break;
                }
            }
        }
    }
}
