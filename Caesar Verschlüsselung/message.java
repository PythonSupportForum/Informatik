import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.net.URLEncoder;

public class message
{
    private String text;
    private String password = "geheim";
    private String author = "BlueJ";
    public message(String text, String password, String author)
    {
        this.setText(text);
        this.setPassword(password);
        this.setAuthor(author);
        this.send();
    }
    public String getText(){
        return this.text;
    }
    public void setText(String pText){
        this.text = pText;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pPassword){
        if(pPassword.length() > 0 && pPassword.length() < 64){
            this.password = pPassword;
        }
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String pAuthor){
        if(pAuthor.length() > 3 && pAuthor.length() < 32){
            this.author = pAuthor;
        }
    }
    public boolean send()
    {
        try {
            String encrypted = new encryptedAdvanced("BlueJ: ", this.getPassword()).encrypted_Text()+"|_|"+new encryptedAdvanced(this.getText(), this.getPassword()).encrypted_Text();
            String res_data = this.get_data_from_lars_server("text="+URLEncoder.encode(encrypted, "UTF-8")).trim();
            return (res_data == "{\"success\": true}");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    private String get_data_from_lars_server(String data){
        try {
            String url = data.length() == 0 ? "http://nxlc.de/chat.php" : "http://nxlc.de/chat.php?"+data;
            HttpClient hc = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).connectTimeout(Duration.ofSeconds(10)).build();
            HttpRequest req = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
            HttpResponse<String> res = hc.send(req, HttpResponse.BodyHandlers.ofString());
            return res.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "";
        }
    }
}
