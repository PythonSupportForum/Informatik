import java.util.Scanner;

public class SchiffeVersenken {
    
    private char[][] spielfeld;
    private int groesse;
    private int anzahlSchiffe;
    private int schiffeVersenkt;
    
    public SchiffeVersenken() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen zu Schiffe Versenken!");
        System.out.print("Geben Sie die Größe des Spielfelds ein: ");
        int groesse = scanner.nextInt();
        System.out.print("Geben Sie die Anzahl der Schiffe ein: ");
        int anzahlSchiffe = scanner.nextInt();
        SchiffeVersenken spiel = new SchiffeVersenken(groesse, anzahlSchiffe);
        spiel.zeigeSpielfeld();
        while (spiel.schiffeVersenkt < anzahlSchiffe) {
            System.out.print("Geben Sie die x-Koordinate des Schusses ein: ");
            int x = scanner.nextInt();
            System.out.print("Geben Sie die y-Koordinate des Schusses ein: ");
            int y = scanner.nextInt();
            spiel.schuss(x, y);
            spiel.zeigeSpielfeld();
        }
        scanner.close();
    }
    
    public SchiffeVersenken(int groesse, int anzahlSchiffe) {
        this.groesse = groesse;
        this.anzahlSchiffe = anzahlSchiffe;
        this.spielfeld = new char[groesse][groesse];
        this.schiffeVersenkt = 0;
        for (int i = 0; i < this.groesse; i++) {
            for (int j = 0; j < this.groesse; j++) {
                this.spielfeld[i][j] = '.';
            }
        }
        this.platziereSchiffeZufaellig();
    }
    
    private void platziereSchiffeZufaellig() {
        for (int i = 0; i < this.anzahlSchiffe; i++) {
            int x = (int) (Math.random() * this.groesse);
            int y = (int) (Math.random() * this.groesse);
            if (this.spielfeld[x][y] == '.') {
                this.spielfeld[x][y] = 'S';
            } else {
                i--;
            }
        }
    }
    
    public void zeigeSpielfeld() {
        System.out.print("  ");
        for (int i = 0; i < this.groesse; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < groesse; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < this.groesse; j++) {
                System.out.print(this.spielfeld[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public boolean schuss(int x, int y) {
        if (spielfeld[x][y] == 'S') {
            spielfeld[x][y] = 'X';
            schiffeVersenkt++;
            System.out.println("Treffer!");
            if (schiffeVersenkt == anzahlSchiffe) {
                System.out.println("Du hast Gewonnen!!!!");
            }
            return true;
        } else {
            spielfeld[x][y] = 'O';
            System.out.println("Der Schuss ging ins Wasser");
            return false;
        }
    }

}
