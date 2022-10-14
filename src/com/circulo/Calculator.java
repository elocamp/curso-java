package com.circulo;

public class Calculator {
    public double radius;

    public static final double PI = 3.14;

    public static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }

    public static double calculateVolume(double radius)
    {
        return  (4 * PI * Math.pow(radius, 3)) / 3;
    }

    public String toString() {
        return "Circumference: " + calculateCircumference(radius) +
                "\nVolume: " + calculateVolume(radius) +
                "\nPI value: " + PI;
    }
}
