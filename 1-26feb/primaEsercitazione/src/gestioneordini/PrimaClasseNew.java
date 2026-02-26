package gestioneordini;
import java.util.Scanner;

public class PrimaClasseNew {
//	un solo main
//	static è important
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Benvenuti al corso1");
		String nome=sc.nextLine();
		System.out.println("Ciao il tuo è " + nome);
		sc.close();
		
		Bike bike1=new Bike();
		Bike bike2=new Bike();
	};
}
