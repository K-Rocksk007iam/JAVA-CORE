package fileio;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("D:\\cdac\\myFile.txt");
		FileOutputStream fo = new FileOutputStream("D:\\cdac\\NewMyFile.txt");

		int i;
		while ((i = fileReader.read()) != -1) {
			fo.write(i);
		
		}

	}

}
