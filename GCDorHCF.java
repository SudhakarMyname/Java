package AI;

public class GCDorHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=2; int y=12; int hcf=1;
		for (int i=1; i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0)
				hcf=i;
		}
		System.out.println("hcf is"+hcf);}
	

}
