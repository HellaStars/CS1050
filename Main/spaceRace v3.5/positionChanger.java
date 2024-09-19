package spaceRace; //positionChanger by Asta Walor-Scott
//will add to it for enviromentals and take tardis out of universal. Also engine changes

public class positionChanger {
	public int position;
	TARDIS Tardis;
	positionChanger(TARDIS tardis){this.Tardis = tardis;} 
	
	public int universalPosition() {
		position = Tardis.getTime();
		return(position);
	}
}
