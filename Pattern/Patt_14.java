package Pattern;

public class Patt_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int r=1; r<=n ;r++) {
			char ch='A';
			for(int c=1; c<=r; c++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		for(int r= n-1;r>=1;r--) {
			char ch='A';
			for(int c=1; c<=r;c++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
