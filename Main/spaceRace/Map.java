package spaceRace; // Map v1 By Asta Walor-Scott

public class Map {
	TARDIS TARDIS;
	USSenterprise USS;
	Eagle5 E5;
	mapEffects mapE;
	public String Finished;
	public int uniSize;
	public StringBuilder str = new StringBuilder(" ");
	protected char sArray[] = new char[6];
	
	Map(int universeSize){this.uniSize = universeSize;}
	
	public void tardisPass(TARDIS tardis) {
		TARDIS = tardis;
	}
	public void eagle5Pass(Eagle5 Eagle5) {
		E5 = Eagle5;
	}
	public void ussPass(USSenterprise uss) {
		USS = uss;
	}
	public void array(char Array[]) {
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = Array[i];
		}
	}
	private void MAP() {
		str.delete(0, uniSize + 1);
		
		if (Math.max(Math.max(TARDIS.shipPosition(),E5.shipPosition()), USS.shipPosition()) < uniSize) {
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
		if (E5.shipPosition() == USS.shipPosition() && TARDIS.shipPosition() == E5.shipPosition() && USS.shipPosition() > 0){
			str.setCharAt(E5.shipPosition(), sArray[5]);
			str.setCharAt(USS.shipPosition(), sArray[0]);
			str.setCharAt(TARDIS.shipPosition(), sArray[0]);
		}
		str.append(sArray[4]);
		Finished = str.toString();
		
	}else if (Math.max(Math.max(TARDIS.shipPosition(),E5.shipPosition()), USS.shipPosition()) >= uniSize ) {
		if (TARDIS.shipPosition() >= uniSize) {
			Finished = str.toString() + TARDIS.getName() + " Won!"; 
		} else if (E5.shipPosition() >= uniSize) {
			Finished = str.toString() + E5.getName() + " Won!"; 
		}else if (USS.shipPosition() >= uniSize) {
			Finished = str.toString() + USS.getName()+ " Won!";
			Finished = USS.spock(Finished); 
		}
	}	
}
protected String getMap() {MAP();return(Finished);}
}