package br.net.gradual.solid.openclosed;

import br.net.gradual.solid.openclosed.vehicles.Car;
import br.net.gradual.solid.openclosed.vehicles.Motorcycle;

public class Main {

    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {
        Car car = new Car("amarelo", "2021", 2.0, 4);

        Motorcycle motorcycle = new Motorcycle("black", "2021", 250);
    }
}
