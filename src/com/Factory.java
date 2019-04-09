package com;

public class Factory {
    public Car createNewCar(int power, String auto, String color){
        return  new Simple(power, auto, color);
    }

}