package sas;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str1="acdb  ";
			String str2="cac";
			int count=0;int count1=0;
			if (str1.length()==str2.length()) {
				
				for(int i=0;i<str1.length();i++) {
					char ch1=str2.charAt(i);
					char ch=str1.charAt(i);
				String s=Character.toString(ch);
				String t=Character.toString(ch1);	
					if (str2.contains(s)) {
						 count=count+1;
						}
					if (str1.contains(t)) {
						count1=count1+1;
					}
					
					
				}
				if(count==count1) {
					System.out.println("yes it is anagram");
				}
				else {
					System.out.println("not an anagram");
				}
				
				
			}
			else {
				System.out.println("not an anagram");
			}
	}

}
