import java.util.Scanner;

public class chatController
{
    private String password;
    private resiever resiever;
    private Scanner console_input_stream = new Scanner(System.in);
    private String author = "BlueJ";
    
    public chatController()
    {
        this.resiever = new resiever("geheim");
        this.setPassword("geheim");
        this.setAuthor(new computer().getHostname());
        this.loop();
    }
    public chatController(String pPassword, String pAuthor)
    {
        this.resiever = new resiever(pPassword);
        this.setPassword(pPassword);
        this.setAuthor(pAuthor);
        this.loop();
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pPassword){
        this.password = pPassword;
        this.resiever.setPassword(pPassword);
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String pAuthor){
        if(pAuthor.trim().length() > 0){
            this.author = pAuthor;
        }
    }
    public void listen_for_user_input(){
        String str = this.console_input_stream.nextLine();
        new message(str, this.getPassword(), this.author);
    }
    public void loop(){
        this.listen_for_user_input();
        this.loop();
    }
}
