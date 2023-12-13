package Lesson3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount in USD: ");
            double amount = scanner.nextDouble();

            CurrencyConverter converter = new CurrencyConverter(0.01, 36.55);

            double totalAmount = converter.calculateTotalAmount(amount);
            System.out.println("Total amount in UAH without commission is " + totalAmount);
        }
}
