/*	Write a program which creates two threads, one thread
 *	displaying “BMS College of Engineering” once every ten
 *	seconds and another displaying “CSE” once every two
 *	seconds.
 */

import java.util.Scanner;

class MyThread implements Runnable{
	Thread t;
	String message;
	int duration_seconds;

	MyThread(){
		t = new Thread(this, "MyThread instance");
	}

	MyThread(String m, int ds){
		t = new Thread(this, "MyThread instance");
		message = m;
		duration_seconds = ds;
	}

	public void run(){
		try{
			while(true){
				System.out.println(message);
				Thread.sleep(duration_seconds*1000);
			}
		}
		catch (InterruptedException ie){
			System.out.println("MyThread printing " + " interrupted");
		}
	}	

}

class Main{
	public static void main(String argv[]){

		MyThread bms = new MyThread("BMS College Of Engineering", 10);
		MyThread cse = new MyThread("CSE", 2);

		bms.t.start();
		cse.t.start();

	}
}
