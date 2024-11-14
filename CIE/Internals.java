package CIE;
import java.util.Scanner;

public class Internals extends Student{			// Class Internals
	public double[] CIEmarksArray;

	public Internals(){
		CIEmarksArray = new double[5];
	}

	public void getMarks(Student parent){
		manualInherit(parent);
		Scanner J = new Scanner(System.in);
	
		System.out.println("Enter the 5 marks scored in internals : ");
		for(int i = 0; i < 5; i++){
			CIEmarksArray[i] = J.nextDouble();
		}

	}

	public void manualInherit(Student parent){
		this.USN = parent.USN;
		this.name = parent.name;
		this.sem = parent.sem;
	}
}	
