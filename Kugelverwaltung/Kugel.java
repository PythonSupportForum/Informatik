public class Kugel
{
    private double radius;
    private String farbe;
    
    public Kugel(double pRadius, String pFarbe){
        this.setRadius(pRadius);
        this.setFarbe(pFarbe);
    }
    
    public void setRadius(double pRadius){
        this.radius = pRadius;
    }
    
    public void setFarbe(String pFarbe){
        this.farbe = pFarbe;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public String getFarbe(){
        return this.farbe;
    }
}
