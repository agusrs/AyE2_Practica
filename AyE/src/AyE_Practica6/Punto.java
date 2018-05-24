package AyE_Practica6;

public class Punto {
	private float x;
	private float y;
	
	public Punto() {
		x=0;
		y=0;
	}
	public Punto(float pX, float pY) {
		x=pX;
		y=pY;
	}
	
	public void setX(float pX) {
		x=pX;
	}
	public void setY(float pY) {
		y=pY;
	}
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public static void sumarPuntos(Punto p1, Punto p2) {
		Punto resultado = new Punto();
		float aux;
		aux=p1.x+p2.x;
		resultado.setX(aux);
		aux=0;
		aux=p1.y+p2.y;
		resultado.setY(aux);
		System.out.println("La suma de los puntos es: "+ resultado.toString() );
	}
	@Override
	public String toString() {
		return "Resultado: x=" + x + ", y=" + y ;
	}
	public static boolean sonIguales( Punto p1, Punto p2) {
		if (p1.x==p2.x && p1.y==p2.y) {
			System.out.println("Son iguales");
			return true;
		} else {
			System.out.println("Son distintos");
			return false;
		}
		}
		
	}


