package dds;

public abstract class Estado {
	public abstract void encender(Auto auto);
	
	public abstract void detener(Auto auto); 
	
	public abstract void acelerarA(Auto auto, int velocidad); 
	
	public abstract void apagar(Auto auto);
}
