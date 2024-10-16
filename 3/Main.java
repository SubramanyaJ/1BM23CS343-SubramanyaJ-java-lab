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

    Book(String n, String a, float p, int np){
        name = n;
        author = a;
        price = p;
        num_pages = np;
    }

    void setDetails(String n, String a, float p, int pn){
        Scanner J = new Scanner(System.in);

        System.out.print("Enter the name of the book : ");
        name = J.nextLine();
        System.out.print("Enter the name of the author : ");
        author = J.nextLine();

        System.out.print("Enter the price : ");
        price = J.nextFloat();
        System.out.print("Enter the number of pages : ");
        num_pages = J.nextInt();
    }

    void toString(){
        System.out.println("Name : " + name + "\nAuthor : " + author + "\nPrice : " + price + "\nNumber of pages : " _ num_pages);
    }

}

class Main{
    public static void main(String argv[]){
        Book bookarray[] = new 

    }


}