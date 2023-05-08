import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.net.URLEncoder;
import java.util.concurrent.*;

public class resiever
{
    private String password = "geheim";
    private int lastMessageId = -1;
    public resiever(String password)
    {
        this.setPassword(password);
        ExecutorService tp = Executors.newCachedThreadPool();
        Future futureTask = tp.submit(() -> this.listen());
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pPassword){
        if(pPassword.length() > 0 && pPassword.length() < 64){
            this.password = pPassword;
        }
    }
    public boolean listen()
    {
        try {
            String res_data = this.get_data_from_lars_server("start="+URLEncoder.encode(""+this.lastMessageId, "UTF-8")).trim();
            this.lastMessageId = Integer.parseInt(res_data.substring(0, res_data.indexOf(",")));
            String Mdata = res_data.substring(res_data.indexOf(",")+1).trim();
            String[] newMessages = Mdata.split(",");
            for(int i = 0; i < newMessages.length; i++){
                String messageText = "";
                String messageFull = newMessages[i];
                if(messageFull.trim().length() == 0) {
                    continue;
                }
                String splitter = "\\|\\_\\|";
                String[] messageParts = messageFull.split(splitter);
                for(int z = 0; z < messageParts.length; z++){
                    messageText = messageText + new encryptedAdvanced(this.getPassword()).decrypted_Text(messageParts[z]);
                }
                if(messageText.trim().length() > 0) {
                    System.out.println(messageText.trim());
                }
                if(messageText.trim().contains("ping")){
                    new message("HEY ^^! Ich bin "+new computer().getHostname()+"!", this.getPassword(), "Benutzer");
                }
            }
            TimeUnit time = TimeUnit.MILLISECONDS;
            time.sleep(200L);
            return this.listen();
        } catch (IOException | InterruptedException e) {
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
