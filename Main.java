/*	Create a package CIE which has two classes- Student and
	Internals. The class Personal has members like usn, name,
	sem. The class internals has an array that stores the
	internal marks scored in five courses of the current
	semester of the student. Create another package SEE
	which has the class External which is a derived class of
	Student. This class has an array that stores the SEE marks
	scored in five courses of the current semester of the
	student. Import the two packages in a file that declares
	the final marks of n students in all five courses.
*/

import CIE.*;
import SEE.*;
import java.util.Scanner;
class Main{

	public static void main(String argv[]){

		System.out.println("Enter the number of students");
		Scanner J = new Scanner(System.in);

		int n = J.nextInt();
		Student[] sa = new Student[n];
		Internals[] ia = new Internals[n];
		External[] ea = new External[n];


		for(int i = 0; i < n; i++){

			sa[i] = new Student();
			ia[i] = new Internals();
			ea[i] = new External();

			sa[i].getData();
			ia[i].getMarks(sa[i]);
			ea[i].getData(sa[i]);
		
			
		
			double[] temp = new double[5];
			// Temporary marks display
			System.out.println("The final marks in each subject are :");
			for(int j = 0; j < 5; j++){
				temp[j] = ia[i].CIEmarksArray[j] + ea[i].SEEmarksArray[j]*0.5;
				System.out.print(temp[j] + " ");
			}
		}
	

		
	}

}
