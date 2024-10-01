import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TCPClient {
  public static void main(String[] args) throws Exception {

    System.out.println("Enter the server IP or localhost:");
    Scanner scanner = new Scanner(System.in);
    String host = scanner.nextLine();
    System.out.println("Enter the port number where the server is running:");
    try {
    int portNo = scanner.nextInt();
    scanner.nextLine();
    Socket client = new Socket(host, portNo);
      System.out.println("Starting client");
      System.out.println("Server Connection established on localhost " + portNo);
      System.out.println("Enter Text:");
      String text = scanner.nextLine();
      if(text.length()>80){
        throw new Exception("Length is greater than 80 characters");
      }
      scanner.close();
      DataOutputStream os = new DataOutputStream(client.getOutputStream());
      os.writeBytes(text + "\n");
      BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
      String response = is.readLine();
      System.out.println("Response from server : " + response);
      System.out.println("Client Exit");
      client.close();
    } catch (SocketException e){
      System.out.println("Error occurred, connection refused");
    } catch(InputMismatchException e){
      System.out.println("Incorrect input");
    }

  }
}