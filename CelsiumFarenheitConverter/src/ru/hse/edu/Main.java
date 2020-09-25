package ru.hse.edu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter \"c\" to convert celsius to fahrenheit or \"f\" to convert fahrenheit to celsius...");
        String tempUnit = in.nextLine();
        if (tempUnit.equals("c")) {
            System.out.println("Enter celsius:");
            double celsius = in.nextDouble();
            double fahrenheit = celsius2Fahrenheit(celsius);
            System.out.println("Fahrenheit: " + fahrenheit);
        } else if (tempUnit.equals("f")) {
            System.out.println("Enter fahrenheit:");
            double fahrenheit = in.nextDouble();
            double celsius = fahrenheit2Celsius(fahrenheit);
            System.out.println("Celsius: " + celsius);
        } else {
            System.out.println("Unknown temperature unit...");
        }
    }

    static double celsius2Fahrenheit(double celsius) {
        double fahrenheit = celsius * 9d / 5d + 32;
        return fahrenheit;
    }

    static double fahrenheit2Celsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5d / 9d;
        return celsius;
    }
}
