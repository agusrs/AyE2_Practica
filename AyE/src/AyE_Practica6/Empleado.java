package AyE_Practica6;
/*Implemente la clase Empleado, que contenga como atributos miembros el número y
nombre de empleado, y los siguientes métodos miembros:
a) getNumero(): Obtiene el número del empleado dado
b) getNombre(): Obtiene el nombre del empleado dado
c) setNumero(int num): Modifica el número del empleado dado
d) setNombre(String nom): Modifica el nombre del empleado dado
e) verDatos(): Visualiza los datos del empleado por standard output
*/

public class Empleado {
	private int numero;
	private String nombre;
	
	public Empleado() {
		numero=0;
		nombre=" ";
	}
	
	public Empleado(int nu, String no) {
		numero=nu;
		nombre=no;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void verDatos() {
		System.out.println("Empleado: "+numero+" Nombre: "+nombre);
	}

}
