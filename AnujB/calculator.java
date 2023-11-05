package AnujB;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x= new Scanner(System.in);
		int a=x.nextInt();
		int b=x.nextInt();
		x.nextLine();
		char operation=x.nextLine().charAt(0);
		switch(operation) {
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		case '%':System.out.println(a%b);
		break;
		default:System.out.println("error");
		break;
		}
		
		
		
	}

}
