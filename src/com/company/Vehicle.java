package com.company;

public class Vehicle {
    private String color;
    private int yearOfMake;
    private double weight;
    private String brandName;

    public Vehicle(String color, int yearOfMake, String brandName) {
        this.color = color;
        this.yearOfMake = yearOfMake;
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public Vehicle(String color, int yearOfMake, double weight, String brandName) {
        this.color = color;
        this.yearOfMake = yearOfMake;
        this.weight = weight;
        this.brandName = brandName;
    }

    public Vehicle() {

    }




}
