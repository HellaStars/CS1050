package sussyBaka;

public class clock {
	private int uTime;
	private boolean startClock = false;
	protected boolean clockTF = false;
	
	clock (int time) {this.uTime = time;}
	
	public void startClock() {
		startClock = true;
		clocker();
	}
	private void clocker() {
		int b = 0;
		while (startClock = true) {
			if (b < uTime) {
				clockTF = false;
				b++;
			} else if ( b == uTime) {
				clockTF = true;
				b = 0;
			}
		}
	}
	public boolean checkClock() {
		return(clockTF);
	}
}
