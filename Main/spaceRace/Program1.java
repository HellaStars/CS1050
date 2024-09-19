package spaceRace;
import java.io.*;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		List<Long>values = new ArrayList<Long>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("big3m.txt"));
			
			String hValues;
			while ((hValues = br.readLine()) !=null) {
				values.add(Long.parseLong(hValues));
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		for (int i = 0; i<= 100; i++) {
		System.out.println(values);
		}
		/*try { //makes a new file
			FileWriter writer = new FileWriter ("Program1.out");

		}
		catch (Exception e) {
			System.out.println(e);*/
		}
	}
