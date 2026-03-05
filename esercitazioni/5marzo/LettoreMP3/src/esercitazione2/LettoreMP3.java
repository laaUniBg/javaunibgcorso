package esercitazione2;

public class LettoreMP3 {
	// final significa che 'numeroSerie' posso inizializziarlo e basta una sola volta
	private final int numeroSerie;
	
	public LettoreMP3(int numeroSerie) {
		this.numeroSerie=numeroSerie;
//		this.setNumeroSerie(numeroSerie);
	}
	
	public int getNumeroSerie() {
		return this.numeroSerie;
	}
}
