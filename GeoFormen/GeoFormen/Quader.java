/**
 * Die Klasse Quader soll bei diesem Projekt zur Generierung neuer Objekte des Quader-Typs verwendet werden können. Die Klasse besitzt verschiedene Attribute, die die einzelnen Objekte dieser Klasse characteriesieren. Im Kontekt des Projektes :::::::::::::::::: soll die Klasse zur Erzeugung einzelner ::::::: dienen. Diese Generierten Objekte können dann :::::::::. Das Repräsentiert im Kontekt des Projektes :::::::. Ein Objekt dieser Klasse kann über den einen Konstruktor generiert werden. Übergeben werden müssen die Parameter double pHoehe, die für die Gleichnamigen Attribute stehen. Die Werte der Attribute werden bei Erzeugung eines Objektes automatisch auf die der übergebenen Parameter gesetzt. 
 * Die Klasse Rechteck wird von der Klasse Quader geerbt. Das heißt, dass alle nicht als 'private' deklarierten Attribute und Methoden der Klasse Rechteck vererbt werden und bei Objekten der Aktuellen Klasse ebenfals als Eigenschaften hinzugefügt werden. Das bietet den Vorteil, dass diese Attribute und Methoden nicht erneut geschreiben werden müssen, sondern weiterverwendet werden können.
 */
public class Quader extends Rechteck {
	private double hoehe; 

	/**
	 * Erzeugt ein neues Objekt vom Typ der Klasse Quader und gibt dieses zurück. Als Parameter muss double pHoehe übergeben werden. Die Übergebenen Parameter werden automatisch in dem entsprechenden Attribut des neuen Objektes gespeichert.
	 */
	public Quader(double pBreite, double pTiefe, double pHoehe){
	    super(pBreite, pTiefe);
	    this.setHoehe(pHoehe); 
	}

	/**
	 * Setzt das Attribut Hoehe eines Objektes der Klasse Quader auf den mit dem Parameter pHoehe übergebenen Wert.
	 */
	public void setHoehe(double pHoehe){
		this.hoehe = pHoehe; 
	}
	/**
	 * Ist die Getter Methode für das Attribute Hoehe. So kann der Wert von dem Attribut Hoehe der Klasse Quader ausgelesen und woanders verwendet werden. 
	 */
	public double getHoehe(){ 
		return this.hoehe;
	}

	/**
	 * Die Methode Volumen der Klasse Quader gibt einen Wert vom Typ double zurück. 
	 */
	public double Volumen () {
		return super.Flaecheninhalt()*this.getHoehe();
	}
	
	public double Mantelflaeche () {
		return super.Umfang()*this.getHoehe();
	}

	/**
	 * Die Methode Oberflaeche der Klasse Quader gibt einen Wert vom Typ double zurück. 
	 */
	public double Oberflaeche () {
		return this.Mantelflaeche()+super.Flaecheninhalt()*2;
	}

	/**
	 * Die Methode RaumDiagonale der Klasse Quader gibt einen Wert vom Typ double zurück. 
	 */
	public double RaumDiagonale () {
		return Math.sqrt(Math.pow(super.Diagonale(), 2)*Math.pow(this.getHoehe(), 2));
	}

}