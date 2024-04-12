package spaceRace; // Space Race V3 by Asta Walor-Scott

public class spaceRacev3 {
	final static int uniSize = 70; 
	static spaceCraft SHIP = new spaceCraft();

	public static void main(String[] args) {


		while (Math.max(Math.max(SHIP.getShip(1),SHIP.getShip(2)), SHIP.getShip(3)) < uniSize) {
			char sArray[] = { '-', '#', '&', '^', '|', 'B' };
			StringBuilder str = new StringBuilder("");
			SHIP.setShip("Tardis", 1, random()); //name, identifying num, ran num
			SHIP.setShip("Eagle 5",2, random());
			SHIP.setShip("USS Enterprise",3, random());

			if (Math.max(Math.max(SHIP.getShip(1), SHIP.getShip(2)), SHIP.getShip(3)) < uniSize) {
				str.insert(0, sArray[4]);

				for (int z = 1; z <= uniSize - 1; z++) {
					str.insert(z, sArray[0]);
				}

				str.setCharAt(SHIP.getShip(1), sArray[1]);
				str.setCharAt(SHIP.getShip(2), sArray[2]);
				str.setCharAt(SHIP.getShip(3), sArray[3]);
				
				if (SHIP.getShip(1) == SHIP.getShip(2)) {
					str.setCharAt(SHIP.getShip(1), sArray[5]);
					str.setCharAt(SHIP.getShip(2), sArray[0]);
				}
				if (SHIP.getShip(1) == SHIP.getShip(3)) {
					str.setCharAt(SHIP.getShip(1), sArray[5]);
					str.setCharAt(SHIP.getShip(3), sArray[0]);
				}
				if (SHIP.getShip(2) == SHIP.getShip(3)){
					str.setCharAt(SHIP.getShip(2), sArray[5]);
					str.setCharAt(SHIP.getShip(3), sArray[0]);
				}
				
				str.append(sArray[4]);
			} else if (Math.max(Math.max(SHIP.getShip(1),SHIP.getShip(2)), SHIP.getShip(3)) >= uniSize) {
				if (SHIP.getShip(1) >= uniSize) {
					str.append(SHIP.nameWho() + " Won!");
				} 
				if (SHIP.getShip(2) >= uniSize) {
					str.append(SHIP.nameE5() + " Won!");
				}
				if (SHIP.getShip(3) >= uniSize) {
					str.append(SHIP.nameUSS() + " Won!");
				}
			}
			try {
				Thread.sleep(112); //sleep
			} catch (InterruptedException e) {
				System.out.print("error, interupted expectation");
				System.exit(2);
			}
			System.out.println(str);
		}
	}
	static int random(){ //GOAT CODE
		double random = Math.random()*10;
		return ((int)++random);
	}
}
/* V1 Code (sr2)
	Tardis=TARDIS.WHO(random(),tPot); // Sets Tardis = to the return of the class. If I didn't I would just get a hex code lol
	tPot = Tardis; // throws the resulting position into an int to repass into Tardis as it's "position"
	System.out.print( Tardis ); // debug

	Eagle5 = EAGLE5.E5(random(), ePot); //works on the same idea
	ePot = Eagle5;
	System.out.print( Eagle5 );

	Enterprise=ENTERPRISE.E5(random(), uPot); //same idea
	uPot = Enterprise;
	System.out.print( Enterprise );
 */
//if (Math.max(Math.max(SHIP.getShip(1),SHIP.getShip(2)), SHIP.getShip(3)) > 1){
//if(SHIP.getShip(1) = SHIP.getShip(2) || SHIP.getShip(1) = SHIP.getShip(3))

//}