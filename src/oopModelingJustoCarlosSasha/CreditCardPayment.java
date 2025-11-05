package oopModelingJustoCarlosSasha;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    public CreditCardPayment(String cardNumber){ this.cardNumber = cardNumber; }

    @Override
    public boolean process(double amount) {
        // simulación simple
        return true;
    }

    @Override
    public String getReceipt(){
        return "Pago con tarjeta ****" + cardNumber.substring(cardNumber.length()-4);
    }
}