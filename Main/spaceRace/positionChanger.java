package spaceRace; //positionChanger v1.5 by Asta Walor-Scott
//will add to it for enviromentals and take tardis out of universal
//added engine to route through this instead of staying in spaceCraft. 

public class positionChanger {
	public int position = 0;
	public int effects;
	public int subEffects;
	TARDIS Tardis;
	positionChanger(TARDIS tardis) {Tardis = tardis;} 
	
	public void setIndivPosition(int pos, int engine) {this.position = pos + engine;positionCalc();} // sets position. calcs the position
	
	private void positionCalc() {position += effects;} // put universal effects here (things every ship that faces said effect)
	public int positionChange() {subEffects = Tardis.getTime();return(subEffects);}
	public int getPosition() {return(position);}
	
}
