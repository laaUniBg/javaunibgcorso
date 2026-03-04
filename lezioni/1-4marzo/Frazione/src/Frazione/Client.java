package Frazione;

public class Client {
	// main non si può fare private
	public static void main(String[] args) {
		Frazione f=new Frazione(2,3);
		int a=0;
		Integer b=new Integer(0); // per ogni tipo primitivo cè un suo oggetto anche se int è piu efficiente
		f.stampa();
		
		Persona p=new Persona(-100);
		p.eta=-1000;
		
		Punto punto=new Punto(6,7);
		// punto.x=5;
	}
}
