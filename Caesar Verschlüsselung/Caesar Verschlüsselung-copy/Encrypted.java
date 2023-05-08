public class Encrypted {
    private String message;
    private int verschiebung;
    private String verschluesselteMessage;
    
    public Encrypted(String pMessage, int pVerschiebung) {
        this.setMessage(pMessage);
        this.setVerschiebung(pVerschiebung);
        this.verschluesseln();
    }
    
    public void setMessage(String pMessage) {
        this.message = pMessage;
    }
    public String getMessage() {
        return this.message;
    }
    public void setVerschiebung(int pVerschiebung) {
        this.verschiebung = pVerschiebung;
    }
    public int getVerschiebung() {
        return this.verschiebung;
    }
    public void setVerschluesselteMessage(String pVerschluesselteMessage) {
        this.verschluesselteMessage = pVerschluesselteMessage;
    }
    public String getVerschluesselteMessage() {
        return this.verschluesselteMessage;
    }
    public String verschluesseln() {
        String newVerschluesselteMessage = "";
        for (int i = 0; i < this.getMessage().length(); i++) {
            int intChar = (this.getMessage().charAt(i) + this.getVerschiebung())%128;
            char stringChar = (char)intChar;
            newVerschluesselteMessage = newVerschluesselteMessage + stringChar;
        }
        this.setVerschluesselteMessage(newVerschluesselteMessage);
        return newVerschluesselteMessage;
    }
    public String entschluesseln() {
        String newMessage = "";
        for (int i = 0; i < this.getVerschluesselteMessage().length(); i++) {
            int intChar = this.getVerschluesselteMessage().charAt(i) - this.getVerschiebung();
            if(intChar < 0){
                intChar += 128;
            }
            char stringChar = (char)intChar;
            newMessage = newMessage + stringChar;
        }
        return newMessage;
    }
}