package AI;

public class FibonacciFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1; int a=1;int b,c;
		System.out.println(num);
		for(int i=0;i<=6;i++) {
		
			c=num;
			
			System.out.println(c);
			num=c+a;
			a=c;
			
		}

	}

}
