import java.io.BufferedReader;
import java.io.FileReader;

public class Sender {
    public static void main(String[] args) throws Exception {
        //D:\\jaltantra_web\\WorkSpace\\fileHandlingDemo\\src\\friends.csv
        String row;
        BufferedReader csvReader = new BufferedReader(new FileReader(args[0]));
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            for(String s:data) {
                System.out.println(s);
            }
        }
        csvReader.close();
    }
}
