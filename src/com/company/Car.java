package com.company;

import javax.print.DocFlavor;

public class Car extends Vehicle  {
    private String color;
    private int yearOfMake;
    private String brandName;
    private int numberOfSeat;
    private double speed;

    public Car(String color, int yearOfMake, String brandName, int numberOfSeat, double speed) {
        super(color,yearOfMake,brandName);
        this.color = color;
        this.yearOfMake = yearOfMake;
        this.brandName = brandName;
        this.numberOfSeat = numberOfSeat;
        this.speed = speed;
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    @Override
    public int getYearOfMake() {
        return yearOfMake;
    }

    @Override
    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public Car() {

    }


    public static String  carModel(String color, String brandName, Integer numberOfSeat, int yearOfMake){

        return "This  " +brandName+ "  Car is one of the best car out there with " + color +
                " color,  and it has " + numberOfSeat + "  number of seat configuration and made in " + yearOfMake;
    }

    public String speed(){
        double speed=getSpeed();
        return "it is moving with a speed of " + speed ;
    }

    public  String  carModel(){

        return "This  " +this.brandName+ "  Car is one of the best car out there with " + this.color + " color,  and it has " +
                this.numberOfSeat + "  number of seat configuration and made in " + this.yearOfMake;
    }




}
