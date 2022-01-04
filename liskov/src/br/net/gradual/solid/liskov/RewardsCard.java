package br.net.gradual.solid.liskov;

public class RewardsCard implements IPaymentInstrument {
    @Override
    public void validate() throws Exception {
        System.out.println("Cartão válido");
        System.out.println("Rewards válido");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado");
        System.out.println("Pontos creditados");
    }
}
