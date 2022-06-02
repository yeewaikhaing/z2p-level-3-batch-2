package day17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File_Delete {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("src/readme.txt");
		
		//Files.delete(path);
		if(Files.deleteIfExists(path))
		
			System.out.println("File is deleted");
	}
}
