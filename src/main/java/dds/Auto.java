package dds;

//interface estado, para no tener muchas validaciones en la clase auto (COHESION de la clase)

public class Auto {
	double temperatura;
	int combustible;
	int capacidadDeCombustible;
	int velocidad;
	boolean enLaReserva;
	Estado estado;
	
	/*Auto(int combustible, int capacidadDeCombustible){
		this.combustible = combustible;
		this.capacidadDeCombustible = capacidadDeCombustible;
	}*/
	
	public void encender() {
		this.estado.encender(this);
	}
	
	public void apagar() {
		this.estado.apagar(this);
	}
	
	public void acelerarA(int velocidad) {
		this.estado.acelerarA(this,velocidad);
	}
	
	public void detener() {
		this.estado.detener(this);
	}
	
	public void aumentarTemperatura(double aumento) {
		this.temperatura += aumento;
	}
	
	public void consumirCombustible(double consumo) {
		this.combustible -= consumo;
	}
	
	public boolean estaEnLaReserva() {
		return this.enLaReserva;
	}
	
	public boolean estaCaliente() {
		return this.temperatura>=95;
	}
	
	//public double porcentajeRestanteCombustible() {
	//}
	
	
}
