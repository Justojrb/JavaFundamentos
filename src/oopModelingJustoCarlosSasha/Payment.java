package oopModelingJustoCarlosSasha;

public interface Payment {
    boolean process(double amount);
    String getReceipt();
}