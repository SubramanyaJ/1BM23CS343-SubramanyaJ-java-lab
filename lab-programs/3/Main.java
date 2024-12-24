/**
 * Create a class Book which contains four members: name,
 * author, price, num_pages. Include a constructor to set the
 * values for the members. Include methods to set and get
 * the details of the objects. Include a toString( ) method that
 * could display the complete details of the book. Develop a
 * Java program to create n book objects.
 */

import java.util.Scanner;

class Book{

    String name;
    String author;
    float price;
    int num_pages;

    Book(){

    }

    Book(String n, String a, float p, int np){
        name = n;
        author = a;
        price = p;
        num_pages = np;
    }

    void setDetails(){
        Scanner J = new Scanner(System.in);

        System.out.print("\nEnter the name of the book : ");
        name = J.nextLine();
        System.out.print("Enter the name of the author : ");
        author = J.nextLine();

        System.out.print("Enter the price : ");
        price = J.nextFloat();
        System.out.print("Enter the number of pages : ");
        num_pages = J.nextInt();
    }

    public String toString(){
        return ("Name : " + name + "\nAuthor : " + author + "\nPrice : " + price + "\nNumber of pages : " + num_pages + "\n");
    }

}

class Main{
    public static void main(String argv[]){
	Scanner J = new Scanner(System.in);
	System.out.print("Enter the number of book objects");
	int n = J.nextInt();
        Book bookarray[] = new Book[n];
	
	for(int i = 0; i < n; i++){
		bookarray[i] = new Book();
		bookarray[i].setDetails();
	}
	
	System.out.println("Displaying all books : ");

	for(Book instance : bookarray){
		System.out.println(instance);
	}


	return;


    }


}