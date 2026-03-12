package esercitazione2_1;

public class Main {
	public static void main(String[] args) {
		SetInteri ins = new SetInteri(10);
		ins.inserisci(3);
		ins.stampa();
		System.out.println("------");
		ins.inserisci(7);
		ins.stampa();
		System.out.println("------");
		ins.inserisci(9);
		ins.stampa();
		System.out.println("------");
		ins.rimuovi(3);
		ins.stampa();
		
	}
};
