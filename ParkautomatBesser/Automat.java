/**
 * Die Klasse Automat stellt im Kontekt der Verwaltung eines Parkhauses einen Ticket-Generator und Bezahl-Automaten dar. Objekt dieser Klasse können neue Objekte vom Typ Ticket mit einer festgelegten Ankunftszeit initialsieren und zurückgeben. Die aktuelle Uhrzeit, die sowohl für die  Ankuftszeit als auch für den Zeitpunkt des Bezahlens genutzt wird, kann durch ein Attribut verwaltet werden. Beim Bezahlen ermittelt die Klasse aus der in einem Ticket gespeicherten Ankuntszeit und der aktuellen Uhrzeit aus dem gleichnamigen Attribut mit Hilfe eines Preis für Stunde Wertes den Preis den ein Objekt vom Typ Parker bezahlen muss.
 */
public class Automat {
    private double display; 
    private Uhrzeit aktuelleUhrzeit; 
    private double stundenpreis; 
    
    /**
     * Erzeut ein neues Objekt vom Typ Automat, wobei die Parameter pAktuelleUhrzeit und pStundenpreis übergeben werden. Diese werden in den Attributen aktuelleUhrzeit und stundenpreis gespeichert. Im Kontext eines Parkhauses stehen Sie für die Uhrzeit, die aktuell im Automat gespeichert sein soll, und der Preis, den ein Parker für eine Stunde Parken bezahlen muss, dar.
     */
    public Automat(Uhrzeit pAktuelleUhrzeit, double pStundenpreis){
        this.setDisplay(0); 
        this.setAktuelleUhrzeit(pAktuelleUhrzeit); 
        this.setStundenpreis(pStundenpreis); 
    }
    
    /**
     * Setz das Attribut Display auf den übergebenen Parameter. Im Kontekt eines Parkhauses wird dadurch die Zahl, die auf dem Display einer Automaten-instanz steht gesetzt.
     */
    public void setDisplay(double pDisplay){
        this.display = pDisplay; 
    }
    
    /**
     * Gibt den Wert des Attrbutes Display und damit den Text auf dem Display einer Automaten-instanz zurück.
     */
    public double getDisplay(){ 
        return this.display;
    }

    /**
     * Setzt das Attribut aktuelleUhrzeit auf einen übergebenen Paramter und damit die Zeit, nach der der Automat beim Ziehen und beim Bezahlen eines Tickets rechnet.
     */
    public void setAktuelleUhrzeit(Uhrzeit pAktuelleUhrzeit){
        this.aktuelleUhrzeit = pAktuelleUhrzeit; 
    }
    
    /**
     * Gibt das Attribut aktuelleUhrzeit zurück.
     */
    public Uhrzeit getAktuelleUhrzeit(){ 
        return this.aktuelleUhrzeit;
    }
    
    /**
     * Setzt das Attribut stundenpreis auf den Wert eines übergebenen Parameters.
     */
    public void setStundenpreis(double pStundenpreis){
        this.stundenpreis = pStundenpreis; 
    }
    
    /**
     * Gibt den Wert des Attributes stundenpreis zurück.
     */
    public double getStundenpreis(){ 
        return this.stundenpreis;
    }
    
    /**
     * Berechnet aus der Ankunftszeit eines übergebenen Tickets und des im Attribut des aktuellen Automatenobjektes gespeicherten Werts einen Betrag, der zurückgegeben wird. Diesen Betrag muss ein Parker für sein Ticket bezahlen.  
     */
    public double gebuerenBerechnen (Ticket pTicket) {
        int Stundenunterschied =this.getAktuelleUhrzeit().getStunde() - pTicket.getAnkunftszeit().getStunde();
        int Minutenunterschied =this.getAktuelleUhrzeit().getMinute() - pTicket.getAnkunftszeit().getMinute();
        double FinalerPreis = Stundenunterschied * this.getStundenpreis() + Minutenunterschied * (this.getStundenpreis() / 60);
        return FinalerPreis;
    }

    /**
     * Gibt den Wert des Attributes Display in der Konsole aus.
     */
    public void gebuehrAnzeigen () {
        System.out.println(this.getDisplay());
    }
    
    /**
     * Nimmt ein Objekt vom typ Ticket an, berechnet den fälligen Betrag und zeigt das Ergebnis mittels des Display Attributes an.
     */
    public void ticketEinziehen (Ticket pTicket) {
        this.setDisplay(this.gebuerenBerechnen(pTicket));
    }
    
    /**
     * Erzeug ein neues Objekt vom typ Ticket. Als Parameter wird der aktuelle Wert des Attributes AktuelleUhrzeit an das neue Ticket Objekt übergeben.
     */
    public Ticket ticketAusgeben () {
        return new Ticket(this.getAktuelleUhrzeit());
    }
    
    /**
     * Setzt den Bezahlstatus eines als Parameter übergebenen Ticketobjektes auf Wahr.
     */
    public void ticketMakieren (Ticket pTicket) {
        pTicket.setBezahlt(true);
    }

}