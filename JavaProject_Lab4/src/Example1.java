import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//define object for in put data from keyboard or console
		Scanner scan = new Scanner(System.in);
		
		//display message and input data
		System.out.print("Input a number : ");
		int previosNumber = scan.nextInt();
		
		int currentNumber;
		
		//loop for input second number
		while(true) {
			System.out.print("Input a number : ");
			currentNumber = scan.nextInt();
			if(currentNumber < previosNumber ) {
				System.out.println("Bye Bye");
				break;
				
			}
			previosNumber = currentNumber;
		}
		
	}

}
