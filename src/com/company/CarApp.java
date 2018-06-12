package com.company;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {
	// write your code here
        Car firstCar = new Car("RED",2018,"PORSH",5,250);
        Car secondCar=new Car("BLUE",2016,"BMW",8,350);

       String message1=firstCar.carModel();
        System.out.println(message1);
        String message2=secondCar.carModel();
        System.out.println(message2);

    }
}
