package sussyBaka;
import java.util.*;

public class coreTest {
	 static boolean clock = false;

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int time = 10;
		clock clock = new clock(time);
		

		System.out.print("please put a 1");
		int a = scanner.nextInt();
		clock.startClock();
		
			while ( a == 1) {
				boolean clock2 = clock.checkClock();
			System.out.println(clock2);
			}
		}
	}
