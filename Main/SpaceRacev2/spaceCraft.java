package spaceRace; // SpaceCraft V1 by Asta Walor-Scott

public class spaceCraft {

	//technically All the ships will have the same bones. Especially the public part. But I would have to pass a string through to check
	//which ships are active. Or maybe just an int. then do a if (same idea for the string)
	private int pWho; //position Tardis (dr. Who)
	private int pE5; //Position Eagle 5
	private int pUSS; // position USS 
	private String nWho;
	private String nE5;
	private String nUSS;
	public int setShip(String a, int c, int o) {
		int eWHO; //engine for tardis
		int eE5;// Eagle 5 engine
		int eUSS; //USS enterprise engine
		if (c == 1) {
			nWho = a;
			eWHO = engineModeWho(o); //engine mode (movement)
			pWho += eWHO; //adds the result from the engine and adds it to itself
			pWho = Math.max(pWho, 0); // makes sure the result is bigger than 0 pWho >= 0
			return(pWho);
		} else if (c == 2) {
			nE5 = a;
			eE5 = engineModeE5(o); //engine mode (movement)
			pE5 += eE5; //adds the result of the engine to the position
			pE5 = Math.max(0, pE5); //pE5 >= 0
			return(pE5);
		} else if (c == 3) {
			nUSS = a;
			eUSS = engineModeUSS(o); //engine mode (movement)
			pUSS += eUSS; //adds the result of the engine to the position
			pUSS = Math.max(0, pUSS); // pUSS >= 0
			return (pUSS);
		} else return (0);
	}
	private static int engineModeWho(int mode) {
		int tNum = 0; //sets it too 0 so it can later calc it
		switch (mode) {
		case 1,2:
			tNum = 4;
		return(tNum);
		case 3,4:
			tNum = -1;
		case 5,6,7:
			tNum = ((int)Math.random()*10) + 4; //Randomizes between 1 - 10 and adds 4
		return(tNum);
		case 8,9:
			tNum = 70;
		case 10:
			tNum = -22; // for whatever reason it really loves this one lol so nerfing it
			return(tNum);
		}
		return(tNum);
	}
	private static int engineModeE5(int eMode) {
		int eNum = 0; //sets it too 0 so it can later calc it
		switch (eMode) {
		case 1, 2, 3, 4 ,5:
			eNum += 1;
		return(eNum);
		case 6, 7:
			eNum = Math.max(eNum-3, 1);
		return(eNum);
		case 8,9,10:
			eNum += 5;
		return(eNum);
		} 
		return(eNum);
	}
	private static int engineModeUSS(int uMode) {
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
	public int getShip(int c){
		if (c == 1) {
			return (pWho);
		} else if (c == 2) {
			return(pE5);
		} else if (c == 3) {
			return (pUSS);
		}else return (0);
	}
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

	/*V1 code
	 * public int WHO(int r, int p) { // Tardis V1
		int eWHO; //engine for tardis
		int pWHO = p; // takes the current position from out side the program to hold it (also checks for 0. Should it happen)
		eWHO = engineModeWho(r); //engine mode (movement)
		pWHO += eWHO; //adds the result from the engine and adds it to itself
		pWHO = Math.max(pWHO, 0); // checks if the TARDIS goes to far back and sets its position back to 0
		return(pWHO);
	} 
	
	public int E5(int eR, int eP) {
		int eE5;
		int pE5 = eP;
		eE5 = engineModeE5(eR); 
		pE5 += eE5; 
		pE5 = Math.max(pE5, 0); 
		return(pE5);
	}
	

	public int USS(int uR, int uP) {
		int eUSS;
		int pUSS = uP; 
		eUSS = engineModeUSS(uR); 
		pUSS += eUSS; 
		pUSS = Math.max(pUSS, 0); 
		return(pUSS);
	}
	
*/