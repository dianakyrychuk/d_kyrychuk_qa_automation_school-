package Lesson5;

import java.util.Scanner;

public class FractionTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть перший дріб: ");
            String input1 = scanner.nextLine();
            Fraction fraction1 = createFraction(input1);

            System.out.println("Введіть другий дріб: ");
            String input2 = scanner.nextLine();
            Fraction fraction2 = createFraction(input2);

            boolean result = fraction1.equals(fraction2);
            System.out.println("Результат: " + result);
        }

        private static Fraction createFraction(String input) {
            String[] parts = input.split("/");
            int numerator = Integer.parseInt(parts[0].trim());
            int denominator = Integer.parseInt(parts[1].trim());
            return new Fraction(numerator, denominator);
        }
}
