package ru.Zybareva.math;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
public class Extent {

    // Метод возводит число X в степень Y, полученные в виде строк
    public static double calculateExtent(String xStr, String yStr) {
        int x = parseInt(xStr);    // Преобразуем строку X в целое число
        int y = parseInt(yStr);    // Преобразуем строку Y в целое число
        return pow(x, y);          // Возводим X в степень Y
    }

}

