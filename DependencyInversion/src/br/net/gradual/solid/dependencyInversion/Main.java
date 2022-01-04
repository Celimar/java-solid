package br.net.gradual.solid.dependencyInversion;

import br.net.gradual.solid.dependencyInversion.payment.Payment;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("1234");
    }
}
