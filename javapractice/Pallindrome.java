package javapractice;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1231; int rem,sum=0;
		int temp = num; 
		while(num!=0) {
			 rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		if(temp == sum) {
			System.out.println("This number is pallindrome");}
			else
				System.out.println("THis is not a pallindrome");
		}
		
		
		
		

	}


