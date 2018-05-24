package AyE_Practica6;

public class Vector3D extends Punto {
	private float z;
	
	public Vector3D() {
		x=0;
		y=0;
		z=0;
	}
	public Vector3D(float pX, float pY, float pZ) {
		x=pX;
		y=pY;
		z=pZ;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	public static void sumarPuntos(Vector3D v1, Vector3D v2) {
		Vector3D resultado = new Vector3D();
		float aux;
		aux=v1.x+v2.x;
		resultado.setX(aux);
		aux=0;
		aux=v1.y+v2.y;
		resultado.setY(aux);
		aux=0;
		aux=v1.z+v2.z;
		resultado.setZ(aux);
		System.out.println("La suma de los puntos es: "+ resultado.toString() );
	}
	@Override
	public String toString() {
		return "Vector3D x=" + x + ", y=" + y + ", z=" + z;
	}
		
		public static boolean sonIguales (Vector3D v1, Vector3D v2) {
			if (v1.x==v2.x && v1.y==v2.y && v1.z==v2.z) {
				System.out.println("Son iguales");
				return true;
			} else {
				System.out.println("Son distintos");
				return false;
			}
		}
	}


