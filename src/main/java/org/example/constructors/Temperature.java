package org.example.constructors;
//Static Fabric method
public class Temperature {
    private final double celsius;

    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    public static Temperature fromCelcius(double celsius) {
        return new Temperature(celsius);
    }
    public static Temperature fromFahrenheit(double f) {
        return new Temperature(f * 1.8 + 32);
    }

    public static Temperature fromKelvin(double k) {
        return new Temperature(k-273.15);
    }

    public double toCelcius() {
        return celsius;
    }

    public double toFahrenheit() {
        return celsius * 1.8 + 32;
    }
    public double toKelvin() {
        return celsius * 273.15;
    }

    @Override
    public String toString() {
        return String.format("%.2f", celsius);
    }
}
