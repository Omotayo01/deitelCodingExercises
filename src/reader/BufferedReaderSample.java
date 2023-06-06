package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(reader);
             )
        {
            String input = bufferedReader.readLine();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
