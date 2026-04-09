package Encapsulacion;

public class CuentaBancaria {
	
	private String titular;
	private double saldo;
	private int pin;
	
	public CuentaBancaria(String titular, double saldo, int pin) {
		super();
		this.titular = titular;
		this.saldo = saldo;
		this.pin = pin;
	}
	public void retirar(double monto, int pinIngresado) {
        if (pinIngresado == pin) {

            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro realizado. Saldo restante: " + saldo);
            } else {
                System.out.println("Error, saldo insuficiente");
            }
        } else {
            System.out.println("Error, PIN incorrecto");
        }
    }
    public String mostrar() {
        return "Titular: " + titular + "\n" +
               "Saldo: " + saldo + "\n";
    }
	
	
}
