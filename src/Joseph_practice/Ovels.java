package Joseph_practice;

import java.util.Scanner;

public class Ovels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char character = scanner.next().charAt(0);
		if(character=='a'|| character=='e'|| character=='i' || character=='o' || character=='u')
		{
			System.out.println("Given character "+ character+" is vowel");		
		}
		else
		{
			System.out.println("Given character "+ character+" is consonent");
		}
		//dscanner.close();
	}
}
