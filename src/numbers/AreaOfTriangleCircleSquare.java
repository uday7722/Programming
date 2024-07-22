package numbers;

import java.util.Scanner;

public class AreaOfTriangleCircleSquare {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		//Triangle
		System.out.println("Enter the base of the triangle:");
		double base=scanner.nextDouble();
		System.out.println("Enter the height of the triangle:");
		double height=scanner.nextDouble();

		//Square
		System.out.println("Enter side of the square");
		double side=scanner.nextDouble();

		//Circle
		System.out.println("Enter radius of the circle");
		double radius=scanner.nextDouble();
		double pi=3.14159265359;

		double[] areas=AreaOfTriangleCircleSquare(base,height,side,radius,pi);
		
		System.out.println("Area of Triangle: "+areas[0]);
		System.out.println("Area of Square: "+areas[1]);
		System.out.println("Area of Circle: "+areas[2]);


	}

	private static double[] AreaOfTriangleCircleSquare(double base, double height, double side, double radius,double pi) {

		double areaOfTriangle=(0.5*base*height);
		double areaOfSquare=side*side;
		double areaOfCircle=pi*radius*radius;

		return new double[] {areaOfTriangle,areaOfSquare,areaOfCircle}; 



	}

}
