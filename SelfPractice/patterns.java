package SelfPractice;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			
			
		}
		for(int i= n-1; i>0;i--) {
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
