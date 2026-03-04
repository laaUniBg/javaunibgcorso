package Frazione;

public class Punto {
	private int x;
	private int y;
	
	// private int modulo
	// private int fase
	
	// se riesci,sempre mettere private e public solo se strettamente neccessaria
	// il public è una promessa fortissima
	// private mi da flessibilità (e mi permette di fare i sanity check)
	
	public Punto(int x_coordinata, int y_coordinata) {
		x=x_coordinata;
		y=y_coordinata;
	}
	
	public int distanzaOrigine() {
		return 0;
	}
}
