package month02.week03.day02;

import java.util.Scanner;

public class TemperatureConverter {
    static double celsiusToFahrenheit(double c){
        return (c * 9 / 5)+ 32;
    }

    static double celsiusToKelvin(double c){
        return c + 273.15;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter celsius: " );
        double c = input.nextDouble();
        System.out.println("--- Hurvuulelt ---");
        System.out.println("Celsius: " + c);
        System.out.println("Fahrenheit: " +celsiusToFahrenheit(c));
        System.out.println("Kelvin: "+ celsiusToKelvin(c));
    }
}
