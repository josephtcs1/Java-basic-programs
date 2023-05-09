package Joseph_practice;

public class FindLargestNumberInArray {
	public static void main(String[] args) {
		int array[]=new int[] {76,3,56,34,3788,47};
		int LargestNumber=array[0];
		for(int i=0;i<array.length;i++) {
			if(LargestNumber<array[i]) {
				LargestNumber=array[i];
			}
		}
		System.out.println(LargestNumber);
		
		
		int Arr[]=new int [] {67,4884,75,6,3,43,65};
		int aa=Arr[0];
		for(int i=0;i<Arr.length;i++) {
			if(aa<Arr[i]) {
				aa=Arr[i];
				
			}
		}
		System.out.println(aa);
		
	}
}
