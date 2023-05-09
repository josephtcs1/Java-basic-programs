package Joseph_practice;

public class Pattern {
	public static void main(String[] args) {
		for(int i=9;i>0;i--) {
			for(int j=9;j>=i;j--) {
				System.out.print(" ");
			}
				for(int k=i;k>0;k--){
					if(i%2!=0) {
						System.out.print("* ");
					}
					else {
						System.out.print(" ");
					}
					}
				System.out.println();
					
		}	
		}
		
		
	}


