package dds;

public class Auto {
	double temperatura;
	boolean estaEncendido;
	int combustible;
	
	/*Cuando un auto se enciende, aumenta 70° la temperatura de su motor y consume el 0.001% del 
	 * combustible.
• Cuando un auto se detiene, aumenta la temperatura en 0.04° multiplicado por la velocidad que tenía 
el auto al momento que se le dio la orden de frenado.*/
	
	public void encender() {
		estaEncendido = true;
		this.aumentarTemperatura(70);
		this.consumirCombustible(0.001*combustible);
	}
	
	public void aumentarTemperatura(double aumento) {
		temperatura += aumento;
	}
	
	public void consumirCombustible(double consumo) {
		combustible -= consumo;
	}
}
