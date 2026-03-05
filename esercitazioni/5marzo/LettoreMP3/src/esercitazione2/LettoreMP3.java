package esercitazione2;

public class LettoreMP3 {
	private int numeroSerie;
	
	public LettoreMP3(int numeroSerie) {
//		this.numeroSerie=numeroSerie;
		this.setNumeroSerie(numeroSerie);
	}
	
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie=numeroSerie;
	}
	
	public int getNumeroSerie() {
		return this.numeroSerie;
	}
}
