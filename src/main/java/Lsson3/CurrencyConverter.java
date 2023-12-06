package Lsson3;

public class CurrencyConverter {

    public CurrencyConverter(double commission, double exchangeRate) {
        this.commission = commission;
        this.exchangeRate = exchangeRate;
    }
    private double commission;
    private double exchangeRate;

    private double convertUsdToUah(double amount) {
        return amount * exchangeRate;
    }

    private double calculateCommission(double amountInUah) {
        return amountInUah * commission;
    }

    public double calculateTotalAmount(double amount) {
        double amountInUah = convertUsdToUah(amount);
        double commissionAmount = calculateCommission(amountInUah);
        return amountInUah + commissionAmount;
    }
}
