package fileio;

import java.util.*;
import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException
	{
		FileReader fileReader = new FileReader("D:\\cdac\\myFile.txt");
		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char) i);
		}
	}

}
