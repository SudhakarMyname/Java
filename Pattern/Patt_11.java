package Pattern;

public class Patt_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for (int r=n; r>=1;r--) {
			char ch='A';
			for(int c= 1; c<=r;c++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}

}
