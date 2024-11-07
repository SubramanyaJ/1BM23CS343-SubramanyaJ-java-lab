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

/**
 * Create two subclasses : 
 * i. Inpatient with instance variables
 * bedno, bills (double array) no-days, discount, discount.
 * Discount variable will be calculated as : 
 * total < 10000 : NO DISCOUNT
 * total > 10000 && total <= 25000 => 5%
 * total > 25000 && total <= 50000 => 10%
 * total > 50000 => 15%
 *
 * ii. Outpatient : Number of visits, appt_time (int)
 * Include methods that displays the id and name of patients 
 * who are given appt between two time units
 * (accept from user, say 2 to 4)
 * 
 * If number of visits == 1, include 500 registration fee along
 * with bill amount
 * Given a doctor name, find how many inpatients and how many
 * outpatients he/she has
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

class Inpatient extends Patient{

	byte bedno;
	double[] billamt;
	byte nodays;
	float discount;
	
	Inpatient(byte bed, double[] amt, byte days){
		super.acceptDetails();
		bedno = bed;
		billamt = amt;
		nodays = days;
		
		double sum = 0;
		for(double i : billamt){
			sum += i;			
		}
		if(sum > 0 && sum < 10000){
			discount = 0;
		}	
		else if(sum > 10000 && sum < 25000){
			discount = 0.05*sum;
		}
		else if(sum > 25000 && sum < 50000){
			discount = 0.1*sum;	
		}
		else if(sum > 50000){
			discount = 0.15*sum;
		}
	}

}

class Outpatient extends Patient{

	byte novisits;
	String appttime;
	double[] billamt;

	Outpatient(byte vis, String time, double[] bamt){
		super.acceptDetails();		
		novisits = vis;
		appttime = time;
		billamt = bamt;
	}
	
	void printData(int i, int j){
	}

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

/**
 * Given a doctor name, find out how many
 * inpatients and how many outpatients 
 * he/she has
 */
