public class Ticket {
        private int ankunftszeit; 
	private boolean bezahlt; 

	public Ticket(int pAnkunftszeit, boolean pBezahlt){
		this.setAnkunftszeit(pAnkunftszeit); 
		this.setBezahlt(pBezahlt); 
	}
	public void setAnkunftszeit(int pAnkunftszeit){
		this.ankunftszeit = pAnkunftszeit; 
	}
	public int getAnkunftszeit(){ 
		return this.ankunftszeit;
	}
	public void setBezahlt(boolean pBezahlt){
		this.bezahlt = pBezahlt; 
	}
	public boolean getBezahlt(){ 
		return this.bezahlt;
	}
	public void alsBezahltMarkieren () {
		this.setBezahlt(true);
	}
}