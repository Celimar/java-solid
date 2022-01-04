package br.net.gradual.solid.openclosed;

public class Vehicle {

    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    public void car(){
        System.out.println("Criando um carro: "+color + " ano "+ year +" "+ engine + " com "+seats+" assentos.");
        startVehicle();
    }

    public void motorcycle(){
        System.out.println("Criando uma moto: "+color + " ano "+ year +" "+ engine +" cilindradas.");
        startVehicle();
    }

    public void startVehicle(){
        System.out.println("Ligando Motores");
    }
}
