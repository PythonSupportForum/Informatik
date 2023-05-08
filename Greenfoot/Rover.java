import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JFrame;

public class Rover extends Actor
{
    private Display anzeige;

    public void act(){
        JFrame fenster = new JFrame(); 
        fenster.setSize(600, 400);
        fenster.setVisible(true);
        fenster.setTitle("haloooouuuuu");
        act();
    }
    

    public void s65Nr1_a(){
        //Er sammelt alle Gesteine bis zum Hügel ein, außer das Gestein, das sich direkt vor dem Hügel befindet
    }

    public void s65Nr1_b(){
        //Man braucht eine Schleife, die solange Gesteine aufsammelt, bis auf dem aktuellen Feld keine mehr sind.

        while(this.gesteinVorhanden() == true){
            this.analysiereGestein();
        }
        if(!this.huegelVorhanden("vorne")){
            this.fahre();
            this.s65Nr1_b();
        }
    }

    public void s65Nr1_c(){
        //Das gestein auf dem Ausgangsfeld würde nicht eingesammelt werden, da er erst fährt, bevor er prüft, ob ein Gestein Vorhanden ist. Man müsste also Planen, dass er immer erst auf Gesteine prüft und ann eventuell zum nächsten Feld fährt.
    }

   private void n_mal_nach_x_drehen_und_y_mal_fahren(int n, String x, int y){
        for(int i = 0; i < n; i++){
            this.drehe(x);
            for(int ii = 0; ii < y; ii++) this.fahre();
        }
    }
    
    public void s65Nr2(){
        this.drehe("rechts");
        for(int i = 0; i < 4; i++){
            for(int k = 0; k < 2; k++){
                this.fahre();
                this.drehe((i == 0 || i == 3) ? "links" : "rechts");
                this.fahre();
            }
            if(i%2 == 0){
                this.drehe(i == 0 ? "rechts" : "links");
                while(!this.huegelVorhanden("vorne")) this.fahre();
                this.drehe(i == 0 ? "links" : "rechts");
            }
        }
        this.drehe("links");
    }
    
    public void s41_nr_1(){
        //Gesteine Müssen Eingesammelt werden, Bergen muss ausgewichen werden
    }

    public void s41_nr_1_b(){
        //Fahre, bis gestein oder hugel
        //Wenn hügel biege ab
        //wenn gestein sammle ein
        //markeire, wo du schon warst

    }

    public void s41_nr_2(){
        while(true){
            if(this.gesteinVorhanden()) this.analysiereGestein();
            if(this.huegelVorhanden("vorne")) this.drehe("links");
            else if(!this.huegelVorhanden("rechts")){
                this.drehe("rechts");
                this.fahre();
            }
            else this.fahre();
        }
    }

    public void s46Aufg3(){
        int xStart = this.getX();
        while(this.gesteinVorhanden() != true) this.fahre();
        for(int i = 23; i < 28; i++){
            this.analysiereGestein();
            this.fahre();
        }
        this.setLocation(xStart, this.getY());
    }

    public void spirale(){
        for(int ii = 0; ii < 3; ii++){
            for(int j = 0; j < 10; j++){
                this.setzeMarke();
                this.fahre();
            }
            this.drehe("rechts");
        }
        for(int i = 9; i > 0; i = i - 1){
            for(int ii = 0; ii < 2; ii++){
                for(int j = 0; j < i; j++){
                    this.setzeMarke();
                    this.fahre();
                }
                this.drehe("rechts");
            }
        }
    }

    public void einmalDrumherum(){
        for(int i=0; i<15; i++){
            this.fahre();
            if(this.gesteinVorhanden()){
                this.analysiereGestein();
            }
        }
        this.drehe("rechts");
        for(int i=0; i<11; i++){
            this.fahre();
            if(this.gesteinVorhanden()){
                this.analysiereGestein();
            }
        }
        this.drehe("rechts");
        for(int i=0; i<15; i++){
            this.fahre();
            if(this.gesteinVorhanden()){
                this.analysiereGestein();
            }
        }
        this.drehe("rechts");
        for(int i=0; i<11; i++){
            this.fahre();
            if(this.gesteinVorhanden()){
                this.analysiereGestein();
            }
        }
        this.drehe("rechts");
    }

    public void zaehlBeispiel(){

        for(int i = 0; i < 4; i = i + 1){
            this.fahre();
            this.analysiereGestein();
        }
        for(int i=0; i<2; i++){
            this.drehe("rechts");
        }
        for(int i=0; i<4; i++){
            this.fahre();
        }
        for(int i=0; i<2; i++){
            this.drehe("rechts");
        }
    }

    public void dummikreis(){
        while(true){
            this.fahre();
            this.setRotation(getRotation()+45);
        }
    }

    public void zweiFelderFahren() {
        this.fahre();
        this.fahre();
    }

    public void haAufgabe9a(){
        this.fahre();
        while(this.gesteinVorhanden()){
            this.analysiereGestein();
            this.fahre();
        }
    }

    public void haAufgabe9b(){
        while(this.gesteinVorhanden()){
            this.analysiereGestein();
            setzeMarke();
            this.fahre();
        }
    }

    public void bergketteAbfahren(){
        while(this.huegelVorhanden("vorne")){
            this.drehe("links");
            this.fahre();
            this.drehe("rechts");
            this.fahre();
        }
    }

    public void aufgabeEinsAnalysiereVierVorne(){
        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.analysiereGestein();
        this.drehe("links");
        this.drehe("links");
        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.drehe("rechts");
        this.drehe("rechts");
    }

    public void aufgabeZweiFünfMalFünf(){

        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.drehe("rechts");
        this.fahre();
        this.drehe("rechts");
        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.drehe("links");
        this.fahre();
        this.drehe("links");
        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.drehe("rechts");
        this.fahre();
        this.drehe("rechts");
        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.drehe("links");
        this.fahre();
        this.drehe("links");
        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.drehe("links");
        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.drehe("links");
        this.fahre();
        this.fahre();
        this.fahre();
        this.fahre();
        this.drehe("links");
        this.drehe("links");
    }

    public void aufgabeZweiEndloseRekursion(){
        this.aufgabeZweiFünfMalFünf();
        this.aufgabeZweiEndloseRekursion();
    }

    public void anBergketteEntlang(){
        while(this.huegelVorhanden("rechts")){
            this.fahre();
        }
    }

    public void abAufg9a(){
        fahre();

    }

    /**
     * Der Rover bewegt sich ein Feld in Fahrtrichtung weiter.
     * Sollte sich in Fahrtrichtung ein Objekt der Klasse Huegel befinden oder er sich an der Grenze der Welt befinden,
     * dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void fahre()
    {
        int posX = getX();
        int posY = getY();

        if(huegelVorhanden("vorne"))
        {
            nachricht("Zu steil!");
        }
        else if(getRotation()==270 && getY()==0)
        {
            nachricht("Ich kann mich nicht bewegen");
        }
        else
        {
            move(1);
            Greenfoot.delay(1);
        }

        if(posX==getX()&&posY==getY()&&!huegelVorhanden("vorne"))
        {
            nachricht("Ich kann mich nicht bewegen");
        }
    }

    /**
     * Der Rover dreht sich um 90 Grad in die Richtung, die mit richtung („links“ oder „rechts“) übergeben wurde.
     * Sollte ein anderer Text (String) als "rechts" oder "links" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void drehe(String richtung)
    {
        if(richtung=="rechts")
        {
            setRotation(getRotation()+90);
        }
        else if (richtung=="links")
        {
            setRotation(getRotation()-90);
        }
        else
        {
            nachricht("Befehl nicht korrekt!");
        }
    }

    /**
     * Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Klasse Gestein befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean gesteinVorhanden()
    {
        if(getOneIntersectingObject(Gestein.class)!=null)
        {
            nachricht("Gestein gefunden!");
            return true;

        }

        return false;
    }

    /**
     * Der Rover überprüft, ob sich in richtung ("rechts", "links", oder "vorne") ein Objekt der Klasse Huegel befindet.
     * Das Ergebnis wird auf dem Display angezeigt.
     * Sollte ein anderer Text (String) als "rechts", "links" oder "vorne" übergeben werden, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public boolean huegelVorhanden(String richtung)
    {
        int rot = getRotation();

        if (richtung=="vorne" && rot==0 || richtung=="rechts" && rot==270 || richtung=="links" && rot==90)
        {
            if(getOneObjectAtOffset(1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(1,0,Huegel.class)).getSteigung() >30)
            {
                return true;
            }
        }

        if (richtung=="vorne" && rot==180 || richtung=="rechts" && rot==90 || richtung=="links" && rot==270)
        {
            if(getOneObjectAtOffset(-1,0,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(-1,0,Huegel.class)).getSteigung() >30)
            {
                return true;
            }
        }

        if (richtung=="vorne" && rot==90 || richtung=="rechts" && rot==0 || richtung=="links" && rot==180)
        {
            if(getOneObjectAtOffset(0,1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,1,Huegel.class)).getSteigung() >30)
            {
                return true;
            }

        }

        if (richtung=="vorne" && rot==270 || richtung=="rechts" && rot==180 || richtung=="links" && rot==0)
        {
            if(getOneObjectAtOffset(0,-1,Huegel.class)!=null && ((Huegel)getOneObjectAtOffset(0,-1,Huegel.class)).getSteigung() >30)
            {
                return true;
            }

        }

        if(richtung!="vorne" && richtung!="links" && richtung!="rechts")
        {
            nachricht("Befehl nicht korrekt!");
        }

        return false;
    }

    /**
     * Der Rover ermittelt den Wassergehalt des Gesteins auf seiner Position und gibt diesen auf dem Display aus.
     * Sollte kein Objekt der Klasse Gestein vorhanden sein, dann erscheint eine entsprechende Meldung auf dem Display.
     */
    public void analysiereGestein()
    {
        if(gesteinVorhanden())
        {
            nachricht("Gestein untersucht! Wassergehalt ist " + ((Gestein)getOneIntersectingObject(Gestein.class)).getWassergehalt()+"%.");
            Greenfoot.delay(1);
            removeTouching(Gestein.class);
        }
        else 
        {
            nachricht("Hier ist kein Gestein");
        }
    }

    /**
     * Der Rover erzeugt ein Objekt der Klasse „Markierung“ auf seiner Position.
     */
    public void setzeMarke()
    {
        getWorld().addObject(new Marke(), getX(), getY());
    }

    /**
     * *Der Rover gibt durch einen Wahrheitswert (true oder false )zurück, ob sich auf seiner Position ein Objekt der Marke befindet.
     * Eine entsprechende Meldung erscheint auch auf dem Display.
     */
    public boolean markeVorhanden()
    {
        if(getOneIntersectingObject(Marke.class)!=null)
        {
            return true;
        }

        return false;
    }

    public void entferneMarke()
    {
        if(markeVorhanden())
        {
            removeTouching(Marke.class);
        }
    }

    private void nachricht(String pText)
    {
        if(anzeige!=null)
        {
            anzeige.anzeigen(pText);
            Greenfoot.delay(1);
            anzeige.loeschen();
        }
    }

    private void displayAusschalten()
    {
        getWorld().removeObject(anzeige);

    }

    protected void addedToWorld(World world)
    {

        setImage("images/rover.png");
        world = getWorld();
        anzeige = new Display();
        anzeige.setImage("images/nachricht.png");
        world.addObject(anzeige, 7, 0);
        if(getY()==0)
        {
            setLocation(getX(),1);
        }
        anzeige.anzeigen("Ich bin bereit");

    }

    class Display extends Actor
    {
        GreenfootImage bild; 

        public Display()
        {
            bild = getImage();
        }

        public void act() 
        {

        }  

        public void anzeigen(String pText)
        {
            loeschen();
            getImage().drawImage(new GreenfootImage(pText, 25, Color.BLACK, new Color(0, 0, 0, 0)),10,10);

        }

        public void loeschen()
        {
            getImage().clear();
            setImage("images/nachricht.png");
        }

    }
}

