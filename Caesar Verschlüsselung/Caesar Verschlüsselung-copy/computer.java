import java.io.*;

public class computer
{
    public computer(){}

    public void shutdown(){
        Runtime runtime = Runtime.getRuntime();
        try
        {
             System.out.println("Shutting down the PC after 5 seconds.");
             runtime.exec("shutdown -s -t 5");
        }
        catch(IOException e){
            System.out.println("Exception: " +e);
        }
    }
    public String getHostname(){
        try
        {
            Process process = Runtime.getRuntime().exec("hostname");
            BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader errorStreamReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            if (errorStreamReader.readLine() != null) {
                throw new RuntimeException(String.format("Failed to get the hostname, exception message: %s", errorStreamReader.readLine()));
            }
            return inputStreamReader.readLine();
        }
        catch(IOException e){
            System.out.println("Exception: " +e);
            return "";
        }
    }
}
