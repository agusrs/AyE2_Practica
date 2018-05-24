package AyE_Practica6;

public class Monedero {
	private double dinero;
	
	public Monedero() {
		dinero=0;
	}
	public Monedero(double pD) {
		dinero=pD;
	}
	public double consultarDinero() {
		System.out.println("Tu saldo es de: " + dinero);
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public void agregarDinero(double dinero) {
		this.dinero+=dinero;
		System.out.println("Agregaste: " + dinero + ", Te quedan: " + this.dinero);
	}
	public void sacarDinero(double dinero) {
		if (this.dinero - dinero >= 0) {
			this.dinero -= dinero;
			System.out.println("Sacaste: " + dinero + ", Te quedan: " + this.dinero);
		} else {
			System.out.println("No tiene dinero suficiente, le faltan: " + (this.dinero - dinero) * -1);
		}

	}
	

	

}
