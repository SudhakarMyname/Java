package sas;

public class clssobjct {

	
		static boolean hasfur=true;
		String breed,color;
		int legs,eyes;
		
		public void walk() {
			System.out.println("cat is walking");
		}
		public void eat() {
			System.out.println("cat is eating");
		}
		public void description() {
			System.out.println("my cat has legs"+legs+"eyes ="+eyes);
		}
		public void bredcolor(String color,String breed) {
			System.out.println("color is"+color+"breed is"+breed);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			clssobjct obj=new clssobjct();
			obj.legs=10;
			obj.walk();
			obj.eat();
			obj.description();
			obj.bredcolor("red","animal");
			System.out.println(hasfur);
			
			
			
			
	}

}
