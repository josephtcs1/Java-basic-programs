

/* A
   AB
   ABC
   ABCD    */



package Joseph_practice;

public class Abc {
	public static void main(String[] args) {
	
		for(int i =1;i<5;i++) {
			char a='A';
			for(int j=1;j<=i;j++) {
				System.out.print(a +" ");
				++a;
			}
			System.out.println();
			
			
		}
		
   /*A
	AB
	ABC
	ABCD*/
		
		for (int i=1;i<5;i++) {
			char a='A';
			for (int j=1;j<i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
		
	

	
	/*
	A
	AB
    ABC 
    ABCD
    ABCD
    ABC
    AB
    A
	 */
		
		for (int i=1;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			char a='A';
			for(int k=1;k<=i;k++) {
				System.out.print(a +" ");
				a++;
			}
			System.out.println();
		}
			
for (int i=5;i>1;i--) {
	for(int k=5;k>=i;k--) {
		System.out.print(" ");
	}
	char a ='A';
	for(int j=1;j<i;j++) {
		System.out.print(a +" ");
		a++;
	}
	
	System.out.println();
}
/*A 
  AB
  ABC
  ABCD
  ABCD
  ABD
  AB
  A
*/

for (int i=1;i<5;i++) {
	for(int j=5;j>i;j--) {
		System.out.print(" ");
	}
	int a =1;
	for(int k=1;k<i;k++) {
		System.out.print(a+" ");
		a++;
	}
	System.out.println();
}

for (int i=5;i>1;i--) {
	for (int j=5;j>i;j--) {
		System.out.print(" ");
	}
	char a='A';
	for(int k=1;k<i;k++) {
		System.out.print(a +" ");
		a++;
	}
	System.out.println();
	}
	




for(int i=1;i<7;i++){
	for(int k=7;k>=i;k--) {
		System.out.print(" ");
	} 
		for (int j=1;j<=i;j++) {
			if(i%2!=0) {
			System.out.print("* ") ;
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		}	
	}
	
}	

