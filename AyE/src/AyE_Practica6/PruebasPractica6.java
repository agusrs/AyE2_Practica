package AyE_Practica6;

public class PruebasPractica6 {

	public static void main(String[] args) {
		/*Ejercicio
		 * Lamparita objLamp1 = new Lamparita();
		System.out.println("La lamparita esta: " + objLamp1.getEstado());
		objLamp1.Encender();
		System.out.println("La lamparita esta: " + objLamp1.getEstado());*/
		
		/*Ejercicio 6
		 * Hora h1 = new Hora(2, 80, 900);
		 
		Hora h2 = new Hora(4, 40, 500);
		System.out.println("La hora es: " + h1);
		
		System.out.println("La suma de h1 y h2 es (static): " + Hora.sumar(h1, h2));
		h1.sumar(h2);
		System.out.println("la suma de h1 y h2 es: " + h1);
		*/
		
		/*Ejercicio 7
		Empleado emp = new Empleado();
		emp.verDatos();
		
		Empleado emp2 = new Empleado(2, "Marc");
		emp2.verDatos();
		*/
		
		/*Ejeercicio 8
		  Punto p1=new Punto();
		 
		Punto p2 = new Punto(3, 5);
		
		System.out.println("x= " + p1.getX() + "y= " + p1.getY());
		
		Punto.sumarPuntos(p1, p2);
		Punto.sonIguales(p1,p2);
		*/
		
		Vector3D v1  = new Vector3D(1, 2, 3);
		Vector3D v2  = new Vector3D(4, 5, 6);
		
		Vector3D.sumarPuntos(v1, v2);
		Vector3D.sonIguales(v1, v2);
	}

}
