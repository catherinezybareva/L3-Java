package ru.Zybareva.math;

public class Fraction1 {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор, принимающий числитель и знаменатель
    public Fraction1(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        // Проверка и упрощение дроби сразу при создании
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

    // Геттер для числителя
    public int getNumerator() {
        return numerator;
    }

    // Сеттер для числителя
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }

    // Геттер для знаменателя
    public int getDenominator() {
        return denominator;
    }

    // Сеттер для знаменателя
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.denominator = denominator;
        simplify();
    }

    // Метод для получения строкового представления дроби
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод для сложения двух дробей
    public Fraction1 add(Fraction1 other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction1(newNumerator, newDenominator);
    }

    // Метод для вычитания двух дробей
    public Fraction1 subtract(Fraction1 other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction1(newNumerator, newDenominator);
    }

    // Метод для умножения двух дробей
    public Fraction1 multiply(Fraction1 other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction1(newNumerator, newDenominator);
    }

    // Метод для деления двух дробей
    public Fraction1 divide(Fraction1 other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Нельзя делить на ноль.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction1(newNumerator, newDenominator);
    }

    // Метод для упрощения дроби
    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
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
