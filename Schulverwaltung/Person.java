public class Person{
    private String vorname;
    private String nachname;
    private String geburtstag;
    private char geschlecht;

    public Person(String pVorname, String pNachname, String pGeburtstag, char pGeschlecht){
        this.setVorname(pVorname);
        this.setNachname(pNachname);
        this.setGeburtstag(pGeburtstag);
        this.setGeschlecht(pGeschlecht);
    }

    public void setVorname(String pName){
        vorname = pName;
    }

    public String getVorname(){
        return vorname;
    }

    public void setNachname(String pName){
        nachname = pName;
    }

    public String getNachname(){
        return nachname;
    }

    public void setGeburtstag(String pGeburtstag){
        geburtstag = pGeburtstag;
    }

    public String getGeburtstag(){
        return geburtstag;
    }

    public void setGeschlecht(char pWert){
        geschlecht = pWert;
    }

    public char getGeschlecht(){
        return geschlecht;
    }
}