package Encapsulacion;

public class Persona {

	private String nombre, apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
		else  {
			System.out.println("Error la edad no puede ser negativa"); 
			this.edad = 0;
		}
	}
	
	  public String mostrar() {
	        return "Nombre: " + nombre + "\n" +
	               "Apellido: " + apellido + "\n" +
	               "Edad: " + edad + "\n";
	    }
	}
	
	
