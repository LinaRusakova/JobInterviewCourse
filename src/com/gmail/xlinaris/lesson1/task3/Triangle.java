package com.gmail.xlinaris.lesson1.task3;

public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;

    // определим реализацию метода CalculateLengthSides для расчета длины сторон треугольника
    @Override
    public double calculateLengthSides() {
        return sideC + sideB + sideA;
    }

    // используем перегруженный метод calculateArea для расчета площади треугольника
    public double calculateArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
