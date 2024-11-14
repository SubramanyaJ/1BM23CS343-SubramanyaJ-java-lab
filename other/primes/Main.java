import java.util.Scanner;

class printPrimes{
	int start, end;

	void getValues(int a, int b){
		Scanner J = new Scanner(System.in);
		start = J.nextInt();
		end = J.nextInt();	

	}

	void print(){
		for(int i = start; i <= end; i++){
			
			if(isPrime(i)){
				System.out.print(i + " ");
			}
		}		
	
	}

	boolean isPrime(int x){
		for(int i = 2; i < x; i++){
			if(x%i == 0){
				return false;
			}
		}
		return true;
	}

}

class Main{
	public static void main(String argv[]){
		printPrimes one = new printPrimes();
		one.getValues(10, 20);
		one.print();		
	}
}
