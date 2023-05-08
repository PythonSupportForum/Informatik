/**
 * Die Klasse Dreieck soll bei diesem Projekt zur Generierung neuer Objekte des Dreieck-Typs verwendet werden können. Die Klasse besitzt verschiedene Attribute, die die einzelnen Objekte dieser Klasse characteriesieren. Im Kontekt des Projektes :::::::::::::::::: soll die Klasse zur Erzeugung einzelner ::::::: dienen. Diese Generierten Objekte können dann :::::::::. Das Repräsentiert im Kontekt des Projektes :::::::. Ein Objekt dieser Klasse kann über den einen Konstruktor generiert werden. Übergeben werden müssen die Parameter double pSeitea, double pSeiteb, double pSeitec, double pHoehe, die für die Gleichnamigen Attribute stehen. Die Werte der Attribute werden bei Erzeugung eines Objektes automatisch auf die der übergebenen Parameter gesetzt. 
 */
public class Dreieck {
	private double seitea; 
	private double seiteb; 
	private double seitec; 
	private double hoehe; 

	/**
	 * Erzeugt ein neues Objekt vom Typ der Klasse Dreieck und gibt dieses zurück. Als Parameter muss double pSeitea, double pSeiteb, double pSeitec, double pHoehe übergeben werden. Die Übergebenen Parameter werden automatisch in dem entsprechenden Attribut des neuen Objektes gespeichert.
	 */
	public Dreieck(double pSeitea, double pSeiteb, double pSeitec, double pHoehe){
		this.setSeitea(pSeitea); 
		this.setSeiteb(pSeiteb); 
		this.setSeitec(pSeitec); 
		this.setHoehe(pHoehe); 
	}

	/**
	 * Setzt das Attribut Seitea eines Objektes der Klasse Dreieck auf den mit dem Parameter pSeitea übergebenen Wert.
	 */
	public void setSeitea(double pSeitea){
		this.seitea = pSeitea; 
	}
	/**
	 * Ist die Getter Methode für das Attribute Seitea. So kann der Wert von dem Attribut Seitea der Klasse Dreieck ausgelesen und woanders verwendet werden. 
	 */
	public double getSeitea(){ 
		return this.seitea;
	}

	/**
	 * Setzt das Attribut Seiteb eines Objektes der Klasse Dreieck auf den mit dem Parameter pSeiteb übergebenen Wert.
	 */
	public void setSeiteb(double pSeiteb){
		this.seiteb = pSeiteb; 
	}
	/**
	 * Ist die Getter Methode für das Attribute Seiteb. So kann der Wert von dem Attribut Seiteb der Klasse Dreieck ausgelesen und woanders verwendet werden. 
	 */
	public double getSeiteb(){ 
		return this.seiteb;
	}

	/**
	 * Setzt das Attribut Seitec eines Objektes der Klasse Dreieck auf den mit dem Parameter pSeitec übergebenen Wert.
	 */
	public void setSeitec(double pSeitec){
		this.seitec = pSeitec; 
	}
	/**
	 * Ist die Getter Methode für das Attribute Seitec. So kann der Wert von dem Attribut Seitec der Klasse Dreieck ausgelesen und woanders verwendet werden. 
	 */
	public double getSeitec(){ 
		return this.seitec;
	}

	/**
	 * Setzt das Attribut Hoehe eines Objektes der Klasse Dreieck auf den mit dem Parameter pHoehe übergebenen Wert.
	 */
	public void setHoehe(double pHoehe){
		this.hoehe = pHoehe; 
	}
	/**
	 * Ist die Getter Methode für das Attribute Hoehe. So kann der Wert von dem Attribut Hoehe der Klasse Dreieck ausgelesen und woanders verwendet werden. 
	 */
	public double getHoehe(){ 
		return this.hoehe;
	}

	/**
	 * Die Methode Flaecheninhalt der Klasse Dreieck gibt einen Wert vom Typ double zurück. 
	 */
	public double Flaecheninhalt () {
		return this.getSeitea()*this.getHoehe();
	}

	/**
	 * Die Methode Umfang der Klasse Dreieck gibt einen Wert vom Typ double zurück. 
	 */
	public double Umfang () {
		return this.getSeitea()+getSeiteb()+getSeitec();
	}

}
