import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class TryWithCloseable {

	public static void main(String[] args) {
		
		//These resources will be automatically closed after the try block
		try(FileOutputStream fos = new FileOutputStream("movies.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {

			dos.writeUTF("Java 7 Block Buster");
		} catch(IOException e) {

		}
	}

}
