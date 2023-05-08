public class Schulleiter extends Lehrer{
    private String schule;
    public Schulleiter(String pVorname, String pNachname, String pGeburtstag, char pGeschlecht, String pFach1, String pFach2, String pSchule){
        super(pVorname, pNachname, pGeburtstag, pGeschlecht, pFach1, pFach2);
        this.setSchule(pSchule);
    }

    public void setSchule(String pSchule){
        schule = pSchule;
    }

    public String getSchule(){
        return schule;
    }
}