package testQuad;
import java.util.*;

public class moreLoops {

  public static void main(String[] args) {
    int repeat = 'y';
    String again;
    long countb = 0;
    Scanner keyboard = new Scanner(System.in);

    while (repeat == 'y' || repeat == 'Y') {
      long i = 1; // index of summation, first value (will make it do anything)
      long n = 0; // last value
      long sum = 0;

      System.out.printf("%50s%n%n%30s","Welcome to the SIGMA calculator", "Please enter n: ");
      //i = keyboard.nextInt();
      //keyboard.nextLine();
      n = keyboard.nextInt();
      keyboard.nextLine();

      for (long count = 0; count <= --n; count++) { // flag for how many counts, I could program the i inc put nah
        sum += i;
        System.out.printf("%10d", sum);
        if (count > 44718) { //if it exceeds the given space (around 44k will print out per line
          countb = 0; // if this is true will stop making it fancy
          System.out.printf("%n");
        } else if (countb == 11) { // when there are 12 values, will make a line break
          System.out.printf("%n");
          countb = 0; // sets count b to -1 so this round where this statement is true isn't counted into the 12
        } else countb++;

        i++; // Increments the index of summation

      }
      System.out.printf("%n%-1s%n%10d", "The final number in the sequuince is: ", (++n * (n + 1)) / 2); // displays final sum. is too make it math friendly
      System.out.printf("%n%10s ", "would you like to do another?");
      again = keyboard.nextLine();
      repeat = again.charAt(0);
    }
      System.out.println("have an amazing day");
      System.exit(0);
  }
}