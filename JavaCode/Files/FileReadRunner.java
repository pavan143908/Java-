//created on 14/08/2025

package filespackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {

		Path pathFileToRead = Paths.get("./resources/data.txt");

		// Path is an object
		// Paths is a class

		List<String> lines = Files.readAllLines(pathFileToRead);

		System.out.println(lines);
		// to read small files in a list format
		// [125, ;ds;fh;sdhf;k, charan, venu , ajay, bharat, sai, Apple, Bat, Cat, Dog]

		System.out.println("****************");

		Files.lines(pathFileToRead).forEach(System.out::println);

		// Files is a pre defined Class in java
		// 125
		// ;ds;fh;sdhf;k
		// charan
		// venu
		// ajay
		// bharat
		// sai
		// Apple
		// Bat
		// Cat
		// Dog

		System.out.println("****************");

		Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("a"))
				.forEach(System.out::println);
	}
}

//output
//[125, ;ds;fh;sdhf;k, charan, venu , ajay, bharat, sai, Apple, Bat, Cat, Dog]
//****************
//125
//;ds;fh;sdhf;k
//charan
//venu
//ajay
//bharat
//sai
//Apple
//Bat
//Cat
//Dog
//****************
//charan
//ajay
//bharat
//sai
//apple
//bat
//cat
