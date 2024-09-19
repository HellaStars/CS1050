package spaceRace; // Space Race V3.7 by Asta Walor-Scott
/*
 * V3.5
 *    Added wibbily wobbily timey whimy effects that effect everything except for the tardis. 
 *    Added spock. If the USS wins it SHOULD take str and turn it into a string. and then print out spock and the string built. 
 *    Added cheesy. The Eagle 5 has a 1/10 chance of turning into the @ symbol due to the cheesyness of the movie. 
 *    
 *    V3.7
 *    	Removed map from main. Lives in class map
 *    	changed ship positional data to be stored as objects instead
 */

public class spaceRacev3 {
	final static int uniSize = 70; //starts getting unstable at around 40k, I wouldn't go above 300 due to balancing issues
	static TARDIS TARDIS = new TARDIS("Tardis", uniSize);
	static Eagle5 E5 = new Eagle5("Eagle 5",uniSize);
	static USSenterprise USS = new USSenterprise("USS",uniSize);
	static Map map = new Map(uniSize);
	static mapEffects mapE = new mapEffects();

	public static void main(String[] args) {
		positionChanger PC = new positionChanger(TARDIS);
		TARDIS.positionChanger(PC);
		E5.positionChanger(PC);
		USS.positionChanger(PC);

		map.tardisPass(TARDIS);
		map.eagle5Pass(E5);
		map.ussPass(USS);
		
		while (Math.max(Math.max(TARDIS.shipPosition(),E5.shipPosition()), USS.shipPosition()) < uniSize ) {
			
			char[] sArray = { '-', '#', E5.getCheesy(random(),'&'), '^', '|', 'B' };
			map.array(sArray);
			
			TARDIS.setShip( random() ); //ran num
			E5.setShip(random());
			USS.setShip(random());

			try {
				Thread.sleep(100); //sleep
			} catch (InterruptedException e) {
				System.out.print("error, interupted expectation");
				System.exit(2);
			}
			System.out.println(map.getMap()); // let's the system catch up kinda. 
			//System.out.println(TARDIS.shipPosition()); debug
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