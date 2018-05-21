package AyE_Practica6;

public class PruebasPractica6 {

	public static void main(String[] args) {
		Lamparita objLamp1 = new Lamparita();
		System.out.println("La lamparita esta: " + objLamp1.getEstado());
		objLamp1.Encender();
		System.out.println("La lamparita esta: " + objLamp1.getEstado());
		
	}

}
