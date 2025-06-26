package org.example;

import org.example.constructors.Temperature;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = Temperature.fromCelcius(32);
        Temperature temperature2 = Temperature.fromFahrenheit(32);
        Temperature temperature3 = Temperature.fromKelvin(300);
        System.out.println(temperature);
        System.out.println(temperature2.toCelcius());
        System.out.println(temperature3.toFahrenheit());
        System.out.println(temperature3.toKelvin());
        System.out.println(temperature3.toCelcius());
    }
}