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

package SEE;
import java.util.Scanner;
import CIE.Student;

public class External extends Student{
	public double SEEmarksArray[];

	public External(){
		SEEmarksArray = new double[5];
	}

	public void getData(Student parent){
		manualInherit(parent);
		Scanner J = new Scanner(System.in);
		System.out.println("Enter the SEE marks : ");
		for(int i = 0; i < 5; i++){
			SEEmarksArray[i] = J.nextDouble();
		}
	}

	public void manualInherit(Student parent){
		this.USN = parent.USN;
		this.name = parent.name;
		this.sem = parent.sem;
	}

}
