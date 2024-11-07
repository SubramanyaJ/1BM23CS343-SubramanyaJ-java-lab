/* *
 * Create a class patient with ID, name, phone number, 
 * age, refdoc as instance variables. Include methods to accept 
 * and display details. Create n patient objects
 */

import java.util.Scanner;

class Patient{
	String ID;
	String name;
	long phone_number;
	byte age;
	String refdoc;

	void acceptDetails(){
		
		Scanner J = new Scanner(System.in);

		System.out.print("Enter your ID : ");
		ID = J.nextLine();

		System.out.print("Enter your name : ");
		name = J.nextLine();

		System.out.print("Enter your phone number : ");
		phone_number = J.nextLong();

		System.out.print("Enter your age : ");
		age = J.nextByte();

		System.out.print("Enter your refdoc : ");
		refdoc = J.nextLine();

	}

	void printDetails(){
	
		System.out.println("ID : " + ID + "\nName : " + name + "\nPhone number : " + phone_number+ "\nAge : " + age + "RefDoc : " + refdoc);

	}

}

class Main{

	public static void main(String argv[]){
	
		int n; 
		Scanner J = new Scanner(System.in);
		System.out.print("Enter the number of objects to be created : ");
		n = J.nextInt();

		Patient patarr[] = new Patient[n];
		// n Patient objects have been created
		
		

	}

}

