package Joseph_practice;

public class LeftTriangle {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(i==1 ||j==5 || i==j || j==i+1 ||j==i+2) {
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	

}
