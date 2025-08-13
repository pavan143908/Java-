//created on 13/08/2025

package filespackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {

		Path currentDirectory = Paths.get(".");

		// Files.list(currentDirectory).forEach(System.out::println);

		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");

		// Files.walk(currentDirectory,
		// 4).filter(predicate).forEach(System.out::println);

		// walk is to print path and check does it contain the value

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");

		Files.find(currentDirectory, 4, matcher).forEach(System.out::println);

		// find method gives much more filters it defines path and directories

		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();

		Files.find(currentDirectory, 4, directoryMatcher).forEach(System.out::println);
	}

}

//output
////
//.\src\filespackage\DirectoryScanRunner.java
//.
//.\.settings
//.\bin
//.\bin\filespackage
//.\resouces
//.\src
//.\src\filespackage
