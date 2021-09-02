package com.gmail.xlinaris.lesson1.task3;

public class Circle extends Shape {
    double radius;

    // определим реализацию метода CalculateLengthSides для расчета длины окружности круга
    @Override
    public double calculateLengthSides() {
        return 2 * Math.PI * side;
    }

    // используем перегруженный метод calculateArea для расчета площади круга
    public double calculateArea(double a) {
        this.radius = side;
        return Math.PI * Math.pow(2 * radius, 2);
    }
}
