package testQuad;
import java.util.*;

public class Quad { //v1 by Asta Walor-Scott

public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		float a,b,c;
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
		 *  		System.out.printf((if statement) ? ... : ... , (Variable?);
		 *  
		 */
		
		 System.out.printf("Enter the variables (a, b, c) one at a time%n"); // working, I kinda want to seperate it again though
			a = keyboard.nextFloat();
			b = keyboard.nextFloat();
			c = keyboard.nextFloat();
				if (a == 0) { //a = 0 protection. without needing to back out of the program. bc that's so silly
					System.out.print("OOOO yeah sorry hun, can't choose zero. Please choose another number: ");
						a = keyboard.nextFloat();
				} 
					
					//v1
				else {
					iRoot = (b * b) + ((-4 * a) * c); // calcs b^2 and calcs ((-4 * a) * c). Assigns it into the "inside root"
						if (iRoot < 1) { // protection against imaginary numbers 
							System.out.printf("%s%n%s%n%f%n%s%n",
											  "That's an imaginary number silly.", "Your interior numer is:", iRoot, 
											  "Closing the program"
											  );
							System.exit(1); 
										}
					wRoot = Math.sqrt(iRoot); // square roots iRoot and makes it "whole root (wRoot)"
						posX = (-1 * b) + wRoot; //adds -1*b and the rooted number. made b flip, probably a better way to do this
						negX = (-1 * b) - wRoot; // subtracts 
							
							posX = Math.round(posX*100)/100; //rounding to two places
							negX = Math.round(negX*100)/100; //rounding to two places
						
						if (posX == negX) { //calcs the rest of the solution		
							System.out.printf("%10s%n%13f%13f",
											  "Only one solution:", 
											  posX / (2 * a), wRoot
											  );
								}
							else {
								System.out.printf("%-10s %3s %10s %n %-10.2f%13.2f",
												  "Positive X=", "and", "Negitive X=",
												  (posX / (2 * a)), (negX / (2 * a))
												  );
								}
						}
						
					
	}
			
}
