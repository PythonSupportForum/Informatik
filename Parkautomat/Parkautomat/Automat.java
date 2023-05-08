public class Automat {
	private int display; 
	private int aktuelleUhrzeit; 
	private int stundenpreis; 

	public Automat(int pDisplay, int pAktuelleUhrzeit, int pStundenpreis){
		this.setDisplay(pDisplay); 
		this.setAktuelleUhrzeit(pAktuelleUhrzeit); 
		this.setStundenpreis(pStundenpreis); 
	}

	public void setDisplay(int pDisplay){
		this.display = pDisplay; 
	}
	public int getDisplay(){ 
		return this.display;
	}

	public void setAktuelleUhrzeit(int pAktuelleUhrzeit){
		this.aktuelleUhrzeit = pAktuelleUhrzeit; 
	}
	public int getAktuelleUhrzeit(){ 
		return this.aktuelleUhrzeit;
	}

	public void setStundenpreis(int pStundenpreis){
		this.stundenpreis = pStundenpreis; 
	}
	public int getStundenpreis(){ 
		return this.stundenpreis;
	}

	public int gebuerBerechnen (Ticket pTicket) {
	    if(pTicket.getBezahlt() == true){
	       return 0;
	    }
	    int g = (this.getAktuelleUhrzeit()-pTicket.getAnkunftszeit())*this.getStundenpreis();
	    return g;
	}

	public void gebuerAnzeigen (Ticket pTicket) {
	    this.setDisplay(this.gebuerBerechnen(pTicket));
	}

	public void ticketEinziehen (Ticket pTicket) {
	    this.gebuerAnzeigen(pTicket);
	}

	public Ticket ticketAusgeben () {
	    Ticket t = new Ticket(this.getAktuelleUhrzeit(), false);
	    return t;
	}

	public void ticketMarkieren (Ticket pTicket) {
	    pTicket.alsBezahltMarkieren();
	}

}
