package esercitazione2_1;

// non finito

public class SetInteri {
	private int numArray[]=new int[10];
	private int lastIndex = 0;
	
	public SetInteri() {};
	
	public void myPush(int n) {
		this.numArray[lastIndex] = n;
		lastIndex++;
	}
}
