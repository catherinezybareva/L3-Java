package ru.Zybareva.math;

public final class Fraction4 {
    private final int numerator;   // Числитель
    private final int denominator; // Знаменатель

    // Конструктор, принимающий числитель и знаменатель
    public Fraction4(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод для сложения двух дробей
    public Fraction4 add(Fraction4 other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction4(newNumerator, newDenominator);
    }

    public Fraction4 subtract(Fraction4 other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction4(newNumerator, newDenominator);
    }

    public Fraction4 multiply(Fraction4 other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction4(newNumerator, newDenominator);
    }

    public Fraction4 divide(Fraction4 other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Нельзя делить на ноль.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction4(newNumerator, newDenominator);
    }

    public Fraction4 add(int number) {
        return add(new Fraction4(number, 1));
    }

    public Fraction4 subtract(int number) {
        return subtract(new Fraction4(number, 1));
    }

    public Fraction4 multiply(int number) {
        return multiply(new Fraction4(number, 1));
    }

    public Fraction4 divide(int number) {
        return divide(new Fraction4(number, 1));
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Метод для преобразования дроби в вещественное число
    public double toDouble() {
        return (double) numerator / denominator;
    }

    // Метод для суммирования набора чисел (целых, дробных и объектов Fraction)
    public static double sumNumbers(Object... numbers) {
        double sum = 0.0;
        for (Object number : numbers) {
            if (number instanceof Integer) {
                sum += (Integer) number;
            } else if (number instanceof Double) {
                sum += (Double) number;
            } else if (number instanceof Fraction4) {
                sum += ((Fraction4) number).toDouble();
            } else {
                throw new IllegalArgumentException("Неподдерживаемый тип: " + number.getClass().getName());
            }
        }
        return sum;
    }
}

