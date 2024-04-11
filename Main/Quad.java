package testQuad;
import java.util.*;
//import javax.swing.JOptionPane;

public class Quad { //v1.3 by Asta Walor-Scott
	/* V1.2 updates
	 *  added a output dialog. Will make an input
	 *  v1.3
	 *  took away the windows until it's all good looking
	 *  removed rounding mistake
	 */

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		float a,b,c;
		String input;
		char repeat = 'n';
		double iRoot, wRoot;
		double posX, negX;
		/* V2 TODO
		 * 
		 * Format the user input area with in line waits for a b c 
		 * 	may not be as easy as that without breaking up the code
		 * 
		 * 
		 * Forming equations into strings
		 * 	need to learn, not the time yet. 
		 *  	I do have a rough idea though:
		 *  		System.out.printf((bool) ? ... (if true it does this) : ... (if false it does this) , (Variable?);
		 *  Windows!
		 */
		do {
		System.out.printf("Enter the variables (a, b, c) one at a time%n"); // working, I kinda want to seperate it again though
		a = keyboard.nextFloat();
		keyboard.nextLine();
		b = keyboard.nextFloat();
		keyboard.nextLine();
		c = keyboard.nextFloat();
		keyboard.nextLine();
		while (a == 0) {//a = 0 protection. without needing to back out of the program. bc that's so silly
			System.out.printf("%-10s%n%s%n","OY! You can't put 0 for a!", "Put in another one jackass");
			a = keyboard.nextFloat();
			keyboard.nextLine();
		} if (a != 0) { //v1
			iRoot = (b * b) + ((-4 * a) * c);// calcs b^2 and calcs ((-4 * a) * c). Assigns it into the "inside root"
			if (iRoot < 1) { // protection against imaginary numbers 
				System.out.printf("%s%n%s%n%.2f%n%s%n",
						"That's an imaginary number silly.", "Your interior numer is:", iRoot, 
						"Closing the program");
				System.exit(1); 
			}
			wRoot = Math.sqrt(iRoot); // square roots iRoot and makes it "whole root (wRoot)"
			posX = (-1 * b) + wRoot; //adds -1*b and the rooted number. made b flip, probably a better way to do this
			negX = (-1 * b) - wRoot; // subtracts 


			if (posX == negX) { //calcs the rest of the solution		
				System.out.printf("%-10s%n%-13.2f%-13.2f",
						"Only one solution:", 
						posX / (2 * a), wRoot);
			} else {	
				System.out.printf("%-10s %4s %13s %5s %24s %n%-14.2f%12.2f%25.2f",
						"Positive X=", "and", "Negative X=", "and", "Your vertex X cord is=",
						(posX / (2 * a)), (negX / (2 * a)),(-b/(2*a)));
				System.out.printf("%n%s","would you like to do another equation? ");
					input = keyboard.nextLine();
					repeat = input.charAt(0);

				/*Beta code that's kinda ass
				 * JOptionPane.showMessageDialog(null, 
										String.format("%-10s %-3s %-10s %-3s %3s %n%-14.2f%15.2f%30.2f",
												  "Positive X=", "and", "Negitive X=", "and", "Your vertex X cord is=",
												  (posX / (2 * a)), (negX / (2 * a)),(-b/(2*a))));
				 */
			}
		} 
	  } while (repeat == 'y' || repeat == 'Y');
	}
}
