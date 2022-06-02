package day18;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class Writing_3 {

	public static void main(String[] args) {
		Path path = Path.of("src/tester.txt");
		try(BufferedWriter writer = Files.newBufferedWriter(path)) {
			writer.write("HTML,Javascript,Css");
			writer.write("\nC++");
			writer.write("\nDatabase");
			writer.newLine();
			writer.write("Python");
			writer.flush();
			writer.write("\nJava");
			System.out.println("Saved");
			// open (get connection)
			// write
			// close()(disconnect)
			// write
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
