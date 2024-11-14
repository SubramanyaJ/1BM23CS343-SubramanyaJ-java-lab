/**
 * Develop a Java program that prints all real solutions to the
 * quadratic equation ax2 +bx+c = 0. Read in a, b, c and use
 * the quadratic formula. If the discriminate b2
 * -4ac is
 * negative, display a message stating that there are no real
 * solutions.
 */

import java.util.Scanner;
import java.lang.Math;

class Quadratic{
    float a;
    float b;
    float c;

    Quadratic(){
        Scanner J = new Scanner(System.in);
        System.out.println("Enter your variables one by one : ");
        a  = J.nextFloat();
        b  = J.nextFloat();
        c  = J.nextFloat();
    }

    void solve(){
        float disc = b*b - 4*a*c;

        if(disc < 0){
            System.out.println("No real solutions!\n");
            return;
        }

        disc = (float) Math.sqrt(disc);

        float s1 = (-b + disc)/(2*a);
        float s2 = (-b - disc)/(2*a);

        System.out.println(s1 + " and " + s2 + " are the required roots.");

    }

}

class Main{
    public static void main(String argv[]){

        Quadratic myEquation = new Quadratic();
        myEquation.solve();

        return;

    }
}