
public class Kugelverwalter
{
    private Kugel[] kugeln;

    public Kugelverwalter(int pGroeße)
    {
        this.setKugeln(new Kugel[pGroeße]);
    }
    
    public Kugelverwalter(Kugel[] pKugeln)
    {
        this.setKugeln(pKugeln);
    }

    public Kugel[] getKugeln(){
        return this.kugeln;
    }
    public void setKugeln(Kugel[] pKugeln){
        this.kugeln = pKugeln;
    }
    
    public Kugel getKugel(int pPosition){
        return this.getKugeln()[pPosition];
    }
    
    public void setKugel(int pPosition, Kugel pKugel){
        this.getKugeln()[pPosition] = pKugel;
    }

    public void kugelUebersicht(){
        for(int i = 0; i < this.getKugeln().length; i++){
            System.out.println("An der Position "+i+" befindet sich eine Kugel mit dem Radius "+this.getKugeln()[i].getRadius()+" und der Farbe "+this.getKugeln()[i].getFarbe()+".");
        }
    }
    
    public boolean existiert(Kugel pKugel){
        for(int i = 0; i < this.getKugeln().length; i++){
            if(this.getKugeln()[i] == pKugel) return true;
        }
        return false;
    }
    
    public int finde(Kugel pKugel){
        for(int i = 0; i < this.getKugeln().length; i++){
            if(this.getKugeln()[i] == pKugel) return i;
        }
        return -1;
    }
}
