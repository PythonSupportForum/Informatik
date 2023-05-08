public class encryptedAdvanced
{
    private String message;
    private String passwort;
    private String verschluesselteMessage;
    
    public encryptedAdvanced(String pMessage, String pPasswort){
        this.setMessage(pMessage);
        this.setPasswort(pPasswort);
    }
    
    public encryptedAdvanced(String pPasswort){
        this.setPasswort(pPasswort);
    }
    
    public void setMessage(String pMessage) {
        this.message = pMessage;
    }
    public String getMessage() {
        return this.message;
    }
    public void setPasswort(String pPasswort) {
        this.passwort = pPasswort;
    }
    public String getPasswort() {
        return this.passwort;
    }
    public void setVerschluesselteMessage(String pVerschluesselteMessage) {
        this.verschluesselteMessage = pVerschluesselteMessage;
    }
    public String getVerschluesselteMessage() {
        return this.verschluesselteMessage;
    }
    
    public String encrypted_Text(){
        //Variablen Deklarieren
        String encrypted_text = "";
        String summant = this.getPasswort();
        
        //Den Password zummand so lange Verlängern, bis er mindestens genauso lang ist wie der Text!
        while(summant.length() < this.getMessage().length()){
            summant = summant + this.getPasswort();
        }
        
        //Verschlüsseln
        for (int i = 0; i < this.getMessage().length(); i++) {
            int intChar = (this.getMessage().charAt(i) + summant.charAt(i))%128;
            char stringChar = (char)intChar;
            encrypted_text = encrypted_text+stringChar;
        }
        this.setVerschluesselteMessage(encrypted_text);
        return encrypted_text;
    }
    
    public String decrypted_Text(){
        //Variablen Deklarieren
        String decrypted_text = "";
        String subtrahent = this.getPasswort();
        
        //Den Password zummand so lange Verlängern, bis er mindestens genauso lang ist wie der Text!
        while(subtrahent.length() < this.getVerschluesselteMessage().length()){
            subtrahent = subtrahent + this.getPasswort();
        }
        
        //Verschlüsseln
        for (int i = 0; i < this.getVerschluesselteMessage().length(); i++) {
            int intChar = (this.getVerschluesselteMessage().charAt(i) - subtrahent.charAt(i));
            while(intChar < 0) {
                intChar += 128;
            }
            char stringChar = (char)intChar;
            decrypted_text = decrypted_text+stringChar;
        }
        
        return decrypted_text;
    }
    public String decrypted_Text(String eMessage){
        //Variablen Deklarieren
        String decrypted_text = "";
        String subtrahent = this.getPasswort();
        
        //Den Password zummand so lange Verlängern, bis er mindestens genauso lang ist wie der Text!
        while(subtrahent.length() < eMessage.length()){
            subtrahent = subtrahent + this.getPasswort();
        }
        
        //Verschlüsseln
        for (int i = 0; i < eMessage.length(); i++) {
            int intChar = (eMessage.charAt(i) - subtrahent.charAt(i));
            while(intChar < 0) {
                intChar += 128;
            }
            char stringChar = (char)intChar;
            decrypted_text = decrypted_text+stringChar;
        }
        
        return decrypted_text;
    }
}