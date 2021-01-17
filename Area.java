import java.util.Scanner;

public class Area {
	
	void Area(double l,double b){
		
		String area=String.format("%.3f", (l*b));
		System.out.println("Area of Rectangle Is "+area+"sq.units");
	}
	
	void Area(double r){
		
		double pi = 3.1415;
		String area= String.format("%.3f", (pi*Math.pow(r, 2)));
		System.out.println("Area of Circle is "+area+"sq.units");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r,l,b;
		
		System.out.println("Enter radius of circle :");
		r =sc.nextDouble();
		Area circle = new Area();
		circle.Area(r);

		
		System.out.println("Enter  length and beadth of rectangle :");
		l = sc.nextDouble();
		b=sc.nextDouble();
		Area rectangle = new Area();
		rectangle.Area(l, b);
		
	
	}
	

}
