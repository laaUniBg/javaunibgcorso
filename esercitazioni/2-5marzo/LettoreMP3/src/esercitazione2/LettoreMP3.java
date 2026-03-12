package esercitazione2;

// Stampino
// lista interi in cui gli elementi non sono ripetuti
// inserire
// togliere
// stampare
// usare come attributo un array

public class LettoreMP3 {
	private int numeroSerie;
//	private int[] numeroSerieUsati=new int[10];
//	private int numerodiLettoriMP3;
	
	public LettoreMP3(int numeroSerie) {
		if(numeroSerie <0) {
			throw new IllegalArgumentException("Non puoi " + "creare un " + "MP3 con seriale");
		}
		this.numeroSerie=numeroSerie;
		
		// verificare che non sia dentro numeriSerieUsati
		
//		numeriSerieUsati[numerodiLettoriMP3]=numeroSerie;
//		numerodiLettoriMP3++;
//		this.numeroSerie=numeroSerie;
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
