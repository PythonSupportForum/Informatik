public class encryptedAdvanced
{
    private String text;
    private String passwort;
    private String eMessage;
    
    public encryptedAdvanced(String pText, String pPasswort){
        this.setText(pText);
        this.setPasswort(pPasswort);
    }
    public encryptedAdvanced(String pPasswort){
        this.setPasswort(pPasswort);
    }
    
    public void setText(String p){
        this.text = p;
    };
    public void setPasswort(String p){
        this.passwort = p;
    };
    public String getText(){
        return this.text;
    };
    public String getPasswort(){
        return this.passwort;
    };
    
    public String encrypted_Text(){
        //Variablen Deklarieren
        String encrypted_text = "";
        String summant = this.getPasswort();
        
        //Den Password zummand so lange Verlängern, bis er mindestens genauso lang ist wie der Text!
        while(summant.length() < this.getText().length()){
            summant = summant + this.getPasswort();
        }
        
        //Verschlüsseln
        for (int i = 0; i < this.getText().length(); i++) {
            int intChar = (this.getText().charAt(i) + summant.charAt(i))%128;
            char stringChar = (char)intChar;
            encrypted_text = encrypted_text+stringChar;
        }
        this.eMessage = encrypted_text;
        return encrypted_text;
    }
    
    public String decrypted_Text(){
        //Variablen Deklarieren
        String decrypted_text = "";
        String subtrahent = this.getPasswort();
        
        //Den Password zummand so lange Verlängern, bis er mindestens genauso lang ist wie der Text!
        while(subtrahent.length() < this.eMessage.length()){
            subtrahent = subtrahent + this.getPasswort();
        }
        
        //Verschlüsseln
        for (int i = 0; i < this.eMessage.length(); i++) {
            int intChar = (this.eMessage.charAt(i) - subtrahent.charAt(i));
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