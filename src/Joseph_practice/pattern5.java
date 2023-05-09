
/* *********
    *******
     *****
      ***
        *     */
package Joseph_practice;

public class pattern5 {
public static void main(String[] args) {
	for(int i=9;i>1;i--) {
		for(int j=9;j>i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<i;k++) {
			if(i%2==0) {
				System.out.print("* ");
			}
			//System.out.print("* ");
		}
		System.out.println();
	}
	int a=10;
	System.out.println(a++);
	System.out.println(a++);
	
}
}
