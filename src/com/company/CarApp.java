package com.company;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
	// write your code here
        Car newCar = new Car("RED",2018,"PORSH",5,250);

       String message=newCar.carModel("blue","Marc.Benz",5,2010);
        System.out.println(message);
        newCar.setSpeed(250);
        System.out.println(newCar.speed());
        System.out.println(newCar.carModel());

    }
}
