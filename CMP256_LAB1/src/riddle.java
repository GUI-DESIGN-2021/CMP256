import java.util.Scanner;
public class riddle {
	public static void main(String args[]) {
		System.out.println("I love to move around,");
		System.out.println("But usually not on the ground.");
		System.out.println("I'm quite strung out when way up high.");
		System.out.println("I like to sail, but I need to stay dry.");
		System.out.println("I need air, but not to breathe.");
		System.out.println("A helpful hand is all I need.");
		System.out.println("    ");
		System.out.println("What am I?");		
		 try(Scanner console = new Scanner(System.in)) {
			 String answer = console.next();
			 System.out.println("Your answer: "+answer);
			 System.out.println("correct answer: Bird");
         }
    
	
}
}
