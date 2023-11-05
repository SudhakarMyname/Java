package javapractice;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10101; int sum=0;
		
		while(num!=0) {
			int a = num%10; int b= num/10;
			sum=sum+1;
			num=b;
		}
		System.out.println(sum);
	}

}
