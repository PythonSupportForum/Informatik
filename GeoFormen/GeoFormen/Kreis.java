/**
 * Die Klasse Kreis soll bei diesem Projekt zur Generierung neuer Objekte des Kreis-Typs verwendet werden können. Die Klasse besitzt verschiedene Attribute, die die einzelnen Objekte dieser Klasse characteriesieren. Im Kontekt des Projektes :::::::::::::::::: soll die Klasse zur Erzeugung einzelner ::::::: dienen. Diese Generierten Objekte können dann :::::::::. Das Repräsentiert im Kontekt des Projektes :::::::. Ein Objekt dieser Klasse kann über den einen Konstruktor generiert werden. Übergeben werden müssen die Parameter int pRadius, die für die Gleichnamigen Attribute stehen. Die Werte der Attribute werden bei Erzeugung eines Objektes automatisch auf die der übergebenen Parameter gesetzt. 
 */
public class Kreis {
    private double radius; 

    /**
     * Erzeugt ein neues Objekt vom Typ der Klasse Kreis und gibt dieses zurück. Als Parameter muss int pRadius übergeben werden. Die Übergebenen Parameter werden automatisch in dem entsprechenden Attribut des neuen Objektes gespeichert.
     */
    public Kreis(double pRadius){
        this.setRadius(pRadius); 
    }

    /**
     * Setzt das Attribut Radius eines Objektes der Klasse Kreis auf den mit dem Parameter pRadius übergebenen Wert.
     */
    public void setRadius(double pRadius){
        this.radius = pRadius; 
    }

    /**
     * Gibt den Wert des Attributes Radius eines Objektes der Klasse Kreis zurück.
     */
    public double getRadius(){ 
        return this.radius;
    }
    
    public double Flaecheninhalt(){
        return Math.PI*this.getRadius()*this.getRadius();
    }
    
    public double Umfang(){
        return this.getRadius()*2*Math.PI;
    }
}