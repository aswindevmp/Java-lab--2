import java.util.Scanner;

public class Area {
	
	String area= "";

	Area(double l,double b){	
		area=String.format("%.2f", (l*b));
	}
	String returnArea() {
		return this.area;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  length and beadth of rectangle :");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		Area ob = new Area(l,b);
		String area = "";
		area=ob.returnArea();
		
		System.out.println("Area of rectangle = "+area);
		
		
	}

	
}
