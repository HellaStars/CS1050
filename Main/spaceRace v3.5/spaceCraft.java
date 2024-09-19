package spaceRace; // SpaceCraft V2 by Asta Walor-Scott
/* v2 update notes
 * Made each ship an extension of the "spaceCraft" class. Allowing for less code (overall)
 * 	By extension allows to simulate a "basic" ship
 * added wibbly woblly timey wimey. (Time function, gets set each time the tardis receives it's move)
 * added spock
 * added cheesy
 */

public class spaceCraft {
	public int position;
	public String shipName;
	public int move = 0;
	positionChanger positionChanger;
	
	spaceCraft(String name){this.shipName = name; this.position = 0;}
	public void positionChanger (positionChanger PC) {
		this.positionChanger = PC;
		
	}
	public void setShip(int r) {
			position += universalEngine(r); //adds the result from the engine and adds it to itself
			position = Math.max(position + positionChanger.universalPosition(), 0); // makes sure the result is bigger than 0 pWho >= 0 and checks if pWho is greater or equal to 70
		}
	
	protected int universalEngine(int mode) {
		switch (mode) {
		case 1,2,3,4,5,6,7:
			move = 2;
		return(move);
		case 8,9,0:
			move = 5;
		return(move);
		}
		return(move);
	}
	public int shipPosition() {return position;}
	public String getName() {return this.shipName;}
}
class TARDIS extends spaceCraft{
	private int Time = 0;
	TARDIS(String shipName){
	super (shipName);
	}
	
	@Override public void setShip(int r) {
		position += universalEngine(r); //adds the result from the engine and adds it to itself
		position = Math.max(position, 0);
		calcTime(r);
	}
	private void calcTime(int random) {
		if (random/2 < 3) {
			Time = 0; //no jump
		} else if (random/2 >= 3) {
			switch(random) {
			case 5,3,7:{
				Time = 5; // future
				}
			case 8,9,10:{ // the past
				Time = -2;
				}
			}
		}
	}
	public int getTime() {return (Time);}
	
	@Override protected int universalEngine(int mode) {
		switch (mode) {
		case 1,2:
			move = 5;
		return(move);
		case 3,4:
			move = -1;
		case 5,6,7:
			move = ((int)Math.random()*10) + 4; //Randomizes between 1 - 10 and adds 4
		return(move);
		case 8,9:
			move = 50;
		case 10:
			move = -20; // for whatever reason it really loves this one lol so nerfing it
			return(move);
		}
		return(move);
	}
}
class Eagle5 extends spaceCraft{
	Eagle5(String shipName){
	super (shipName);
	}
	
	@Override protected int universalEngine(int mode) {
		
		switch (mode) {
		case 1, 2, 3, 4 ,5:
			move = 1;
		return(move);
		case 6, 7:
			move = -3;
		return(move);
		case 8,9,10:
			move = 5;
		return(move);
		} 
		return(move);
	}
	protected char getCheesy(int random, char tag) {
		char cheese = '@';
		if (random >= 8 ) {
			return (cheese);
		}else return(tag);
	}
}
class USSenterprise extends spaceCraft{
	USSenterprise(String shipName){
	super (shipName);
	}
	
	@Override protected int universalEngine(int mode) {
		switch (mode) {
		case 2,3,4:
			move = 7;
		return(move);
		case 5,6,7,8:
			move = -4;
		return(move);
		case 9,10:
			move = 1;
		return(move);
		}
		return(move);
	}
	protected String spock (String str) {
		String Spock = ("\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "                            .ss$$$$$$$$$$$$$$$ss.\r\n"
				+ "                       .s$$$$$$$$$$$$$$$$$$$$$$$$$$ss.\r\n"
				+ "                   .s$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s\r\n"
				+ "                 .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$.\r\n"
				+ "               .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s\r\n"
				+ "             .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s.\r\n"
				+ "            $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "          .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "          $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "        .$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\r\n"
				+ "        $$$$$$$$$$$$$$$$$$$$                                  $$\r\n"
				+ "        $$$$$$$$$$$$$$$$$$     .\r\n"
				+ "       s$$$$$$$$$$$$$$$$$     sssss.                           s\r\n"
				+ "      ss $$$$$$$$$$$$$$$          ssss                      ss$s\r\n"
				+ "     sss   $$$$$$$$$$$            ssss$$$$ss              $$$$s.\r\n"
				+ "    sssss   $$$$$$$$   s.      .sss$$$$$$$$sss      sss$$$$$$s\r\n"
				+ "    ss$ssss  $$$$$$$  sss.  .ss$$$$$$ss$ss     .         s$$$$s.\r\n"
				+ "    ss$s   s  $$$$$$ ss.ss           ..        ss           .sss\r\n"
				+ "     ss   s $s $$$$$ ss..s.                   ss\r\n"
				+ "      s ss$$$$s $$$$ ssssss.                 .ss\r\n"
				+ "    ss     s$$$s $$$ ssssssssss..           ssss.              .\r\n"
				+ "    ss      $$  s $$ ss..ss$$$$sss        .sssss              ..\r\n"
				+ "     s      s$$ss  $ ssss.sss$$$sss       .sssss.     ss..\r\n"
				+ "      s.     $     $ .sss . .ss$sss        .  sssssss...   ss$\r\n"
				+ "        ss   sssss$$ ..ss   ...sssss            .sss.       s\r\n"
				+ "          ss    $$ $ .ss..s .sssssss\r\n"
				+ "            ss$$  $$  .ssssss .sssss              ..       $\r\n"
				+ "                $$$$  .ss$$ssss...s.s        ..sss$$ssss.\r\n"
				+ "               $$.$$$  .ss$$sss.. sss.    .ssss$$s..s$ss. s\r\n"
				+ "               ss ssss  .sssssss...sss.      .ssss$$ss..  .\r\n"
				+ "               ss  ssss   .ssssssss.sss.        .sss.\r\n"
				+ "               ss    .ssss    .sssssssss.               s\r\n"
				+ "               ss      .sssss.  .sssssss.s .. ..ss$s. .s\r\n"
				+ "              ss         sssssss.  .sssssssssssss$$s. .ss\r\n"
				+ "            $ss           ssssssss.   ..sssssssssss  .ss.\r\n"
				+ "          $$$$.            .sssssssss.     ssssss ssss.$s\r\n"
				+ "      s$$$$$$$$s.             ..ssssssssss......ssss. s$$$s\r\n"
				+ "    .s$$$$$$$$$$$s.              .ssssssssssssssss. s$$$$$ss.\r\n"
				+ "       s$$$$$$$$$$$$$$ss..          .ssssssssss. .s$$$$$$$$s\r\n"
				+ "         s$$$$$$$$$$$$$$$$$$$ssss...   ...ss.. s$$$$$$$$$s\r\n"
				+ "           s$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s\r\n"
				+ "              .s$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s\r\n"
				+ "                    .s$$$$$$$$$$$$$$$$$$$$$$$$$$$$$s\r\n"
				+ "                          .s$$$$$$$$$$$$$$$$$$$$s\r\n"
				+ "                                ..s$$$$$$$$$$s" +" " + str);
		
		return (Spock);
	}
}
	/*V1 code
		public String nameWho() {
			return(nWho);
		}
		public String nameE5() {
			return(nE5);
		}
		public String nameUSS() {
			return(nUSS);
		}
}

	
	 * public int setWHO(String USS ,int r) { // Tardis V1
		int eWHO; //engine for tardis
		int pWHO = p; // takes the current position from out side the program to hold it (also checks for 0. Should it happen)
		eWHO = engineModeWho(r); //engine mode (movement)
		pWHO += eWHO; //adds the result from the engine and adds it to itself
		pWHO = Math.max(pWHO, 0); // checks if the TARDIS goes to far back and sets its position back to 0
		return(pWHO);
	} 
	
	public int setE5(String USS ,int eR) {
		int eE5;
		int pE5 = eP;
		eE5 = engineModeE5(eR); 
		pE5 += eE5; 
		pE5 = Math.max(pE5, 0); 
		return(pE5);
	}
	

	public int setUSS(String USS, int uR) {
		int eUSS;
		int pUSS = uP; 
		eUSS = engineModeUSS(uR); 
		pUSS += eUSS; 
		pUSS = Math.max(pUSS, 0); 
		return(pUSS);
	}
	
*/
/* hold onto for a bit
 * private int engineModeWho(int mode) {
		int tNum = 0; //sets it too 0 so it can later calc it
		switch (mode) {
		case 1,2:
			tNum = 10;
		return(tNum);
		case 3,4:
			tNum = -1;
		case 5,6,7:
			tNum = ((int)Math.random()*10) + 7; //Randomizes between 1 - 10 and adds 4
		return(tNum);
		case 8,9:
			tNum = 50;
		case 10:
			tNum = -20; // for whatever reason it really loves this one lol so nerfing it
			return(tNum);
		}
		return(tNum);
	}
	private int engineModeE5(int eMode) {
		int eNum = 0; //sets it too 0 so it can later calc it
		switch (eMode) {
		case 1, 2, 3, 4 ,5:
			eNum = 1;
		return(eNum);
		case 6, 7:
			eNum = -3;
		return(eNum);
		case 8,9,10:
			eNum = 5;
		return(eNum);
		} 
		return(eNum);
	}
	private int engineModeUSS(int uMode) {
		int uNum = 0; 
		switch (uMode) {
		case 2,3,4:
			uNum = 7;
		return(uNum);
		case 5,6,7,8:
			uNum = -4;
		return(uNum);
		case 9,10:
			uNum = 1;
		return(uNum);
		}
		return(uNum);
	}
	public int tardisPosition() {return position;}
	public int E5Position() {return position;}
	public int USSPosition() {return position;}
	public String getName() {return this.shipName;}
	}
 */