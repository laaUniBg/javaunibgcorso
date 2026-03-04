package Frazione;

public class Persona {
	public int eta; // se è private è meglio perche puoi sare metodi per controllare con il set per usare dati corretti
	
	public Persona(int etapersona) {
		if(etapersona<0) {
			eta=0;
		}
		eta=etapersona;
	};
	public void setEta(int etapersona) {
		if(etapersona<0) {
			eta=0;
		}
		eta=etapersona;
	}
}
