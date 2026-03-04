package Frazione;

public class Frazione {
	private int numeratore;
	private int denominatore;
	
	public Frazione(int num, int den) {
		numeratore=num;
		denominatore=den;
	}
	
	public static void main(String[] args) {
		
	}
	
	public void stampa() {
		Frazione pippo=new Frazione(5,2);
		System.out.println(numeratore / denominatore);
	}
}
