package sas;

public class reverseword {

	public static String solution(String s) {
	
		int i= s.length()-1;
		
		String ans= "";
		
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ')i--; 
			
		
				int j=i;
				if(i<0) break;
				while(i>=0 && s.charAt(i)!= ' ')i--;
				System.out.println(i);
				
				if (ans.isEmpty()) {
					
					ans = ans.concat(s.substring(i+1 ,j+1));
					System.out.println(ans);
				}
				
				else {
					ans = ans.concat(" "+s.substring(i+1,j+1));
					System.out.println(ans);
			}
		}
		
		//System.out.println(ans);
		return ans;}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		solution("sky is blue");
		
		
	}

}
