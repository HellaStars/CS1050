package spaceRace; // SpaceCraft V1 by Asta Walor-Scott

public class spaceCraft {

	//technically All the ships will have the same bones. Especially the public part. But I would have to pass a string through to check
	//which ships are active. Or maybe just an int. then do a if (same idea for the string)
	private int position;
	private String shipName;
	
	spaceCraft(String name){this.shipName = name; this.position = 0;}
	public void setShip(int c, int r) {
		if (c == 1) {
			position += engineModeWho(r); //adds the result from the engine and adds it to itself
			position = Math.max(position, 0); // makes sure the result is bigger than 0 pWho >= 0 and checks if pWho is greater or equal to 70
		} else if (c == 2) {
			position += engineModeE5(r); //adds the result of the engine to the position
			position = Math.max(position, 0); //pE5 >= 0 & pE5 <=70
		} else if (c == 3) { //engine mode (movement)
			position += engineModeUSS(r); //adds the result of the engine to the position
			position = Math.max(position, 0); // pUSS >= 0 & pUSS <= 70
		}
	}
	private int engineModeWho(int mode) {
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