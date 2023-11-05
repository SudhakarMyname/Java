package AnujB;

public class HollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println("*");
		for(int i=2;i<=n-1;i++) {
			System.out.print("*");

			for(int j=1; j<=i-2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		if(n>1){
			for(int i=1; i<=n; i++) {
				System.out.print("*");
			}
		}

	}

}
