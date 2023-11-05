package AI;

public class PrimwOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=13; int count=1;
		if(num==1) {
			System.out.println("1 is Not Prime ");
		}
		if(num==2) {
			System.out.println("Yes It is only even prime");
		}
		for(int i=2; i<=num/2;i++) {
			
			if(num%i==0) {
				System.out.println("Not Prime");
				break;
			}
			else
				count=count+1;
				if(count==num/2) {
				System.out.println("Yes it is prime");
			}
			
			}

		}
	}


