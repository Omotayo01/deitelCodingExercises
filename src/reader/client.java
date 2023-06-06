package reader;

import java.io.IOException;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.20.10.3", 5000);
            System.out.println("Connected");
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
    
