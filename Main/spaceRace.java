package testQuad; // Space race by Asta Walor-Scott v1.2.1

public class spaceRace {

	static int E5 = 0; // eagle 5
	static int EP = 0; //Enterprise
	static int TARDIS = 0; // TARDIS
	static int LDash;// to the left half dash's
	static int mDash = 0; //
	static int E5H = 0; // Eagle 5 holder
	static int EPH = 0; //  Enterprise holder
	static int TARDISh = 0; // TARDIS holder
	static int bFlag = 0; // bump flag
	static int tFlag = 0; // tardis flag
	static int DRc = 0;

	public static void main(String[] args) {

		Start(); // start condition 

		while (Math.max(E5H, EPH) < 70){
			E5H = Math.max(E5(), 0);// re rolls  Eagle 5, and makes it 0 if it is 
			EPH = Math.max(EP(), 0);// re rolls Enterprise, and makes it 0 if it is negative
			//TARDISh = Tardis();
			LDash = Math.min(E5H, EPH); // Gets how much space the ships moved from the start
			bFlag = 0; // resets bump flag
			DRc = random(); // you have to set it out so both methods can use it

			System.out.printf("%n%n%n%n%n%n%s","|"); // just to make things look good

			map(); //calls map method

			try {
				Thread.sleep(1000); //sleep
			} catch (InterruptedException e) {
				System.out.print("error, interupted expectation");
				System.exit(2);
			}
			End();
		}
	}

	static void map() { //main map
		lMap();
		lShip();
		mMap();
		if (bFlag == 0) {
			rShip();
		}
		rMap();
		System.out.printf("%s","|"); // and ze end
		return;

	}

	static void mMap() { //middle map
		for (int limit2 = Math.max(E5H, EPH); limit2 != Math.min(E5H, EPH); limit2--) {
			System.out.print("-");
		}
		return;
	}

	static void lMap() {//left hand map
		for (int limit = 2; limit <= LDash; limit++) {
			System.out.print("-");
		}
		return;
	}

	static void rMap() { //right hand map
		for (int fFlag = 1 + Math.max(E5H, EPH); Math.max(E5H, EPH) != 70 - 1 && fFlag <= 70 ; fFlag++) {
			System.out.print("-");
		}
		return;
	}

	static void lShip() { //left ship
		if (bFlag == 0 && E5H == EPH) {
			BUMP();
			bFlag++;
		}else if (LDash == E5H && bFlag == 0) {
			System.out.print("E");
		} else if (LDash == EPH) { 
			System.out.print("P");
		}
		return;
	}

	static void rShip() { //right ship
		if (Math.max(E5H, EPH) == E5H) {
			System.out.print("E");
		} else if (Math.max(E5H, EPH) == EPH ) { 
			System.out.print("P");
		}
		return;
	}

	static void BUMP() { // bump
		if (bFlag != 1) {
			System.out.print("B");
		}
		return;
	}

	static void Start(){ //start
		System.out.printf("%n%n%n%n%n%n%s","|");
		System.out.print("EP");
		for (int sFlag = 0; sFlag != 68; sFlag++) {
			System.out.print("-");
		}
		System.out.print("|");
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {
			System.out.print("error, interupted expectation");
			System.exit(2);
		} 
		return;
	}

	static void End(){

		if (Math.max(E5H, EPH) >= 70 && Math.min(EPH, E5H) <= 70)
		{
			if (Math.max(E5H, EPH) == E5H)
			{
				System.out.print("Falcon 5 won");
				System.exit(0);
			} else if (Math.max(E5H, EPH) == EPH) System.out.print("EP won");
			else if (Math.max(E5H, EPH) >= 70 && Math.min(EPH, E5H) >= 70) {
				System.out.print("TIE");
				System.exit(0);
			}
		}
		return;
	}

	static int E5() {
		int E5c = random(); // count

		switch (E5c) {
		case 1, 2, 3, 4 ,5:
			E5 += 1;
		return(E5);
		case 6, 7:
			E5 = Math.max(E5-3, 1);
		return(E5);
		case 8,9,10:
			E5 += 5;
		return(E5);
		} 
		return(E5);
	}

	static int EP() {
		int EPc = random(); // count

		switch (EPc) {
		case 2,3,4:
			EP = Math.min(EP+7, 70);
		return(EP);
		case 5,6,7,8:
			EP = Math.max(EP-3, 1);
		return(EP);
		case 9,10:
			EP += 1;
		return(EP);
		}
		return(EP);
	}
	/* DR who
	 * Messy time travel 
	 * 	Start back at space 1
	 * 		Jump forward?? (likely just going to add) <- for now it's just gonna stay put till I can figure out a work around 
	 * 		restart the race (for them?) (fuck
	 * 		set 1 ship to 70 (fuck
	 * 			Idea: make DRc universal, have a method to track if the Tardis is in case 1. Throw that method to check. ever. Single. Method.
	 * 			or throw it into the set defonition?
	 * case 2: small jump, 5 spaces 
	 * case 3: Uh oh fucko, you don't know what way your traveling. If under 4 set back 10, if 5 and above throw it random()*2
	 * case 4,5: Set to a random tile. 2-60
	 * case 10: win
	 */

	static int Tardis() {
		switch (DRc) {
		case 1:
			
			TARDIS = 1;
		case 2,3,4:
			TARDIS = Math.min(TARDIS+7, 70);
		return(TARDIS);
		case 5,6,7,8:
			TARDIS = Math.max(TARDIS-3, 1);
		return(TARDIS);
		case 9,10:
			TARDIS += 1;
		return(TARDIS);
		default:
			return(TARDIS);
		}
	}
	static int TardisMechanics() {
		int tNum = 0;
		int tSw = random();
		while (DRc == 1 || tFlag != 1) {
			switch (tSw) {
			case 1,2,3:
				tNum = 1;
			return(tNum);
			case 4,5,6:
				tNum = random() + 3;
			return(tNum);
			case 7,8,9:
				tNum = random() + 3;
			return(tNum);
			}
		}
		tFlag++;
		return(tNum);
	}

	static int random() {
		double random = Math.random()*10;
		return((int)++random);	
	}
}