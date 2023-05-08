public class Person {
    private String vorname; 
    private String nachname; 
    private int alter; 
    private String beruf; 

    public Person(String pVorname, String pNachname, int pAlter, String pBeruf){
        this.setVorname(pVorname); 
        this.setNachname(pNachname); 
        this.setAlter(pAlter); 
        this.setBeruf(pBeruf); 
    }

    public void setVorname(String pVorname){
        this.vorname = pVorname; 
    }
    public String getVorname(){ 
        return this.vorname;
    }

    public void setNachname(String pNachname){
        this.nachname = pNachname; 
    }
    public String getNachname(){ 
        return this.nachname;
    }

    public void setAlter(int pAlter){
        this.alter = pAlter; 
    }
    public int getAlter(){ 
        return this.alter;
    }

    public void setBeruf(String pBeruf){
        this.beruf = pBeruf; 
    }
    public String getBeruf(){ 
        return this.beruf;
    }
}