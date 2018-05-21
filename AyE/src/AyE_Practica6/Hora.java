package AyE_Practica6;

/*Implemente la clase Hora que contenga miembros datos separados para
almacenar horas, minutos y segundos. Un constructor inicializará estos datos en
0 y otro a valores dados. Una función miembro deberá visualizar la hora en
formato hh:mm:ss. Otra función miembro sumará dos objetos de tipo hora,
retornando la hora resultante. Realizar otra versión de la suma que asigne el
resultado de la suma en el primer objeto hora.
b) Programar un procedimiento main(), que cree dos horas inicializadas y uno que
no lo esté. Se deberán sumar los dos objetos inicializados, dejando el resultado
en el objeto no inicializado. Por último, se pide visualizar el valor resultante*/


public class Hora {
	private int horas;
	private int minutos;
	private int segundos;

	public Hora() {
		horas=0;
		minutos=0;
		segundos=0;
	}
	public Hora(int h, int m, int s) {
		horas=h;
		minutos=m;
		segundos=s;
		corregirHora();		
	}
	private void corregirHora() {
		if (segundos<0) {
			segundos=0;
		} else {
			if (segundos>60) {
				while (segundos>60) {
					segundos-=60;
					minutos+=1;
				}
			}
		}
		if (minutos<0) {
			minutos=0;
		} else {
			while (minutos>60) {
				minutos-=60;
				horas+=1;
			}
		}
		
	}
	public String toString() {
		return horas + ":" + minutos + ":" + segundos;
	}
	
	public void sumar(Hora h2) {
		segundos+=h2.segundos;
		minutos+=h2.minutos;
		horas+=h2.horas;
		corregirHora();
	}
	
	public void clone(Hora h) {
		segundos = h.segundos;
		minutos = h.minutos;
		horas = h.horas;
	}
	
	public static Hora sumar(Hora h1, Hora h2) {
		Hora h3 = new Hora();
		h3.clone(h1);
		h3.sumar(h2);
		return h3;
		
		
		
	}

}
