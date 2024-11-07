package ru.Zybareva.math;

public abstract class Fraction2 extends Number {
    private final int numerator;
    private final int denominator;

    public Fraction2(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        // Обеспечиваем, что только числитель может быть отрицательным
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

    // Реализация методов класса Number для различных представлений дроби
    public int intValue() {
        return numerator / denominator; // Целая часть
    }

    public long longValue() {
        return (long) numerator / denominator;
    }

    public float floatValue() {
        return (float) numerator / denominator;
    }

    public double doubleValue() {
        return (double) numerator / denominator;
    }

    // Нахождение наибольшего общего делителя
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

