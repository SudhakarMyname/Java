package javapractice;

public class FindFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12; int h=num/2;
		System.out.println(1);
		for(int r=2;r<=h;r++) {
			if(num%r==0) {
				System.out.println(r);
			}
			
		}
		System.out.println(num);
	}

}
