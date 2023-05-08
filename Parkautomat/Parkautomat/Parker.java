public class Parker {
	private int geld; 

	public Parker(int pGeld){
		this.setGeld(pGeld); 
	}

	public void setGeld(int pGeld){
		this.geld = pGeld; 
	}
	public int getGeld(){ 
		return this.geld;
	}

	public void ticketEinschieben (Ticket pTicket, Automat pAutomat) {
	        pAutomat.ticketEinziehen(pTicket);
		return;
	}

	public Ticket ticketNechmen (Automat pAutomat) {
	        Ticket t = pAutomat.ticketAusgeben();
		return t;
	}

        public void gebuerBezahlen (Automat pAutomat, Ticket pTicket) {
                int g = pAutomat.gebuerBerechnen(pTicket);
                this.setGeld(this.getGeld()-g);
                pAutomat.ticketMarkieren(pTicket);
		return;
	}
}