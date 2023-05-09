package Joseph_practice;

public class ArraySort {
	public static void main(String[] args) {
		int[] arry  = new int[]{2,43,35,25,55,};
		int temp =0;
		for(int i=arry.length;i>1;i--) {
			for(int j=i+1;j<arry.length;j++) {
				if(arry[i]>=arry[j]) {
					temp=arry[i];
					arry[j]=arry[i];
					arry[i]=temp;
					
					}
				for(int k=0; k<=arry.length;k++) {
					System.out.print(arry[i]);
				
			}
				System.out.println();
			
			}
		
		}
				
	}

}
