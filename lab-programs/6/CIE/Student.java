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

package CIE;					// Package CIE
import java.util.Scanner;

public class Student{					// Class Student
	public String USN;
	public String name;
	public String sem;

	public Student(){
		;
	}

	public void getData(){
		Scanner J = new Scanner(System.in);
		System.out.println("Enter your USN, name, and semester details : ");
		USN = J.nextLine();
		name = J.nextLine();
		sem = J.nextLine();
	}

}

