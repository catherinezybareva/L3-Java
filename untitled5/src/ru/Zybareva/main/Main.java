package ru.Zybareva.main;
import java.util.Scanner;

import ru.Zybareva.math.*;

import static ru.Zybareva.math.Extent.calculateExtent;

public class Main {
    public static void main(String[] args) {
        //Задача 1.4 Дроби, добавили final
        // Проверка создания дробей и корректного сокращения
        System.out.println("Задача 1 №4 Сложение дробей \n");
        Fraction1 fraction1 = new Fraction1(2, 4);
        Fraction1 fraction2 = new Fraction1(3, 9);
        System.out.println("fraction1 (должно быть 1/2): " + fraction1);
        System.out.println("fraction2 (должно быть 1/3): " + fraction2);

        // Проверка сложения дробей
        Fraction1 sum = fraction1.add(fraction2);
        System.out.println("Сумма 1/2 + 1/3 (должна быть 5/6): " + sum);

        // Проверка вычитания дробей
        Fraction1 difference = fraction1.subtract(fraction2);
        System.out.println("Разность 1/2 - 1/3 (должна быть 1/6): " + difference);

        // Проверка умножения дробей
        Fraction1 product = fraction1.multiply(fraction2);
        System.out.println("Произведение 1/2 * 1/3 (должно быть 1/6): " + product);

        // Проверка деления дробей
        Fraction1 quotient = fraction1.divide(fraction2);
        System.out.println("Частное 1/2 / 1/3 (должно быть 3/2): " + quotient);

        // Проверка работы с отрицательными значениями
        Fraction1 negativeFraction = new Fraction1(-2, 4);
        System.out.println("Отрицательная дробь -2/4 (должна быть -1/2): " + negativeFraction);

        Fraction1 negativeDenominator = new Fraction1(2, -4);
        System.out.println("Дробь с отрицательным знаменателем 2/-4 (должна быть -1/2): " + negativeDenominator);

        // Проверка работы с целыми числами
        Fraction1 addInteger = fraction1.add(1);
        System.out.println("1/2 + 1 (должно быть 3/2): " + addInteger);

        Fraction1 subtractInteger = fraction1.subtract(1);
        System.out.println("1/2 - 1 (должно быть -1/2): " + subtractInteger);

        Fraction1 multiplyInteger = fraction1.multiply(3);
        System.out.println("1/2 * 3 (должно быть 3/2): " + multiplyInteger);

        Fraction1 divideInteger = fraction1.divide(2);
        System.out.println("1/2 / 2 (должно быть 1/4): " + divideInteger);

        // Проверка ошибки деления на ноль
        try {
            Fraction1 zeroDenominator = new Fraction1(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании дроби с нулевым знаменателем: " + e.getMessage());
        }

        try {
            fraction1.divide(new Fraction1(0, 1));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при делении на дробь с нулевым числителем: " + e.getMessage());
        }
        //Задача 3 №3
        System.out.println("\nЗадача 3 №1 Запретная дробь \n");
        Fraction3 fraction3 = new Fraction3(2, 4);
        Fraction3 fraction4 = new Fraction3(3, 9);
        System.out.println("fraction1 (должна быть 1/2): " + fraction1);
        System.out.println("fraction2 (должна быть 1/3): " + fraction2);

        // Проверка сложения дробей
        Fraction3 sum1 = fraction3.add(fraction4);
        System.out.println("Сумма 1/2 + 1/3 (должна быть 5/6): " + sum);

        // Проверка вычитания дробей
        Fraction3 difference1 = fraction3.subtract(fraction4);
        System.out.println("Разность 1/2 - 1/3 (должна быть 1/6): " + difference);

        // Проверка умножения дробей
        Fraction3 product1 = fraction3.multiply(fraction4);
        System.out.println("Произведение 1/2 * 1/3 (должно быть 1/6): " + product);

        // Проверка деления дробей
        Fraction3 quotient1 = fraction3.divide(fraction4);
        System.out.println("Частное 1/2 / 1/3 (должно быть 3/2): " + quotient);

        // Проверка работы с отрицательными значениями
        Fraction3 negativeFraction1 = new Fraction3(-2, 4);
        System.out.println("Отрицательная дробь -2/4 (должна быть -1/2): " + negativeFraction);

        Fraction3 negativeDenominator1 = new Fraction3(2, -4);
        System.out.println("Дробь с отрицательным знаменателем 2/-4 (должна быть -1/2): " + negativeDenominator);

        // Проверка работы с целыми числами
        Fraction3 addInteger1 = fraction3.add(1);
        System.out.println("1/2 + 1 (должно быть 3/2): " + addInteger);

        Fraction3 subtractInteger1 = fraction3.subtract(1);
        System.out.println("1/2 - 1 (должно быть -1/2): " + subtractInteger);

        Fraction3 multiplyInteger1 = fraction3.multiply(3);
        System.out.println("1/2 * 3 (должно быть 3/2): " + multiplyInteger);

        Fraction3 divideInteger1 = fraction3.divide(2);
        System.out.println("1/2 / 2 (должно быть 1/4): " + divideInteger);

        // Проверка ошибки деления на ноль
        try {
            Fraction3 zeroDenominator1 = new Fraction3(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при создании дроби с нулевым знаменателем: " + e.getMessage());
        }

        try {
            fraction3.divide(new Fraction3(0, 1));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка при делении на дробь с нулевым числителем: " + e.getMessage());
        }
        //Задача 3.3 то же самое, что и задача 1.4, поэтому можно будет только изменить везде Fraction на Fraction3

        //Задача 4.2 Fraction4 абстрактный класс, подтип класса Number
        System.out.println("\nЗадача 4 №2 Дробь это число \n");
        Fraction2 shot1 = new SimpleFraction(1, 2);
        Fraction2 shot2 = new SimpleFraction(3, 4);

        System.out.println("Дробь 1: " + shot1);
        System.out.println("Дробь 2: " + shot2);

        System.out.println("Целочисленное деление " + shot1 + " в intValue выглядит как: " + shot1.intValue());
        System.out.println("Целочисленное деление " + shot1 + " в longValue выглядит как: " + shot1.longValue());
        System.out.println("Деление с приведением к десятичной дроби из " + shot1 + " в floatValue: " + shot1.floatValue());
        System.out.println("Деление с приведением к десятичной дроби из " + shot1 + " в doubleValue: " + shot1.doubleValue());

        System.out.println("Целочисленное деление " + shot2 + " в intValue выглядит как: " + shot2.intValue());
        System.out.println("Целочисленное деление " + shot2 + " в longValue выглядит как: " + shot2.longValue());
        System.out.println("Деление с приведением к десятичной дроби из " + shot2 + " в floatValue: " + shot2.floatValue());
        System.out.println("Деление с приведением к десятичной дроби из " + shot2 + " в doubleValue: " + shot2.doubleValue());

        //Задача 5.1 Добавили метод на сложение дробей
        System.out.println("\nЗадача 5 №1 Сложение дробей \n");
        // Сложение: 2 + 3/5 + 2.3
        double result1 = Fraction4.sumNumbers(2, new Fraction4(3, 5), 2.3);
        System.out.println("2 + 3/5 + 2.3 = " + result1);

        // Сложение: 3.6 + 49/12 + 3 + 3/2
        double result2 = Fraction4.sumNumbers(3.6, new Fraction4(49, 12), 3, new Fraction4(3, 2));
        System.out.println("3.6 + 49/12 + 3 + 3/2 = " + result2);

        // Сложение: 1/3 + 1
        double result3 = Fraction4.sumNumbers(new Fraction4(1, 3), 1);
        System.out.println("1/3 + 1 = " + result3);

        //Задача 7.3 Возведение в степень
        Scanner scanner = new Scanner(System.in);
        Main methods = new Main();
        System.out.println("\nЗадача 7 №3 Возведение в степень\n");

        System.out.print("Введите число, которое будет возводиться в степень: ");
        String x = scanner.nextLine();
        System.out.print("Введите степень: ");
        String y = scanner.nextLine();

        String[] numbers = new String[2];
        numbers[0] = x;
        numbers[1] = y;

        try {
            // Вызываем метод calculateExtent с аргументами командной строки
            double result = calculateExtent(numbers[0] , numbers[1] );
            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Пожалуйста, вводите только целые числа.");
        }
    }
}