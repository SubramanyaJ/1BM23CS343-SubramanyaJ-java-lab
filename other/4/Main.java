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

	Rectangle(int he, int ra){
		h = he;
		r = ra;
	}

	void printArea(){
		System.out.println("The area of rectangle is : " + (h*r));
	}

}


class Triangle extends Shape{

	Triangle(int he, int ra){
		h = he;
		r = ra;
	}

	void printArea(){
		System.out.println("The area of the triangle is : " + (0.5*h*r));
	}

}

class Circle extends Shape{
	
	Circle(int ra){
		r = ra;
	}

	void printArea(){
		System.out.println("Thea area of the circle is : " + (3.14*r*r))
	}

}

class Main{

	public static void main(String argv[]){

	

	}

}


