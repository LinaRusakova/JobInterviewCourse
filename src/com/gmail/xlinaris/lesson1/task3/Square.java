package com.gmail.xlinaris.lesson1.task3;

public class Square extends Shape {
    int sideA;

    // определим реализацию метода CalculateLengthSides расчета длины сторон квадрата
    @Override
    public double calculateLengthSides() {
        return (double) sideA * 4;
    }

    // используем перегруженный метод calculateArea для расчета площади квадрата
    public double calculateArea(int a) {
        this.sideA = a;
        return (double) Math.pow(a, 2);
    }


}
