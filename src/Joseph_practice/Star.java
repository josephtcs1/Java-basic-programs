package Joseph_practice;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		/*
		 * //for square stars for (int i=1;i<6;i++) { for(int j=1;j<6;j++) {
		 * System.out.print("*"); } System.out.println(); } // for right tri-angle
		 * 
		 * // for(int i=1;i<6;i++) { // for(int j=1;j<i;j++) { // System.out.print("*");
		 * // // } // System.out.println(); // }
		 * 
		 * // for(int i=1;i<=5;i++) { // for(int j=1;j<=5;j++) { // if((i==1 || i==5) ||
		 * j==5 ||j==1) { // System.out.print("*"); // // } // else { //
		 * System.out.print(" "); // } // } // System.out.println(); // // // }
		 * 
		 * int a=0; int b=1; for(int i=1;i<80;i++) { int c=a+b; System.out.println(c);
		 * a=b; b=c;
		 * 
		 * 
		 * 
		 * } int temp=0; int c=0; int n=153; while(n!=0) { int rem=n%10;
		 * temp=rem*rem*rem; c=c+temp; n=n/10; //}
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		int v=n;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=v;
		System.out.println(count);
		int temp = n;
		int sum = 0;

		while (n!=0) {
			int ln = n % 10;
			int rem=1;
			for(int i=0;i<=count-1;i++)
			{
				rem=rem*ln;
			}
			sum=sum+rem;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println("Given number " + sum + " is Armstrong ");
		} else {
			System.out.println("Given number " + sum + " is not Armstrong");
		}

	}
}
