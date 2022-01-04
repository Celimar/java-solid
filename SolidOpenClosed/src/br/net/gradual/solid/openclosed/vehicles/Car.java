package br.net.gradual.solid.openclosed.vehicles;

import br.net.gradual.solid.openclosed.vehicles.Vehicle;

public class Car implements IVehicleCar {

    protected String color;
    protected String year;
    protected double engine;
    private int seats;

    public Car(String color, String year, double engine, int seats) {
        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
        System.out.println("Criando um carro: " + color + " ano " + year + " " + engine + " com " + seats + " assentos.");
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando Motores");

    }
}