public class Veranstaltung
{
    private String titel; 
    private Person veranstalter; 
    private Zeitpunkt start; 
    private Zeitpunkt ende; 
    private Ort ort; 
    private int teilnehmerzahl; 
    private double orgaKosten; 
    private double eintritt; 
    private Person[] Referenten; 
    private Essen[] Nachrung; 

    public Veranstaltung(String pTitel, Person pVeranstalter, Zeitpunkt pStart, Zeitpunkt pEnde, Ort pOrt, int pTeilnehmerzahl, double pOrgaKosten, double pEintritt, Person[] pReferenten, Essen[] pNachrung){ 

        this.setTitel(pTitel); 
        this.setVeranstalter(pVeranstalter); 
        this.setStart(pStart); 
        this.setEnde(pEnde); 
        this.setOrt(pOrt); 
        this.setTeilnehmerzahl(pTeilnehmerzahl); 
        this.setOrgaKosten(pOrgaKosten); 
        this.setEintritt(pEintritt); 
        this.setReferenten(pReferenten); 
        this.setNachrung(pNachrung); 
    } 

    public void setTitel(String pTitel){ 
        this.titel = pTitel; 
    } 

    public String getTitel(){ 
        return this.titel; 
    } 

    public void setVeranstalter(Person pVeranstalter){ 
        this.veranstalter = pVeranstalter; 
    } 

    public Person getVeranstalter(){ 
        return this.veranstalter; 
    } 

    public void setStart(Zeitpunkt pStart){ 
        this.start = pStart; 
    } 

    public Zeitpunkt getStart(){ 
        return this.start; 
    } 

    public void setEnde(Zeitpunkt pEnde){ 
        this.ende = pEnde; 
    } 

    public Zeitpunkt getEnde(){ 
        return this.ende; 
    } 

    public void setOrt(Ort pOrt){ 
        this.ort = pOrt; 
    } 

    public Ort getOrt(){ 
        return this.ort; 
    } 

    public void setTeilnehmerzahl(int pTeilnehmerzahl){ 
        this.teilnehmerzahl = pTeilnehmerzahl; 
    } 

    public int getTeilnehmerzahl(){ 
        return this.teilnehmerzahl; 
    } 

    public void setOrgaKosten(double pOrgaKosten){ 
        this.orgaKosten = pOrgaKosten; 
    } 

    public double getOrgaKosten(){ 
        return this.orgaKosten; 
    } 

    public void setEintritt(double pEintritt){ 
        this.eintritt = pEintritt; 
    } 

    public double getEintritt(){ 
        return this.eintritt; 
    } 

    public void setReferenten(Person[] pReferenten){ 
        this.Referenten = pReferenten; 
    } 

    public Person[] getReferenten(){ 
        return this.Referenten; 
    } 

    public void setNachrung(Essen[] pNachrung){ 
        this.Nachrung = pNachrung; 
    } 

    public Essen[] getNachrung(){ 
        return this.Nachrung; 
    } 

}
