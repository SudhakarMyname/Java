package javapractice;

public class MethodFactorial {

	
	public static int Fact(int n) {
		
		for(int i=n-1; i>0; i--) {
			
			 n= n*i;
		}
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = Fact(6);
		System.out.println(res);
		
		
	}

}
