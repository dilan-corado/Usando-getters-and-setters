package Encapsulacion;

public class Curso {
	
	private String nombreCurso;
	private double nota1, nota2, nota3;
	
	public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
		this.nombreCurso = nombreCurso;
		setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		if (nota1 >= 0 && nota1 <= 100) {
            this.nota1 = nota1;
        } else {
            System.out.println("Error, nota1 fuera de rango");
            this.nota1 = 0; }
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		 if (nota2 >= 0 && nota2 <= 100) {
	            this.nota2 = nota2;
	        } else {
	            System.out.println("Error, nota2 fuera de rango");
	            this.nota2 = 0; }
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		if (nota3 >= 0 && nota3 <= 100) {
            this.nota3 = nota3;
        } else {
            System.out.println("Error, nota3 fuera de rango");
            this.nota3 = 0; }
	}
	public double promedio() {
        double prom = (nota1 + nota2 + nota3) / 3;
        return Math.round(prom * 100.0) / 100.0;
    }

    public String estado() {
        if (promedio() >= 61) {
            return "Aprobado";
        } else {
            return "Reprobado"; }
    }

    public String mostrar() {
        return "Curso: " + nombreCurso + "\n" +
               "Promedio: " + promedio() + "\n" +
               "Estado: " + estado() + "\n";
    }
}
