package javapractice;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123; int count=0;
		
		while(num!=0) {
			int a= num/10; int x=num%10;
			 count = count + x;
			 num=a;
		}
System.out.println(count);
	}

}
