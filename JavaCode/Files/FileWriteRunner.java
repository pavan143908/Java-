//created on 14/08/2025

package filespackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {

		Path pathFileToWrite = Paths.get("./resources/file_write.txt");

		// Path is an object, Paths is a class

		List<String> list = List.of("Andhra Pradesh", "Bangladesh", "canada", "Thailand", "Banglore");

		Files.write(pathFileToWrite, list);
	}
}