package br.net.gradual.solid.liskov;

public class DebitCard extends NubankCard {
    @Override
    public void validate() throws Exception {
        System.out.println("Validando limite");
        System.out.println("Saldo ok");
    }
}
