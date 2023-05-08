public class Uhrzeit
{
    private int stunde;
    private int minute;
    private int sekunden;
    private boolean anteMeridem;
    private boolean StundenFormat12;

    public Uhrzeit(int pStunde, int pMinute, int pSekunden, boolean panteMeridem)
    {
         this.set12StundenFormat(true);
         this.setStunde(pStunde);
         this.setMinute(pMinute);
         this.setSekunde(pSekunden);
         this.setanteMeridem(panteMeridem);
    }
    
    public Uhrzeit(int pStunde, int pMinute, int pSekunden)
    {
         this.set12StundenFormat(false);
         this.setStunde(pStunde);
         this.setMinute(pMinute);
         this.setSekunde(pSekunden);
    }
    
    public int getStunde(){
        return this.stunde;
    }
    
    public int getMinute(){
        return this.minute;
    }
    
    public int getSekunde(){
        return this.sekunden;
    }
    
    public void setStunde(int pWert){
        if(pWert > (this.is12StundenFormat() ? 11 : 23)) {
            System.err.println("Ungültige Eingabe");
            return;
        }
        this.stunde = pWert%(this.is12StundenFormat() ? 12 : 24);
    }
    
    public void setMinute(int pWert){
        if(pWert > 59) {
            System.err.println("Ungültige Eingabe");
            return;
        }
        this.minute = pWert%60;
        this.stunde += (pWert/60)%(this.is12StundenFormat() ? 12 : 24);
    }
    
    public void setSekunde(int pWert){
        if(pWert > 59) {
            System.err.println("Ungültige Eingabe");
            return;
        }
        this.sekunden = pWert%60;
        this.minute = (pWert/60)%60;
        this.stunde += (pWert/60/60)%(this.is12StundenFormat() ? 12 : 24);
    }
    
    public boolean is12StundenFormat(){
        return this.StundenFormat12;
    }
    
    public void set12StundenFormat(boolean pWert){
        this.StundenFormat12 = pWert;
    }
    
    public boolean getanteMeridem(){
        if(!this.is12StundenFormat()) return false;
        return this.anteMeridem;
    }
    
    public void setanteMeridem(boolean pWert){
        this.anteMeridem = pWert;
    }
    
    public void bildschirmausausgabe(){
        if(this.is12StundenFormat() == false){
            System.out.println(String.format("%02d", this.getStunde())+":"+String.format("%02d", this.getMinute())+":"+String.format("%02d", this.getSekunde()));
        } else {
            System.out.println(String.format("%02d", this.getStunde())+":"+String.format("%02d", this.getMinute())+":"+String.format("%02d", this.getSekunde())+" "+(this.getanteMeridem()?"a.A.":"p.A"));
        }
    }
    
    public void sekundeErhoehen(){
        this.minutenWertErhoehen(1);
    }
    
    public void sekundenWertErhoehen(int pWert){
        this.stunde = (this.stunde+((this.minute+pWert)/60/60))%24;
        this.minute = (this.stunde+((this.minute+pWert)/60))%60;
        this.sekunden = (this.minute+pWert)%60;
    }
    
    public void minuteErhoehen(){
        this.minutenWertErhoehen(1);
    }
    
    public void minutenWertErhoehen(int pWert){
        this.stunde = (this.stunde+((this.minute+pWert)/60))%24;
        this.minute = (this.minute+pWert)%60;
    }
    
    public void stundeErhoehen(){
        this.minutenWertErhoehen(60);
    }
    
    public void stundenWertErhoehen(int pWert){
        this.minutenWertErhoehen(pWert*60);
    }
}