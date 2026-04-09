package Encapsulacion;

public class Estudiante {
	
	private String carnet;
	private String nombre;
	private double promedio;
	
	public Estudiante(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        setPromedio(promedio);
    }
	
	public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        } else {
            System.out.println("Error, promedio fuera de rango");
            this.promedio = 0;
        }
    }

    public boolean esBecado() {
        return promedio >= 85;
    }

    public String mostrar() {
        return "Carnet: " + carnet + "\n" +
               "Nombre: " + nombre + "\n" +
               "Promedio: " + promedio + "\n" +
               "Becado: " + (esBecado() ? "Sí" : "No") + "\n";
    }
}
