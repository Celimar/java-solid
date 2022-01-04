package br.net.gradual.solid.openclosed.vehicles;

public class Motorcycle extends Vehicle {

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        configureVehicle();
    }

    public void configureVehicle() {
        System.out.println("Criando uma moto: " + color + " ano " + year + " " + engine + " cilindradas.");
        startVehicle();
    }
}
