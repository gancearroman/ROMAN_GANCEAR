package org.example.homework_nr_3;

public class TemperatureConverter {

    public static double toCelsius(double f){
        return (f-32) * 5 / 9;
    }
    public static double toFahrenheit(double c){
         return  1.8 * c + 32;
    }
    public static void main(String[] args){

        double CelsiusTemperature = 18;
        double FahrenheitTemperature = 75;

        System.out.println("Температура " + CelsiusTemperature + "градусов Цельсия = " + toFahrenheit(CelsiusTemperature) + "градусов Фарентгейта");
        System.out.println("Температура " + FahrenheitTemperature + "градусов Фаренгейта = " + toCelsius(FahrenheitTemperature) + "градусов Цельсия");

    }
}
