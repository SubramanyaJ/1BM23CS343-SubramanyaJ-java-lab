/**
 * Develop a Java program to create a class Student with
 * members usn, name, an array credits and an array marks.
 * Include methods to accept and display details and a
 * method to calculate SGPA of a student.
 */

import java.util.Scanner;

class Student{

    String usn;
    String name;
    int credits[];
    int marks[];
    int size;

    Student(){

        Scanner J = new Scanner(System.in);
        System.out.print("Enter your usn : ");
        usn = J.nextLine();
        System.out.print("Enter your name : ");
        name = J.nextLine();

        System.out.print("Enter the number of courses : ");
        size = J.nextInt();
        credits = new int[size];
        marks = new int[size];

        getCredits(J);
        getMarks(J);

    }

    void getCredits(Scanner J){
        System.out.println("Enter the credits of each course one by one : ");
        for (int i = 0; i < size; i++){
            credits[i] = J.nextInt();
        }
    }

    void getMarks(Scanner J){
        System.out.println("Enter the marks of each course one by one : ");
        for (int i = 0; i < size; i++){
            marks[i] = J.nextInt();
        }
    }

    void display(){
        System.out.println("USN : " + usn + "\nName : " + name + "\nCredits : \n");
        for(int i : credits){
            System.out.print(i + " ");
        }
        System.out.print("\nMarks obtained : \n");
        for(int i : marks){
            System.out.print(i + "\n");
        }
    }

    float returnSGPA(){
        float sgpa, count;
        sgpa = count = 0;
        for(int i = 0; i < size; i++){
            sgpa += credits[i]*marks[i];
            count += credits[i];
        }
        return sgpa/(count*10);
    }


}

class Main{
    public static void main(String argv[]){
        Student one = new Student();
        one.display();
        System.out.println(one.returnSGPA());

        return;
    }
}