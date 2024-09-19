import java.io.*; // Program 1 (2024 fall) By Asta Walor-Scott
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
			br.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		Collections.sort(values);
		Object[] strArray = values.toArray();
		String strValue = "1) How many integers are in the file\r\n"
				+ strArray.length + "\r\n"
				+ "2) What is the smallest integer in the file\r\n"
				+  strArray[0] + "\r\n"
				+ "3) What is the largest integer in the \r\n" + strArray[strArray.length - 1];

		try { //makes a new file
			FileWriter writer = new FileWriter ("Program1.out");
			writer.write(strValue);
			writer.close();
			System.out.print("success");
		}
		catch (Exception i) {
			System.out.println(i);
		}
	}
}
