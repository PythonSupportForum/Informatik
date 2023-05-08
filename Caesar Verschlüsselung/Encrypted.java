public class Encrypted {
    public String eMessage;
    public int password;
    public String vMessage;
    String entschluesselteMessage = "";
    public Encrypted(String message) {

    }
    public void setMessage(String pMessage) {
        this.eMessage = pMessage;
    }
    public String getMessage() {
        return this.eMessage;
    }
    public void setEntschluesselteMessage(String pMessage) {
        this.entschluesselteMessage = pMessage;
    }
    public String getEntschluesselteMessage() {
        return this.entschluesselteMessage;
    }
    public void setVMessage(String pMessage) {
        this.vMessage = pMessage;
    }
    public String getVMessage() {
        return this.vMessage;
    }
    public void setPassword(int pPassword) {
        this.password = pPassword;
    }
    public int getPassword() {
        return this.password;
    }
    public String verschluesseln() {
        for (int i = 0; i < this.getMessage().length(); i++) {
            int intChar = this.getMessage().charAt(i) + this.getPassword();
            char stringChar = (char)intChar;
            this.setVMessage(this.getVMessage() + stringChar);
        }
        return this.getVMessage();
    }
    public String entschluesseln() {
        for (int i = 0; i < this.getVMessage().length(); i++) {
            int intChar = this.getVMessage().charAt(i) - this.getPassword();
            char stringChar = (char)intChar;
            this.setEntschluesselteMessage(this.getEntschluesselteMessage() + stringChar);
        }
        return this.getEntschluesselteMessage();
    }
}