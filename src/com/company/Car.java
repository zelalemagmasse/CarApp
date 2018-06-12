package com.company;

public class Car {
    private String brandName;
    private String colo;
    private String seatTexture;
    private String roofType;

    public Car(String brandName, String colo, String seatTexture, Integer numberOfSeat) {
        this.brandName = brandName;
        this.colo = colo;
        this.seatTexture = seatTexture;
        this.numberOfSeat = numberOfSeat;
    }

    public Car(String brandName, String colo, Integer numberOfSeat) {
        this.brandName = brandName;
        this.colo = colo;
        this.numberOfSeat = numberOfSeat;

    }

    public Car(String brandName, String colo, String seatTexture, String roofType, String transmissionSystem, String towHitch, Integer numberOfSeat) {
        this.brandName = brandName;
        this.colo = colo;
        this.seatTexture = seatTexture;
        this.roofType = roofType;
        this.transmissionSystem = transmissionSystem;
        this.towHitch = towHitch;
        this.numberOfSeat = numberOfSeat;
    }

    public Car(String brandName, String colo, String seatTexture, String transmissionSystem, Integer numberOfSeat) {
        this.brandName = brandName;
        this.colo = colo;
        this.seatTexture = seatTexture;
        this.transmissionSystem = transmissionSystem;
        this.numberOfSeat = numberOfSeat;

    }

    private String  transmissionSystem;
    private String  towHitch;
    private Integer numberOfSeat;

    public Car() {
    }

}
