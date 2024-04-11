package Geometry;
import java.util.*;
public class Geometry {


	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		double pi = 3.14159; // Pi hard coded, and the other two veriables I need loaded
		double circ, area;
		float r, d;

		System.out.print("HELLO! please input a diameter: "); //asks user for input
		d = keyboard.nextInt(); //user input
		if (d <=0) {
			System.out.println("ERROR, Diameter can not be a negitive! Please chooise a new number:");
			System.exit(1);
		}
		else {
			System.out.println("Your Diameter is: " + d ); //print the users num, keeping it as a float. Solely because not all circles are perfect nums
			//v2 
			/* Without Math.PI:
			 * First line of printf formats the system out. 
			 * Second line is for all the texts (and the next line command)
			 * last line is all the equations (without Math.PI)
			 */
			System.out.printf("%s %31s %22s %n%-14f %15f %29f", 
					"Your radius is: ", "The area of the circle is: ", "The circumfrence is:",
					(r = d/2), (area = pi * ((double)r * (double)r)), (circ = pi * d)
					);
			//With Math.PI
			System.out.printf("%n%n%s %31s %22s%n%-14f %15f %29f", 
					"Your radius is: ", "The area of the circle is: ", "The circumfrence is:",
					(r = d/2), (area = Math.PI * ((double)r * (double)r)), (circ = Math.PI * d)
					); 
		} 
		/* Beta 1 code (still works lol)

					// calc all the info I need
						r = d / 2;//v1
						area = pi * (r * r);//v1
						circ = pi * d;//v1
					//print out the results. 
						System.out.printf( "%-10s %-10s %-10s", "Your radius is: ", " The area of the circle is: ", " The circumfrence is: ");//v1
						System.out.printf("%n %-15f %10f %28f", r, area, circ);// v1
		 */
	}

}
