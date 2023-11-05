package Pattern;

public class Patt_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int r=1; r<=n; r++) {
			for(int s=n-r; s>=1;s--) {
				System.out.print(" ");
			}
			for(int c=1; c<=r ; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
