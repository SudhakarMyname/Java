package AnujB;
import java.util.*;
public class InfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		
		for (;;) {
			int a=x.nextInt();
			if(a<0) {
				System.out.println(a);
				break;
			}
			
		}
	}

}
