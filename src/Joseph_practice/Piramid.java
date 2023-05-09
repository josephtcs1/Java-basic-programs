package Joseph_practice;

public class Piramid {
	public static void main(String[] args) {
		for(int i=9;i>=1;i--) {
			for (int j=9;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i%2!=0) {
				System.out.print("* ");
				}
				
			}
			System.out.println();
		}
		
  /*     *
		***
		*****
		*******
		********* */
		
		for(int i=1;i<=9;i++){
			for(int k=i;k<9;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
				System.out.print("* ");
				}
				
			}
			
			
			System.out.println();
		}
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j|| j+i==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
	}


