package com;

public class Simple implements Car{
    private  String auto;
    private  int power;
    private  String color;


    public String getAuto() {
        return auto;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }

    public Simple( int power, String auto, String color){
        this.power = power;
        this.auto = auto;
        this.color = color;
    }
}