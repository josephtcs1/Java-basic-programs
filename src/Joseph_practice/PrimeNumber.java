package Joseph_practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=7;
		boolean prime =true;
		for(int i=2;i<n;i++) {
			if(n%2==0) {
				prime = false;
				break;
			}
		}
		System.out.println(prime);
		
	}

}
