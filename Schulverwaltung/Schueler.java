public class Schueler extends Person{
    private int jgst;
    private Person erziehung1;

    public Schueler(String pVorname, String pNachname, String pGeburtstag, char pGeschlecht, int pJgst, Person pErziehung1){
        super(pVorname, pNachname, pGeburtstag, pGeschlecht);
        this.setJgst(pJgst);
        this.setErziehung1(pErziehung1);
    }

    public void setJgst(int pJgst){
        jgst = pJgst;
    }

    public int getJgst(){
        return jgst;
    }

    public void setErziehung1(Person pErziehung1){
        erziehung1 = pErziehung1;
    }

    public Person getErziehung1(){
        return erziehung1;
    }
}