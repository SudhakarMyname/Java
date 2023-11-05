package javapractice;

public class FindingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=454659; int res;
		
		while (num!=0) {
			
			res=num%10;
			System.out.println(res);
			
			num= num/10;
			
			
		}
	}

}
