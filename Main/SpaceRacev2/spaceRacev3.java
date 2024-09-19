package spaceRace; // Space Race V3 by Asta Walor-Scott

public class spaceRacev3 {
	final static int uniSize = 70; 
	static spaceCraft TARDIS = new spaceCraft("Tardis");
	static spaceCraft E5 = new spaceCraft("E5");
	static spaceCraft USS = new spaceCraft("USS");

	public static void main(String[] args) {


		while (Math.max(Math.max(TARDIS.tardisPosition(),E5.E5Position()), USS.USSPosition()) < uniSize) {
			char sArray[] = { '-', '#', '&', '^', '|', 'B' };
			StringBuilder str = new StringBuilder("");
			TARDIS.setShip( 1, random()); //name, identifying num, ran num
			E5.setShip(2, random());
			USS.setShip(3, random());

			if (Math.max(Math.max(TARDIS.tardisPosition(), E5.E5Position()), USS.USSPosition()) < uniSize) {
				str.insert(0, sArray[4]);

				for (int z = 1; z <= uniSize - 1; z++) {
					str.insert(z, sArray[0]);
				}

				str.setCharAt(TARDIS.tardisPosition(), sArray[1]);
				str.setCharAt(E5.E5Position(), sArray[2]);
				str.setCharAt(USS.USSPosition(), sArray[3]);
				
				if (TARDIS.tardisPosition() == E5.E5Position() && TARDIS.tardisPosition() > 0) {
					str.setCharAt(TARDIS.tardisPosition(), sArray[5]);
					str.setCharAt(E5.E5Position(), sArray[0]);
				}
				if (TARDIS.tardisPosition() == USS.USSPosition() && TARDIS.tardisPosition() > 0) {
					str.setCharAt(TARDIS.tardisPosition(), sArray[5]);
					str.setCharAt(USS.USSPosition(), sArray[0]);
				}
				if (E5.E5Position() == USS.USSPosition() && USS.USSPosition() > 0){
					str.setCharAt(E5.E5Position(), sArray[5]);
					str.setCharAt(USS.USSPosition(), sArray[0]);
				}
				
				str.append(sArray[4]);
			} else if (Math.max(Math.max(TARDIS.tardisPosition(),E5.E5Position()), USS.USSPosition()) >= uniSize) {
				if (TARDIS.tardisPosition() >= uniSize) {
					str.append(TARDIS.getName() + " Won!");
				} 
				if (E5.E5Position() >= uniSize) {
					str.append(E5.getName() + " Won!");
				}
				if (USS.USSPosition() >= uniSize) {
					str.append(USS.getName() + " Won!");
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