import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileSystemAPI {

	public static void main(String[] args) {
		printTmpInfo();
		
		try {
			Files.deleteIfExists(Paths.get("movies.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void printTmpInfo() {
		Path tmp = Paths.get("/tmp");
		System.out.println("Number of Nodes:"+ tmp.getNameCount());
		System.out.println("File Name:"+ tmp.getFileName());
		System.out.println("File Root:"+ tmp.getRoot());
		System.out.println("File Parent:"+ tmp.getParent());
	}

}
