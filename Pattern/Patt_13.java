package Pattern;

public class Patt_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=r;c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		for(int r=n-1;r>=1;r--) {
			for(int c=1;c<=r;c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		

	}

}
