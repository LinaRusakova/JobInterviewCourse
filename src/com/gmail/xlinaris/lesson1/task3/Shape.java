package com.gmail.xlinaris.lesson1.task3;

import java.util.Arrays;

import static java.lang.Math.pow;

public abstract class Shape {

    double side;

    // В родительском классе создаем абстрактный метод для расчета длины сторон фигуры без реализации
    public abstract double calculateLengthSides();

    // В родительском классе создаем метод для расчета площади фигуры
    public double calculateArea(double a) {
        this.side = a;
        return Math.pow(side, 2);
    }


}
