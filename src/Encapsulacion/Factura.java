package Encapsulacion;

public class Factura {
	 private String codigoFactura;
	    private String descripcion;
	    private int cantidad;
	    private double precioUnitario;

	    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
	        this.codigoFactura = codigoFactura;
	        this.descripcion = descripcion;
	        setCantidad(cantidad);
	        setPrecioUnitario(precioUnitario);
	    }

	    public String getCodigoFactura() {
	        return codigoFactura;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }

	    public void setCantidad(int cantidad) {
	        if (cantidad > 0) {
	            this.cantidad = cantidad;
	        } else {
	            System.out.println("Error, cantidad inválida");
	            this.cantidad = 1;
	        }
	    }

	    public double getPrecioUnitario() {
	        return precioUnitario;
	    }

	    public void setPrecioUnitario(double precioUnitario) {
	        if (precioUnitario > 0) {
	            this.precioUnitario = precioUnitario;
	        } else {
	            System.out.println("Error, precio inválido");
	            this.precioUnitario = 1;
	        }
	    }

	    public double calcularTotal() {
	        return cantidad * precioUnitario;
	    }

	    public String mostrarFactura() {
	        return "Código: " + codigoFactura + "\n" +
	               "Descripción: " + descripcion + "\n" +
	               "Cantidad: " + cantidad + "\n" +
	               "Precio Unitario: " + precioUnitario + "\n" +
	               "Total: " + calcularTotal() + "\n";
	    }
}
