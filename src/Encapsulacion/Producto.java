package Encapsulacion;

public class Producto {
	private String codigo;
	private String nombre; 
	private double precio;
	private int stock;
	
	public Producto(String codigo, String nombre, double precio, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		setPrecio(precio);
		setStock(stock);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		} else { System.out.println("Error, El precio debe ser mayor a 0"); 
			this.precio = 0; }
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock >= 0) {
			this.stock = stock;
		} else { System.out.println("Error, el stock no puede ser negativo");
			this.stock = 0; }
		}
	public void vender(int cantidad) {
		if (precio <= 0) {
	        System.out.println("Error, el producto no tiene un precio válido");
	        return;
	    }
		
		if (cantidad <= 0) {
	        System.out.println("Error, cantidad inválida");
	        return;
		}
		
		if (cantidad <= stock) {
			stock -= cantidad;
			System.out.println("Venta realizada, stock restante: " + stock);
		} else { System.out.println("Error: no hay suficiente stock");}
	}

	 public String mostrar() {
	        return "Código: " + codigo + "\n" +
	               "Nombre: " + nombre + "\n" +
	               "Precio: " + precio + "\n" +
	               "Stock: " + stock + "\n";
	    }

	}

	