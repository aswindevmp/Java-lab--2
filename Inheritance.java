class X{
	
	void displayX() {
		System.out.println("Parent class");
	}
}
	
class Y extends X{
	void displayY() {
			System.out.println("Child class");
	}
}
	
public class Inheritance {
	public static void main(String[] args) {
	
		X obj1 = new X();
		obj1.displayX();
		
		Y obj2 = new Y();
		obj2.displayY();
		
		obj2.displayX();
		
			
	}
}
	
