/**
 * Die Klasse Zylinder soll bei diesem Projekt zur Generierung neuer Objekte des Zylinder-Typs verwendet werden können. Die Klasse besitzt verschiedene Attribute, die die einzelnen Objekte dieser Klasse characteriesieren. Im Kontekt des Projektes :::::::::::::::::: soll die Klasse zur Erzeugung einzelner ::::::: dienen. Diese Generierten Objekte können dann :::::::::. Das Repräsentiert im Kontekt des Projektes :::::::. Ein Objekt dieser Klasse kann über den einen Konstruktor generiert werden. Übergeben werden müssen die Parameter double pHoehe, die für die Gleichnamigen Attribute stehen. Die Werte der Attribute werden bei Erzeugung eines Objektes automatisch auf die der übergebenen Parameter gesetzt. 
 * Die Klasse Kreis wird von der Klasse Zylinder geerbt. Das heißt, dass alle nicht als 'private' deklarierten Attribute und Methoden der Klasse Kreis vererbt werden und bei Objekten der Aktuellen Klasse ebenfals als Eigenschaften hinzugefügt werden. Das bietet den Vorteil, dass diese Attribute und Methoden nicht erneut geschreiben werden müssen, sondern weiterverwendet werden können.
 */
public class Zylinder extends Kreis {
	private double hoehe; 

	/**
	 * Erzeugt ein neues Objekt vom Typ der Klasse Zylinder und gibt dieses zurück. Als Parameter muss double pHoehe übergeben werden. Die Übergebenen Parameter werden automatisch in dem entsprechenden Attribut des neuen Objektes gespeichert.
	 */
	public Zylinder(double radius, double pHoehe){
	    super(radius);
	    this.setHoehe(pHoehe); 
	}

	/**
	 * Setzt das Attribut Hoehe eines Objektes der Klasse Zylinder auf den mit dem Parameter pHoehe übergebenen Wert.
	 */
	public void setHoehe(double pHoehe){
		this.hoehe = pHoehe; 
	}
	/**
	 * Ist die Getter Methode für das Attribute Hoehe. So kann der Wert von dem Attribut Hoehe der Klasse Zylinder ausgelesen und woanders verwendet werden. 
	 */
	public double getHoehe(){ 
		return this.hoehe;
	}

	/**
	 * Die Methode Volumen der Klasse Zylinder gibt einen Wert vom Typ double zurück. 
	 */
	public double Volumen () {
		return super.Flaecheninhalt()*this.getHoehe();
	}

	/**
	 * Die Methode Oberflaeche der Klasse Zylinder gibt einen Wert vom Typ double zurück. 
	 */
	public double Mantelflaeche () {
		return super.Umfang()*this.getHoehe();
	}
	
	public double Oberflaeche() {
		return super.Umfang()*this.getHoehe()+super.Flaecheninhalt()*2;
	}

}
