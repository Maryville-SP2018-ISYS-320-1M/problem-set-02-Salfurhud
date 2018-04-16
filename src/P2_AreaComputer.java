/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr15,2018
*/

public class P2_AreaComputer {

	public static void main(String[] args) {

		double area = triangleArea(8, 5.2, 7.1);
		
		System.out.println("The area is " + area + ".");
		
	}
	
	public static double triangleArea(double a, double b, double c) {
		
		double s = (a + b + c) / 2;
		
		double area = Math.sqrt(s * (s -a) * (s - b) * (s -c));
		
		return area;
	}

}
