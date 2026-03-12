package esercitazione2_1;

// non finito

public class SetInteri {
	private int[] numArray;
	private int nElementi;
	
	public SetInteri(int maxSize) {
		this.numArray = new int[maxSize];
		this.nElementi=0;
	};
	
	public void inserisci(int n) {
		// un idea è ogni volta che arrivi alla fine, creare un array lungo il doppio e coppiare le cose li e poi sostituire e cosi via
		if(nElementi==this.numArray.length) {
			int[] array2=new int[this.numArray.length*2];
			for(int i=0; i<this.numArray.length;i++) {
				array2[i]=this.numArray[i];
			}
			this.numArray=array2;
		}
		
		if(!this.contains(n)) {
			this.numArray[nElementi]=n;
			nElementi++;
		}
	}
	
	public void rimuovi(int num) {
		boolean found=true;
		for(int i=0; i<nElementi; i++) {
			if(this.numArray[i]==num) {
				found=true;
			}
			if(found==true) {
				this.numArray[i]=this.numArray[i+1];
			}
		}
		nElementi--;
	}
	
	public boolean contains(int n) {
		for(int i=0; i<this.nElementi;i++) {
			if(this.numArray[i]==n) return true;
		}
		return false;
	}
	
	public void stampa() {
		for(int i=0; i<nElementi;i++) {
			this.numArray[nElementi]=num;
		}//da finire
	}
	

	
}
