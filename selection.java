package sas;

public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,-2,7,4,0};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int minindex=i;
			for(int j=i;j<n;j++) {
				
			
			if(a[j]<a[minindex]) {
				minindex=j;
			}
		}
	int temp=a[i];
	a[i]=a[minindex];
	a[minindex]=temp;}
		for(int e:a) {
			System.out.print(e);
		}
	
	
		}
	

}
