package Joseph_practice;

import java.util.Scanner;

public class EvenFun {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter value");
		int b= a.nextInt();
		for(int i=1;i<=b;i++){
		if(b%2==0) {
			System.out.println("even" +i);
		}
		else {
			System.out.println("odd" +i);
		}
		}
		
	}

}

