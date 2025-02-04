package com.method.LevelTwo;

import java.util.Scanner;

public class UnitConverterSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double farhenheit = in.nextDouble();
        double celsius = in.nextDouble();
        double pounds = in.nextDouble();
        double kg = in.nextDouble();
        double gallons = in.nextDouble();
        double litres = in.nextDouble();

        System.out.println(farhenheitToCelsius(farhenheit));
        System.out.println(celsiusTofarhenheit(celsius));
        System.out.println(poundsToKilogram(pounds));
        System.out.println(kilogramToPounds(kg));
        System.out.println(gallonsToLitres(gallons));
        System.out.println(litresToGallons(litres));
    }
    static double farhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }
    static double celsiusTofarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    static double poundsToKilogram(double pounds) {
        return pounds*0.453592;
    }
    static double kilogramToPounds(double kg) {
        return kg*2.20462;
    }
    static double gallonsToLitres(double gallons) {
        return gallons*3.78541;
    }
    static double litresToGallons(double litres) {
        return litres*0.264172;
    }
}
