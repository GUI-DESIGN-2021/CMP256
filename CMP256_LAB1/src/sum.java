import java.util.Scanner;
public class sum {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {		
		int firstNumber, secondNumber, total = 0;
		System.out.println("Please enter 2 numbers, x and y: ");
		System.out.println("x = ");
		firstNumber = scan.nextInt();
		System.out.println("y = ");
		secondNumber = scan.nextInt(); 
		total = firstNumber + secondNumber;
		System.out.println("The sum is = "+total);
	}
}
