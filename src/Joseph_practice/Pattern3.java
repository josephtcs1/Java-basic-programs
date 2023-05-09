package Joseph_practice;

public class Pattern3 {
	public static void main(String[] args) {
		int count=1;
	for(int i=1;i<6;i++) {
		for(int j=i;j<6;j++) {
			System.out.print(j);
		}
		System.out.println();
		
	}
	
	for(int i=1;i<6;i++) {
		for(int j=i;j>=1;j--) {
			System.out.print(j);
			count=count+2;
		}
		System.out.println();
	}

}
}
