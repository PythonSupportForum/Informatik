/**
 * Eine Klasse zur Erzeugung eines Ticket Objecktes, dass die Tickets eines Parkhauses beschreiben soll.
 * Jedes Ticket Objeckt zeichnet sich durch zwei Attribute aus, die einmal die Ankunfszeit, bei der das Parkaus betreten wurde und einen Wahrheitswert, ob das Ticket bezahlt wurde speichert.
 */
public class Ticket {
    private Uhrzeit ankunftszeit; 
    private boolean bezahlt; 
    
    /**
     * Erzeugt ein neues Objelt vom Typ der Klasse Ticket, indem der übergebene Paramerter als Ankunktszeit gespeichert wird. Der Bezahlstatus wird automatisch auf unwahr gesetzt. 
     */
    public Ticket(Uhrzeit pAnkunftszeit){
        this.setAnkunftszeit(pAnkunftszeit); 
        this.setBezahlt(false);
    }
    
    /**
     * Erzeugt ein neues Objelt vom Typ der Klasse Ticket, indem der übergebene Paramerter als Ankunktszeit gespeichert wird. Ein zweiter Parameter legt fest, ob das Ticket bereits bezahlt wurde.
     */
    public Ticket(Uhrzeit pAnkunftszeit, boolean pBezahlt){
        this.setAnkunftszeit(pAnkunftszeit); 
        this.setBezahlt(pBezahlt);
    }
    
    /**
     * Setzt das Attribut für die Ankunftszeit auf den Übergebenen Parameter
     */
    public void setAnkunftszeit(Uhrzeit pAnkunftszeit){
        this.ankunftszeit = pAnkunftszeit; 
    }
    
    public Uhrzeit getAnkunftszeit(){ 
        return this.ankunftszeit;
    }
    
    /**
     * Setzt das Attribut für den Bezahlstatus auf den Übergebenen Parameter
     */
    public void setBezahlt(boolean pBezahlt){
        this.bezahlt = pBezahlt; 
    }
    
    /**
     * Gibt einen Wahrheitswert zurück, ob das Ticket berets bezahlt wurde.
     */
    public boolean getBezahlt(){ 
        return this.bezahlt;
    }
    
    /**
     * Setzt das Attribut Bezahlt auf Wahr.
     */
    public void alsBezahltMakieren () {
            this.setBezahlt(true);
    }
}