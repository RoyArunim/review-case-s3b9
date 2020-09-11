import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receiver {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = reader.readLine();
            while(name!=null)
            {
                System.out.println("receiver is processing : "+ name);
                name=reader.readLine();
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
