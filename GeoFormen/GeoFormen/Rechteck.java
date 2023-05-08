
/**
 * Die Klasse Rechteck soll bei diesem Projekt zur Generierung neuer Objekte des Rechteck-Typs verwendet werden können. Die Klasse besitzt verschiedene Attribute, die die einzelnen Objekte dieser Klasse characteriesieren. Im Kontekt des Projektes :::::::::::::::::: soll die Klasse zur Erzeugung einzelner ::::::: dienen. Diese Generierten Objekte können dann :::::::::. Das Repräsentiert im Kontekt des Projektes :::::::. Ein Objekt dieser Klasse kann über den einen Konstruktor generiert werden. Übergeben werden müssen die Parameter double pBreite, double pTiefe, die für die Gleichnamigen Attribute stehen. Die Werte der Attribute werden bei Erzeugung eines Objektes automatisch auf die der übergebenen Parameter gesetzt. 
 */
public class Rechteck {
    private double breite; 
    private double tiefe; 

    /**
     * Erzeugt ein neues Objekt vom Typ der Klasse Rechteck und gibt dieses zurück. Als Parameter muss double pBreite, double pTiefe übergeben werden. Die Übergebenen Parameter werden automatisch in dem entsprechenden Attribut des neuen Objektes gespeichert.
     */
    public Rechteck(double pBreite, double pTiefe){
        this.setBreite(pBreite); 
        this.setTiefe(pTiefe); 
    }

    /**
     * Setzt das Attribut Breite eines Objektes der Klasse Rechteck auf den mit dem Parameter pBreite übergebenen Wert.
     */
    public void setBreite(double pBreite){
        this.breite = pBreite; 
    }
    /**
     * Ist die Getter Methode für das Attribute Breite. So kann der Wert von dem Attribut Breite der Klasse Rechteck ausgelesen und woanders verwendet werden. 
     */
    public double getBreite(){ 
        return this.breite;
    }

    /**
     * Setzt das Attribut Tiefe eines Objektes der Klasse Rechteck auf den mit dem Parameter pTiefe übergebenen Wert.
     */
    public void setTiefe(double pTiefe){
        this.tiefe = pTiefe; 
    }
    /**
     * Ist die Getter Methode für das Attribute Tiefe. So kann der Wert von dem Attribut Tiefe der Klasse Rechteck ausgelesen und woanders verwendet werden. 
     */
    public double getTiefe(){ 
        return this.tiefe;
    }

    /**
     * Die Methode Flaecheninhalt der Klasse Rechteck gibt einen Wert vom Typ double zurück. 
     */
    public double Flaecheninhalt () {
        return this.getBreite()*this.getTiefe();
    }

    /**
     * Die Methode Umfang der Klasse Rechteck gibt einen Wert vom Typ double zurück. 
     */
    public double Umfang () {
        return 2*(this.getBreite()+this.getTiefe());
    }
    
    public double Diagonale () {
        return Math.sqrt(this.getBreite()*this.getBreite()+this.getTiefe()*this.getTiefe());
    }

}
