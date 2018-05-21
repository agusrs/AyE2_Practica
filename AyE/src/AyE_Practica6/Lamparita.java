package AyE_Practica6;

public class Lamparita {
	enum EstadoLampara {ENCENDIDA, APAGADA};
	private EstadoLampara estado;
	//private boolean estado
	
	public Lamparita() {
		estado=EstadoLampara.APAGADA;
	}
	
	public void Encender(){
		estado = EstadoLampara.ENCENDIDA;
	}
	public void Apagar() {
		estado = EstadoLampara.APAGADA;
	}
	
	public EstadoLampara getEstado() {
		return estado;
	}
	

}
