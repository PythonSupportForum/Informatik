/**
 * Die Klasse Kugel soll bei diesem Projekt zur Generierung neuer Objekte des Kugel-Typs verwendet werden können. Die Klasse besitzt verschiedene Attribute, die die einzelnen Objekte dieser Klasse characteriesieren. Im Kontekt des Projektes :::::::::::::::::: soll die Klasse zur Erzeugung einzelner ::::::: dienen. Diese Generierten Objekte können dann :::::::::. Das Repräsentiert im Kontekt des Projektes :::::::. Ein Objekt dieser Klasse kann über den einen Konstruktor generiert werden. Übergeben werden müssen die Parameter double pRadius, die für die Gleichnamigen Attribute stehen. Die Werte der Attribute werden bei Erzeugung eines Objektes automatisch auf die der übergebenen Parameter gesetzt. 
 */
public class Kugel {
    private double radius; 

    /**
     * Erzeugt ein neues Objekt vom Typ der Klasse Kugel und gibt dieses zurück. Als Parameter muss double pRadius übergeben werden. Die Übergebenen Parameter werden automatisch in dem entsprechenden Attribut des neuen Objektes gespeichert.
     */
    public Kugel(double pRadius){
        this.setRadius(pRadius); 
    }

    /**
     * Setzt das Attribut Radius eines Objektes der Klasse Kugel auf den mit dem Parameter pRadius übergebenen Wert.
     */
    public void setRadius(double pRadius){
        this.radius = pRadius; 
    }

    /**
     * Ist die Getter Methode für das Attribute Radius. So kann der Wert von dem Attribut Radius der Klasse Kugel ausgelesen und woanders verwendet werden. 
     */
    public double getRadius(){ 
        return this.radius;
    }

    /**
     * Die Methode Volumen der Klasse Kugel gibt einen Wert vom Typ double zurück. 
     */
    public double Volumen () {
        return (4/3)*Math.PI*Math.pow(this.getRadius(), 3);
    }

    /**
     * Die Methode Oberflaeche der Klasse Kugel gibt einen Wert vom Typ double zurück. 
     */
    public double Oberflaeche () {
        return 4*Math.PI*Math.pow(this.getRadius(), 2);
    }

    public double Durchmesser () {
        return this.getRadius()*2;
    }

}