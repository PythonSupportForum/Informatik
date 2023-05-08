public class Ort
{

    private int nordlicheBreite; 
    private int westlicheLaenge; 

    public Ort(int pNordlicheBreite, int pWestlicheLaenge){ 

        this.setNordlicheBreite(pNordlicheBreite); 
        this.setWestlicheLaenge(pWestlicheLaenge); 
    } 

    public void setNordlicheBreite(int pNordlicheBreite){ 
        this.nordlicheBreite = pNordlicheBreite; 
    } 

    public int getNordlicheBreite(){ 
        return this.nordlicheBreite; 
    } 

    public void setWestlicheLaenge(int pWestlicheLaenge){ 
        this.westlicheLaenge = pWestlicheLaenge; 
    } 

    public int getWestlicheLaenge(){ 
        return this.westlicheLaenge; 
    } 

}
