public class Triangle {
	public Triangle() {
		double perimeter;
		double area;
		
		int s1=1,s2=6,s3=2;
		
		perimeter=s1+s2+s3;
		
		double phalf = perimeter/2;
		area=Math.sqrt(phalf*(phalf-s1)*(phalf-s2)*(phalf-s3));   //Heron's Formula to calculate Area 
		System.out.println("Perimeter Of Triangle with sides 3,4,5 = "+perimeter);
		System.out.println("Area Of Triangle with sides 3,4,5 = "+area);
		
	}
	public static void main(String[] args) {
		Triangle ob = new Triangle();
	}
}
