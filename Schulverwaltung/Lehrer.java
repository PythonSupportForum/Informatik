public class Lehrer extends Person{
    private String fach1;
    private String fach2;
    public Lehrer(String pVorname, String pNachname, String pGeburtstag, char pGeschlecht, String pFach1, String pFach2){
        super(pVorname, pNachname, pGeburtstag, pGeschlecht);
        this.setFach1(pFach1);
        this.setFach1(pFach2);
    }

    public void setFach1(String pFach1){
        fach1 = pFach1;
    }

    public String getFach1(){
        return fach1;
    }

    public void setFach2(String pFach2){
        fach2 = pFach2;
    }

    public String getFach2(){
        return fach2;
    }
}