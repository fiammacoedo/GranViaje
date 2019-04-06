package dds;

public class Encendido extends Estado {

	@Override public void encender(Auto auto) {
		throw new YaEncendidoException("El auto ya esta encendido");
	}
	
	@Override public void acelerarA(Auto auto, int velocidad) {
		auto.aumentarTemperatura(0.2*velocidad);
	}
	
	@Override public void apagar(Auto auto) {
		auto.temperatura = 0;
	}
	
	@Override public void detener(Auto auto) {
		auto.aumentarTemperatura(0.4*auto.velocidad);
	}
}
