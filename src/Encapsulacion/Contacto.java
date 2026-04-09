package Encapsulacion;

public class Contacto {
	
	 private String nombre;
	    private String telefono;
	    private String email;

	    public Contacto(String nombre, String telefono, String email) {
	        this.nombre = nombre;
	        setTelefono(telefono);
	        setEmail(email);
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        if (telefono.length() == 8 && telefono.matches("\\d+")) {
	            this.telefono = telefono;
	        } else {
	            System.out.println("Error, teléfono inválido");
	            this.telefono = "00000000";
	        }
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        if (email.contains("@")) {
	            this.email = email;
	        } else {
	            System.out.println("Error, email inválido");
	            this.email = "correo@default.com";
	        }
	    }

	    public String mostrarContacto() {
	        return "Nombre: " + nombre + "\n" +
	               "Teléfono: " + telefono + "\n" +
	               "Email: " + email + "\n";
	    }
}
