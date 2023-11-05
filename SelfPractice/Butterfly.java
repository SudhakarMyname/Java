package SelfPractice;

public class Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=n;i>0;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");}
			for(int j=i;j>0;j--) {
				System.out.print("*"+" ");
			}	
			System.out.println();		
		}
		for(int i=n-1;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
