package Joseph_practice;

public class PatternNumbers {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		
		
		
		for (int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				if (j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
			
		}


	}
	
}
 /*1
   21
   321 */
  