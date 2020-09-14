package Sender;
import java.util.List;
public class ConsoleWriter {
	public static void writeReviewsOnConsole(List<String> reviewRecords) {
		for(String record: reviewRecords) {
			System.out.println(record);
		}
	}

}
