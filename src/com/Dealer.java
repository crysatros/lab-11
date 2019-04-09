package com;
import java.util.Random;

public class Dealer {
    int parkingNumber = 2;
    private Car[] parking = new Car[parkingNumber];
    private Factory factory = new Factory();
    Random rnd = new Random(System.currentTimeMillis());
    private String[] colors;

    public Dealer(){
        colors = new String[]{"White", "Red", "Black", "Blue", "Pink", "Green"};
        for(int i = 0; i < parkingNumber; i++) buyNew();
    }

    public void buyNew(){
        for(int i = 0; i < parkingNumber; i++){
            if(parking[i] == null){
                parking[i] = factory.createNewCar(rnd.nextInt(100) + 100, "Mazda", colors[rnd.nextInt(colors.length)]);
                return;
            }
        }
        System.out.println("Свободных мест нет.");
    }

    public void sellCar(int i){
        System.out.println("Поздравляем! Вы купили автомобиль " + parking[i].getAuto() + ". Цвет: " + parking[i].getColor() + ". Мощность: " + parking[i].getPower() + " л.с.");
        parking[i] = null;
    }

    public void showParkingState(){
        for(int i = 0; i < parkingNumber; i++){
            System.out.println("\nПарковочное место " + (i+1)+"\n-------------------");
            if(parking[i] != null) System.out.println(parking[i].getAuto()+"\nЦвет: "+parking[i].getColor()+"\nМощность: "+parking[i].getPower()+" л.с.");
            else System.out.println("Место пусто.");
        }

    }

}
