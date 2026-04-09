package Encapsulacion;

public class Termometro {
	private double celsius;

    public Termometro(double celsius) {
        setCelsius(celsius);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double temperatura) {
        if (temperatura >= -273.15) {
            this.celsius = temperatura;
        } else {
            System.out.println("Error, temperatura menor al cero absoluto");
            this.celsius = -273.15;
        }
    }

    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public String mostrar() {
        return "Celsius: " + celsius + "\n" +
               "Fahrenheit: " + getFahrenheit() + "\n";
    }

}
