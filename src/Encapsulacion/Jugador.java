package Encapsulacion;

public class Jugador {
	
	    private String nombre;
	    private int puntajeActual;
	    private int puntajeMaximo;

	    public Jugador(String nombre, int puntajeActual) {
	        this.nombre = nombre;
	        setPuntajeActual(puntajeActual);
	        this.puntajeMaximo = this.puntajeActual;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getPuntajeActual() {
	        return puntajeActual;
	    }

	    public void setPuntajeActual(int puntajeActual) {
	        if (puntajeActual >= 0) {
	            this.puntajeActual = puntajeActual;
	        } else {
	            System.out.println("Error, el puntaje no puede ser negativo");
	            this.puntajeActual = 0;
	        }
	    }

	    public int getPuntajeMaximo() {
	        return puntajeMaximo;
	    }

	    public void actualizarPuntaje(int nuevoPuntaje) {
	        if (nuevoPuntaje >= 0) {
	            puntajeActual = nuevoPuntaje;

	            if (nuevoPuntaje > puntajeMaximo) {
	                puntajeMaximo = nuevoPuntaje;
	            }
	        } else {
	            System.out.println("Error, puntaje inválido");
	        }
	    }

	    public String mostrar() {
	        return "Nombre: " + nombre + "\n" +
	               "Puntaje Actual: " + puntajeActual + "\n" +
	               "Puntaje Máximo: " + puntajeMaximo + "\n";
	    }
	}

