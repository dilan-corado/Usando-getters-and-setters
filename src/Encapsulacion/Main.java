package Encapsulacion;

public class Main {
	public static void main(String[] args) {
		
		//Ejercicio 1
		System.out.println("Ejercicio 1");
		System.out.println("");
		
		Persona p1 = new Persona ("Dilan", "Corado", -17);
		Persona p2 = new Persona ("Jesus", "Alvarado", 24);
		Persona p3 = new Persona ("Katherin", "Lopez", 21);
		
		System.out.println(p1.mostrar());
		System.out.println(p2.mostrar());
		System.out.println(p3.mostrar());
		
		
		//Ejercicio 2
		System.out.println("Ejercicio 2");
		System.out.println("");
		
		Producto prod1 = new Producto("001", "Laptop", 5000.0, 10);
		Producto prod2 = new Producto("002", "Mouse", -50.0, 5);
		Producto prod3 = new Producto("003", "Teclado", 150.0, -3);

		System.out.println(prod1.mostrar());
		System.out.println(prod2.mostrar());
		System.out.println(prod3.mostrar());


		prod1.vender(3);
		prod1.vender(20);
		prod2.vender(5);
		prod3.vender(1);
		
		System.out.println("");
		
		System.out.println(prod1.mostrar());
		System.out.println(prod2.mostrar());
		System.out.println(prod3.mostrar());
		
		//Ejercicio 3
		System.out.println("Ejercicio 3");
		System.out.println("");
		
		CuentaBancaria cuenta = new CuentaBancaria("Dilan", 1000.0, 1234);

		System.out.println(cuenta.mostrar());
		cuenta.retirar(200, 1111);
		System.out.println("");
		cuenta.retirar(200, 1234);
		System.out.println(cuenta.mostrar());
		
		//Ejercicio 4
		System.out.println("Ejercicio 4");
		System.out.println("");
		
		Curso c1 = new Curso("Matemática", 80, 70, 90);
		Curso c2 = new Curso("Programación", 50, 40, 60);
		Curso c3 = new Curso("Física", 100, -10, 85);

		System.out.println(c1.mostrar());
		System.out.println(c2.mostrar());
		System.out.println(c3.mostrar());
		
		//Ejercicio 5
		System.out.println("Ejercicio5");
		System.out.println("");
		
		Estudiante e1 = new Estudiante("001", "Dilan", 90);
		Estudiante e2 = new Estudiante("002", "Ana", 70);

		System.out.println(e1.mostrar());
		System.out.println(e2.mostrar());
		
		//Ejercicio 6
		System.out.println("Ejercicio6");
		System.out.println("");
		
		Termometro t1 = new Termometro(25);
		Termometro t2 = new Termometro(-300); 
		Termometro t3 = new Termometro(0);

		System.out.println(t1.mostrar());
		System.out.println(t2.mostrar());
		System.out.println(t3.mostrar());
		
		//Ejercicio 7
		System.out.println("Ejercicio7");
		System.out.println("");

		Reloj r1 = new Reloj(10, 30, 45);
		Reloj r2 = new Reloj(25, 70, 80); 
		Reloj r3 = new Reloj(3, 5, 9);

		System.out.println(r1.mostrarHora());
		System.out.println(r2.mostrarHora());
		System.out.println(r3.mostrarHora());
		System.out.println("");
		
		//Ejercicio 8
		System.out.println("Ejercicio 8");
		System.out.println("");

		Contacto cont1 = new Contacto("Dilan", "12345678", "dilan@gmail.com");
		Contacto cont2 = new Contacto("Ana", "1234", "anaemail.com");
		Contacto cont3 = new Contacto("Luis", "87654321", "luis@mail.com");

		System.out.println(cont1.mostrarContacto());
		System.out.println(cont2.mostrarContacto());
		System.out.println(cont3.mostrarContacto());
		
		//Ejercicio 9
		System.out.println("Ejercicio9");
		System.out.println("");
		
		Jugador j1 = new Jugador("Dilan", 50);

		System.out.println(j1.mostrar());

		j1.actualizarPuntaje(80); 
		j1.actualizarPuntaje(30);  
		j1.actualizarPuntaje(-10); 

		System.out.println(j1.mostrar());
		
		System.out.println("Ejercicio 10");
		System.out.println("");

		Factura f1 = new Factura("F001", "Laptop", 2, 5000);
		Factura f2 = new Factura("F002", "Mouse", -3, 50);     
		Factura f3 = new Factura("F003", "Teclado", 1, -100); 

		System.out.println(f1.mostrarFactura());
		System.out.println(f2.mostrarFactura());
		System.out.println(f3.mostrarFactura());
}
}
	
	


