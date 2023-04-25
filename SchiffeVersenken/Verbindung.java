import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Verbindung
{
    private String id;
    private String url = "https://sinkships.com/ajax/bluej.php";

    public Verbindung()
    {
        this.id = this.generateRandomId();
    }
    
    public void send(String text) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("id", this.id);
        params.put("action", "send");
        params.put("text", String.valueOf(text));
        String response = sendRequest(params);
    }
    
    public void reseive(String text) throws IOException {
        Map<String, String> params = new HashMap<>();
        params.put("id", this.id);
        params.put("action", "reseive");
        String response = sendRequest(params);
    }

    private String sendRequest(Map<String, String> params) throws IOException {
        params.put("version", this.id);
        URL url = new URL(this.url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        OutputStream os = conn.getOutputStream();
        byte[] postDataBytes = getParamsString(params).getBytes();
        os.write(postDataBytes);
        os.flush();
        os.close();
        InputStream is = conn.getInputStream();
        Scanner scanner = new Scanner(is);
        String response = scanner.useDelimiter("\\A").next();
        scanner.close();
        is.close();
        return response;
    }

    private String getParamsString(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (result.length() > 0) {
                result.append("&");
            }
            result.append(entry.getKey());
            result.append("=");
            result.append(entry.getValue());
        }
        return result.toString();
    }

    private String generateRandomId() {
        return String.valueOf((int) (Math.random() * 1000000));
    }
}
