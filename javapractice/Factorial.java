package javapractice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6; int sum=1;
		while(num>0) {
			
			num=num*num-1;
			int a=num-1;
			int b= num*a;
			
			sum=sum*b;
			num=a-1;
		}
		System.out.println(sum);
	}

}
