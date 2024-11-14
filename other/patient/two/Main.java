/* *
 * Create a class patient with ID, name, phone number, 
 * age, refdoc as instance variables. Include methods to accept 
 * and display details. Create n patient objects
 */

/**
 * Extend the above to display the name and ID of all patients who
 * are treated by a doctor
 * (accept the soctor name from a user)
 */

import java.util.Scanner;

class Patient{
	String ID;
	String name;
	long phone_number;
	byte age;
	String refdoc;

	static Scanner J;

	void acceptDetails(){
		
		J = new Scanner(System.in);

		System.out.print("Enter your ID : ");
		ID = J.nextLine();

		System.out.print("Enter your name : ");
		name = J.nextLine();

		System.out.print("Enter your phone number : ");
		phone_number = J.nextLong();
		
		System.out.print("Enter your age : ");
		age = J.nextByte();
		J.nextLine();

		System.out.print("Enter your refdoc : ");
		refdoc = J.nextLine();
		


	}

	void printDetails(){
	
		System.out.println("ID : " + ID + "\nName : " + name + "\nPhone number : " + phone_number+ "\nAge : " + age + "RefDoc : " + refdoc);

	}

	void sortDoctor(Patient[] arr, String docname){
		
		for(Patient ins : arr){
			if(ins.refdoc.equals(docname)){
				System.out.println("Name : " + name + "\nID : " + ID);			
			
			}
		}	
	} // End of method sortDoctor()

}

class Main{

	public static void main(String argv[]){
	
		int n; 
		Scanner J = new Scanner(System.in);
		System.out.print("Enter the number of objects to be created : ");
		n = J.nextInt();
		J.nextLine();
		Patient patarr[] = new Patient[n];
		for(int i = 0; i < n; i++){
			patarr[i] = new Patient();
		}
		System.out.println("n Patient objects have been created");
			
		for(int i = 0; i < n; i++){
			patarr[i].acceptDetails();
		}

		System.out.print("Enter the doctor by which to search : ");
		String dname = J.nextLine();
		patarr[0].sortDoctor(patarr, dname);	

	}

}

