package aye2_practica7;

import java.util.ArrayList;

public class SistemaEscuela {
	
	private final static int LONGITUD_ARREGLO = 5;
	
	public static void main(String[] args) {
		
		//Arreglo estatico de personas
		Persona[] aPersona = new Persona[LONGITUD_ARREGLO];
		
		aPersona[0] = new Empleado();
		aPersona[1] = new Alumno();
		
		for (int i = 0; i < aPersona.length; i++) {
			System.out.println(i + ": " + aPersona[i]);
		}
		
		//Arreglo dinamico de personas
		ArrayList<Persona> aPersona2 = new ArrayList<>();
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		aPersona2.add(new Alumno());
		
		for (int i = 0; i < aPersona2.size(); i++) {
			System.out.println(i + ": " + aPersona2.get(i));
		}
		
		for (Persona p : aPersona2) {
			System.out.println(p);
		}
		

	}

}
