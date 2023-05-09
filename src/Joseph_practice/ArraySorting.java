package Joseph_practice;


public class ArraySorting {
int a[] = {10,103,8,383,356,45};
{
for( int i=6;i>=0;i--) {
	for(int j=i+1;j<=i;j++) 
	
	{
		if (a[i]>a[j]) {
			int  temp;
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			
		}
		
	}
	for(int k=0; k<6;k++) {
		System.out.print(a[k]);
	}
		
}

}
}
