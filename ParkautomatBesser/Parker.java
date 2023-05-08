/**
 * Eine Klasse die eine Person in einem Parkhaus darstellt und deren Guthaben verwaltet. 
 */

public class Parker {
    private double Geld;
    private Ticket ticket;
    
    /**
     * Erzeugt ein Neues Objekt vom Typ der Klasse Parker, mit einem Parameter, der Angibt wie viel Geld die Person zur Verfügung hat. Dieser Wert wird in dem Attribut für das Geld gespeichert. Zusätzlich wird von einem übergebenen Automaten ein neues Ticket gezogen ung gespeichert.
     */
    public Parker(double pGeld, Automat pAutomat){
        this.setGeld(pGeld);
        this.setTicket(pAutomat.ticketAusgeben());
    }
    
    /**
     * Setzt den Wert des Attributes Geld auf den übergebenen Parameter.
     */
    public void setGeld(double pGeld){
        this.Geld = pGeld; 
    }
    
    /**
     * Gibt den Wert des Attributes Geld aus.
     */    
    public double getGeld(){ 
        return this.Geld;
    }
    
    /**
     * Setzt den Wert des Attributes Ticket auf den übergebenen Parameter.
     */
    public void setTicket(Ticket pTicket){
        this.ticket = pTicket;
    }
    
    /**
     * Gibt den Wert des Attributes Ticket aus.
     */    
    public Ticket getTicket(){ 
        return this.ticket;
    }
    
    public void ticketEinschieben (Automat pAutomat) {
        pAutomat.ticketEinziehen(this.getTicket());
    }

    public Ticket ticketNehmen (Automat pAutomat) {
        return pAutomat.ticketAusgeben();
    }
    
    /**
     * Subtrahiert von dem Attribut Geld die vom übergebenen Automaten ermittelten Parkgebüren. Übergeben wird ein Ticket und ein Automat als Parameter. 
     */
    public void gebuehrBezahlen (Automat pAutomat) {
        this.setGeld(this.getGeld() - pAutomat.gebuerenBerechnen(this.getTicket()));
    }
}