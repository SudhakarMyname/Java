package sas;
import java.util.*;

public class STR {

	public static void main(String[] args) {
		int a[]= {2,1,8,-3,6,4,12};
		int n=a.length;
		for(int i=0;i<3;i++) {
			for(int j=0;j<n-1;j++) {
		
				if(a[j+1]<a[j]) {

					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int e:a) {
			System.out.print(e+" ");
		}}}