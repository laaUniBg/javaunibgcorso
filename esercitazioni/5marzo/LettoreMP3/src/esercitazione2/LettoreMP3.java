package esercitazione2;

public class LettoreMP3 {
	// final significa che 'numeroSerie' posso inizializziarlo e basta una sola volta
	private final int numeroSerie;
	
	public LettoreMP3(int numeroSerie) {
//		this.numeroSerie=numeroSerie;
		this.setNumeroSerie(numeroSerie);
	}
	
	// i setter sono più critici dei getter
//	public void setNumeroSerie(int numeroSerie) {
//		this.numeroSerie=numeroSerie;
//	}
	
	public int getNumeroSerie() {
		return this.numeroSerie;
	}
	
	//oggetti mutabili dove lo stato puo cambiare
	//oggetti immutabili dove lo stato non puo cambiare. -> uso private o non uso i setter
}
