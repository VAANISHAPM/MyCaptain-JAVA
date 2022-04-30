import java.util.Scanner;

class isprime{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Please insert any number");
	int num = input.nextInt();
	boolean isprime = true;
	for(int i = 2; i < num; i++){
		if(num % i == 0){
			isPrime = false;
			break;
		}
	}
	if(isPrime){
		System.out.println(num+" is a prime number");
	}
	else{
		System.out.println(num+" is not a prime number");
	}
