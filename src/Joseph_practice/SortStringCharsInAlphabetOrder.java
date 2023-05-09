package Joseph_practice;

import java.util.Arrays;

public class SortStringCharsInAlphabetOrder {
	public static void main(String[] args) {
		String str="Jajkkdhkkl&&*&af";
		char[] arr=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(new String(arr) );
		//Aprouch=2
		String str1="ljojfo;jdjd";
		char[] arr1= str1.toCharArray();
		Arrays.sort(arr1);
		System.out.println(new String(arr1));
		
		String a = "iu23493iirewq";
		 char [] aa= a.toCharArray();
		 Arrays.sort(aa);
		 System.out.println(new String (aa));
		 
	}
	
 
 
      
}
