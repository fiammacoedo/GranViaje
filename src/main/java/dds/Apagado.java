package dds;

public class Apagado extends Estado {
	
	@Override public void encender(Auto auto) {
		auto.aumentarTemperatura(70);
		auto.consumirCombustible(0.001*auto.combustible);
	}
	
	@Override public void acelerarA(Auto auto, int velocidad) {}
	
	@Override public void apagar(Auto auto) {}
	
	@Override public void detener(Auto auto) {}
}
