package AnujB;
import java.util.*;
public class AddArray {
	
	public static void main(String[] args) 
	{
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		
		Scanner x= new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr1[i][j]=x.nextInt();	
			}	
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr2[i][j]=x.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]);
			}System.out.println();
		}
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j]);
			}System.out.println();
		}
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(c[i][j]+" ");}
			System.out.println();}
				
				
				
				
			}
		}
		
