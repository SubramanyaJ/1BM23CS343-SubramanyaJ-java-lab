/**
 * Develop a Java program to create an abstract class named
 * Shape that contains two integers and an empty method
 * named printArea( ). Provide three classes named
 * Rectangle, Triangle and Circle such that each one of the
 * classes extends the class Shape. Each one of the classes
 * contain only the method printArea( ) that prints the area
 * of the given shape.
 */

import java.util.Scanner;

abstract class Shape{
	int h;
	int r;
	
	abstract void printArea();
}

class Rectangle extends Shape{

	void printArea(){
		System.out.println("The area of rectangle is : " + (h*r));
	}

}

class Triangle extends Shape{

	void printArea(){
		System.out.println("The area of the triangle is : " + (0.5*h*r));
	}

}

class Circle extends Shape{
	
	void printArea(){
		System.out.println("Thea area of the circle is : " + (3.14*r*r));
	}

}

class Main{

	public static void main(String argv[]){

		Scanner J = new Scanner(System.in);

		Rectangle myRectangle = new Rectangle();

		System.out.print("Enter the two integer values for rectangle: ");
		myRectangle.h = J.nextInt();
		myRectangle.r = J.nextInt();

		Triangle myTriangle = new Triangle();

		System.out.print("Enter the two integer values for triangle: ");
		myTriangle.h = J.nextInt();
		myTriangle.r = J.nextInt();

		Circle myCircle = new Circle();

		System.out.print("Enter the integer value for circle: ");
		myCircle.h = J.nextInt();

		myRectangle.printArea();
		myTriangle.printArea();
		myCircle.printArea();

		return;

	}

}


