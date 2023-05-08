public class Essen
{
    private String bezeichnung; 
    private int menge; 
    private int leckerSkalaInProzent; 

    public Essen(String pBezeichnung, int pMenge, int pLeckerSkalaInProzent){ 

        this.setBezeichnung(pBezeichnung); 
        this.setMenge(pMenge); 
        this.setLeckerSkalaInProzent(pLeckerSkalaInProzent); 
    } 

    public void setBezeichnung(String pBezeichnung){ 
        this.bezeichnung = pBezeichnung; 
    } 

    public String getBezeichnung(){ 
        return this.bezeichnung; 
    } 

    public void setMenge(int pMenge){ 
        this.menge = pMenge; 
    } 

    public int getMenge(){ 
        return this.menge; 
    } 

    public void setLeckerSkalaInProzent(int pLeckerSkalaInProzent){ 
        this.leckerSkalaInProzent = pLeckerSkalaInProzent; 
    } 

    public int getLeckerSkalaInProzent(){ 
        return this.leckerSkalaInProzent; 
    } 
}
