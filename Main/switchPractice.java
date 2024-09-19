package practiceSwitch;
//Nested Switches v1 by Asta walor-Scott
import java.util.*;

public class switchPractice {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); //user input
    int iChoice = 1; // Int choice for overall switch

    System.out.printf( //prompt user for which calc you need
      "%50s%n%n%80s%n%n%9s%n%47s%n%25s%n", "Welcome!",
      "Please type in the number by the calculator you require and press enter:",
      "1.Fat", "2.Speed of sound through various substences", "3.ISP bill calculator");
    iChoice = keyboard.nextInt(); //choice of which calc

    switch (iChoice) { //all the calcs
    case 1: //Fat gram owo

      int tCals; // total calories
      int fGrams; // fat in grams
      int fCals; // cals from fat

      System.out.printf("%60s%n%58s","Welcome to the fat from calories calculator!", 
    		  "How many colories in total does the item have? ");
      tCals = keyboard.nextInt();

      System.out.printf("%n%-10s%n", "And how much fat in grams does the item have?");
      fGrams = keyboard.nextInt();
      fCals = fGrams * 9;

      if (fCals <= tCals) {
        System.out.printf("%-10s %d %10s%n%n%-10s %.2f%%",
          "Your item has", fCals, "total grams of fat",
          "The presentage of fat from the items calories is:",
          ((double) fCals / (double) tCals) * 10);
      } else {
        System.out.printf("the number of calories from fat exceeds the total calories." +
          "Terminating program");
        System.exit(0);
      }
      break;
    case 2:
      int cSOS; // Choice Speed of sound
      float D; // distance
      System.out.printf("%50s%n%n%46s%n%50s%n%-10s%n%-10s%n%-10s%n",
        "Welcome to the speed of sound calculator!",
        "What element is the sound traveling in?",
        "Please answer by typing the number by the element",
        "1. Air", "2. Water", "3. Steel");
      cSOS = keyboard.nextInt();
      System.out.printf("%-10s%n", "What is the distance in feet?");
      D = keyboard.nextFloat();

      switch (cSOS) { // switch for what it's going through
      case 1: //air 1,100 ft/s
        float aSos; // air speed of sound

        System.out.printf("%-10s%.1f%s%.3f %s",
          "The amount of time it would take sound to travel in air for the distance ",
          D, "ft is: ", (aSos = D / 1100), "seconds");
        break;
      case 2: //water 4900 ft/s
        float wSos; // water speed of sound

        System.out.printf("%-10s%.1f%s%.3f %s",
          "The amount of time it would take sound to travel in water for the distance ",
          D, "ft is:", (wSos = D / 4900), "seconds");
        break;
      case 3: //steel 16400 ft/s
        float sSos; // steel speed of sound
        System.out.printf("%-10s%.1f%s%.3f %s",
          "The amount of time it would take sound to travel in air for the distance ",
          D, "ft is:", (sSos = D / 16400), "seconds");
        break;
      default: // fall back
        System.out.printf("ERROR invalid input. Terminating the program");
        System.exit(0);
        break;
      }
      break;
    case 3: //isp 1 and 2
      double a = 9.95; //package a (with build in calc)
      double b = 13.95; // package b
      double c = 19.95; //package c
      int h; // hours 
      int pChoice; // package choice
      int choice; // choice for yes or no

      System.out.printf("%60s%n%n%70s%n", "Welcome to the ISP package calulator!", 
    		  "How many hours a day do you use the internet? (in whole hours)");
      h = keyboard.nextInt();

      System.out.printf("%60s%n%50s%n%20s%n%20s%n%20s%n",
    		  "What package are you current subscribed too?", 
    		  "please type in the number by the package",
    		  "1. package a", "2. package b", "3. package c");
      
      pChoice = keyboard.nextInt();
      switch (pChoice) {
      case 1:
    	  if (h > 10) {
    		  a = a + (2 * h); // hourly penalty
    		  System.out.printf("%-10s %.2f","With your current package your bill is:", a);
    	        
    	        System.out.printf("%n%-10s%n%-10s%n", "Would you like to know if you missed any savings?", 
    	        					"1 for yes, 2 for no");
    	        choice = keyboard.nextInt();
    	        if (choice == 1) {
    	          if (a > b) {
    	            System.out.printf("%-10s %.2f %s","you would save:", (a - b), "per month");
    	            if (b > c) {
    	              System.out.printf("%-10s %.2f%n %-10s %f%n", "you would save even more:", (a - c),
    	            		  			"which is this much more:", (b - c));
    	            }
    	          }else {
    	        	  System.out.print("no savings found. Have a great day!");
    	          }
    	        } else {
    	          System.out.print("have a great day!");
    	     }
    	  } else {
        System.out.printf("%-10s %.2f","With your current package your bill is:", a);
        
        System.out.printf("%n%-10s%n%-10s%n", "Would you like to know if you missed any savings?", 
        					"1 for yes, 2 for no");
        choice = keyboard.nextInt();
        if (choice == 1) {
          if (a > b) {
            System.out.printf("%-10s %.2f %s","you would save:", (a - b), "per month");
            if (b > c) {
              System.out.printf("%-10s %.2f%n %-10s %f%n", "you would save even more:", (a - c),
            		  			"which is this much more:", (b - c));
            }
          } else {
        	  System.out.print("no savings found. Have a great day!");
          }
        } else {
          System.out.print("have a great day!");
      }
    }
        break;
      case 2:
    	  if (h > 20) {
    		  b = b + h; // hourly penalty
    		  System.out.printf("%-10s %.2f", "With your current package your bill is:", b);

    	        System.out.printf("%n%-10s%n%-10s%n", "Would you like to know if you missed any savings?", 
    	        				  "1 for yes, 2 for no");
    	        choice = keyboard.nextInt();
    	        if (choice == 1) {
    	          if (b > c) {
    	            System.out.printf("%-10s %.2f %s","you would save:", (b - c));
    	          } else {
    	        	  System.out.print("no savings found. Have a great day!");
    	          }
    	        } else {
    	          System.out.print("have a great day!");
    	        }
    	  }
        System.out.printf("%-10s %.2f", "With your current package your bill is:", b);

        System.out.printf("%n%-10s%n%-10s%n", "Would you like to know if you missed any savings?", 
        				  "1 for yes, 2 for no");
        choice = keyboard.nextInt();
        if (choice == 1) {
          if (b > c) {
            System.out.printf("%-10s %.2f %s","you would save:", (b - c));
          }
        } else {
          System.out.print("have a great day!");
        }
        break;
      case 3:
        System.out.printf("%-10s %.2f", "With your current package your bill is:", c);
        break;
      default:
        System.out.println("ERROR: bad data inputed. Terminating program");
        System.exit(0);
        break;
      }
      break;
    default:
      System.out.println("ERROR: bad data inputed. Terminating program");
      System.exit(0);
      break;
    }
  }
}