package spaceRace; // Space Race V3 by Asta Walor-Scott
/*
 * V3.5
 *    Added wibbily wobbily timey whimy effects that effect everything except for the tardis. 
 *    Added spock. If the USS wins it SHOULD take str and turn it into a string. and then print out spock and the string built. 
 *    Added cheesy. The Eagle 5 has a 1/10 chance of turning into the @ symbol due to the cheesyness of the movie. 
 */

public class spaceRacev3 {
	final static int uniSize = 70; //starts getting unstable at around 40k, I wouldn't go above 300 due to balancing issues
	static TARDIS TARDIS = new TARDIS("Tardis");
	static Eagle5 E5 = new Eagle5("Eagle 5");
	static USSenterprise USS = new USSenterprise("USS");
	

	public static void main(String[] args) {
		positionChanger PC = new positionChanger(TARDIS);
		TARDIS.positionChanger(PC);
		E5.positionChanger(PC);
		USS.positionChanger(PC);

		while (Math.max(Math.max(TARDIS.shipPosition(),E5.shipPosition()), USS.shipPosition()) < uniSize) {
			char[] sArray = { '-', '#', E5.getCheesy(random(),'&'), '^', '|', 'B' };
			StringBuilder str = new StringBuilder("");
			
			TARDIS.setShip( random() ); //name, identifying num, ran num
			E5.setShip(random());
			USS.setShip(random());

			if (Math.max(Math.max(TARDIS.shipPosition(), E5.shipPosition()), USS.shipPosition()) < uniSize) {
				str.insert(0, sArray[4]);

				for (int z = 1; z <= uniSize - 1; z++) {
					str.insert(z, sArray[0]);
				}
				//total side note, My least favorite color is green. This is making me hate it more
				str.setCharAt(TARDIS.shipPosition(), sArray[1]);
				str.setCharAt(E5.shipPosition(), sArray[2]);
				str.setCharAt(USS.shipPosition(), sArray[3]);
				
				if (TARDIS.shipPosition() == E5.shipPosition() && TARDIS.shipPosition() > 0) {
					str.setCharAt(TARDIS.shipPosition(), sArray[5]);
					str.setCharAt(E5.shipPosition(), sArray[0]);
				}
				
				if (TARDIS.shipPosition() == USS.shipPosition() && TARDIS.shipPosition() > 0) {
					str.setCharAt(TARDIS.shipPosition(), sArray[5]);
					str.setCharAt(USS.shipPosition(), sArray[0]);
				}
				
				if (E5.shipPosition() == USS.shipPosition() && USS.shipPosition() > 0){
					str.setCharAt(E5.shipPosition(), sArray[5]);
					str.setCharAt(USS.shipPosition(), sArray[0]);
				}
				
				str.append(sArray[4]);
			} else if (Math.max(Math.max(TARDIS.shipPosition(),E5.shipPosition()), USS.shipPosition()) >= uniSize) {
				if (TARDIS.shipPosition() >= uniSize) {
					str.append(TARDIS.getName() + " Won!");
				} 
				
				if (E5.shipPosition() >= uniSize) {
					str.append(E5.getName() + " Won!");
				}
				
				if (USS.shipPosition() >= uniSize) {
					String trans = str.toString();
					trans = trans + USS.getName();
					System.out.println(USS.spock(trans) + " Won!");
				}
			}
			try {
				Thread.sleep(100); //sleep
			} catch (InterruptedException e) {
				System.out.print("error, interupted expectation");
				System.exit(2);
			}
			System.out.println(str); // let's the system catch up kinda. 
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