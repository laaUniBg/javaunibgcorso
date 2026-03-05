package esercitazione2;

public class LettoreMP3 {
	private int numeroSerie;
	
	public LettoreMP3(int numeroSerie) {
		if(numeroSerie <0) {
			throw new IllegalArgumentException("Non puoi " + "creare un " + "MP3 con seriale");
		}
		this.setNumeroSerie(numeroSerie);
	}
	
	public void setNumeroSerie(int numeroSerie) {
		if(numeroSerie <0) {
			throw new IllegalArgumentException("Non puoi " + "creare un " + "MP3 con seriale");
		}
		this.numeroSerie=numeroSerie;
	}
	
	public int getNumeroSerie() {
		return this.numeroSerie;
	}
}
