package sas;

public class anagrambysir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="cat";
		String b="atc";
		boolean isanagram=true;
					int a1[]=new int[256];
					int b1[]=new int[256];
					for(char c:a.toCharArray()) {
						int index= c;
					//	System.out.println(index);
						a1[index]++;
					//	System.out.println(index);
					}
					for(char c:b.toCharArray()) {
						int index=(int) c;
						b1[index]++;
						System.out.println(index);
					}
					for(int i=0;i<256;i++) {
						if(a1[i]!=b1[i]) {
							isanagram=false;
							break;
						}
					}




	}

}
