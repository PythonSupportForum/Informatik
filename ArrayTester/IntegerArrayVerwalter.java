
public class IntegerArrayVerwalter
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int[] werte;

    public IntegerArrayVerwalter()
    {
        this.setWerte(new int[8]);
    }
    
    public IntegerArrayVerwalter(int pGroesse)
    {
        this.setWerte(new int[pGroesse]);
    }

    public int[] getWerte(){
        return this.werte;
    }
    public void setWerte(int[] pWerte){
        this.werte = pWerte;
    }
    
    public int get(int pPosition){
        return this.getWerte()[pPosition];
    }
    
    public void set(int pPosition, int pWert){
        int[] w = this.getWerte();
        w[pPosition] = pWert;
        this.setWerte(w);
    }
    
}
