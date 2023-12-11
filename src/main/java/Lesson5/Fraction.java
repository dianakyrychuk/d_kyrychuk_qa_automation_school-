package Lesson5;

class Fraction {
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private int numerator;
    private int denominator;

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction other = (Fraction) obj;
        return numerator * other.denominator == other.numerator * denominator;
    }

}
