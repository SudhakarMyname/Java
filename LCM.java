package AI;

public class LCM {
	
	//formula lcm= a*b/hcf;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=13; int y=12; int gcd=1;
		for(int i = 1; i<=x && i <= y; i++ ) {
			if( x%i == 0 && y%i==0) {
				gcd=i;
			}	
		}	
		int lcm= x*y/gcd;
		
		System.out.println(lcm);

	}

}
