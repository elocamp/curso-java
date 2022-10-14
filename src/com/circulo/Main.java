package com.circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator;
        calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        calculator.radius = scanner.nextDouble();

        System.out.println(calculator);

        scanner.close();
    }
}