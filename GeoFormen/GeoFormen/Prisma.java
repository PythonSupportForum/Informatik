/**
 * Die Klasse Prisma soll bei diesem Projekt zur Generierung neuer Objekte des Prisma-Typs verwendet werden können. Die Klasse besitzt verschiedene Attribute, die die einzelnen Objekte dieser Klasse characteriesieren. Im Kontekt des Projektes :::::::::::::::::: soll die Klasse zur Erzeugung einzelner ::::::: dienen. Diese Generierten Objekte können dann :::::::::. Das Repräsentiert im Kontekt des Projektes :::::::. Ein Objekt dieser Klasse kann über den einen Konstruktor generiert werden. Übergeben werden müssen die Parameter double pGrundflaeche, double pHoehe, die für die Gleichnamigen Attribute stehen. Die Werte der Attribute werden bei Erzeugung eines Objektes automatisch auf die der übergebenen Parameter gesetzt. 
 */
public class Prisma {
	private double grundflaeche; 
	private double hoehe; 

	/**
	 * Erzeugt ein neues Objekt vom Typ der Klasse Prisma und gibt dieses zurück. Als Parameter muss double pGrundflaeche, double pHoehe übergeben werden. Die Übergebenen Parameter werden automatisch in dem entsprechenden Attribut des neuen Objektes gespeichert.
	 */
	public Prisma(double pGrundflaeche, double pHoehe){
		this.setGrundflaeche(pGrundflaeche); 
		this.setHoehe(pHoehe); 
	}

	/**
	 * Setzt das Attribut Grundflaeche eines Objektes der Klasse Prisma auf den mit dem Parameter pGrundflaeche übergebenen Wert.
	 */
	public void setGrundflaeche(double pGrundflaeche){
		this.grundflaeche = pGrundflaeche; 
	}
	/**
	 * Ist die Getter Methode für das Attribute Grundflaeche. So kann der Wert von dem Attribut Grundflaeche der Klasse Prisma ausgelesen und woanders verwendet werden. 
	 */
	public double getGrundflaeche(){ 
		return this.grundflaeche;
	}

	/**
	 * Setzt das Attribut Hoehe eines Objektes der Klasse Prisma auf den mit dem Parameter pHoehe übergebenen Wert.
	 */
	public void setHoehe(double pHoehe){
		this.hoehe = pHoehe; 
	}
	/**
	 * Ist die Getter Methode für das Attribute Hoehe. So kann der Wert von dem Attribut Hoehe der Klasse Prisma ausgelesen und woanders verwendet werden. 
	 */
	public double getHoehe(){ 
		return this.hoehe;
	}

	/**
	 * Die Methode Volumen der Klasse Prisma gibt einen Wert vom Typ double zurück. 
	 */
	public double Volumen () {
		return this.getGrundflaeche()*this.getHoehe();
	}

}