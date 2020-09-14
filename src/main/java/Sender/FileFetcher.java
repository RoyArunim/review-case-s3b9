package Sender;
import java.util.ResourceBundle;

public class FileFetcher {
	public static ResourceBundle rb=ResourceBundle.getBundle("filepath");
	public static String readCsvfileNameFromProperties() {
		String path=rb.getString("filename");
		return path;
	}

}
