package fileio;
import java.io.*;


public class BufferedInputStramDemo {

	public static void main(String[] args) throws IOException{
		File file = new File("D:\\cdac\\myFile.txt");
		FileReader fr = new FileReader(file);
		BufferedReader buffRead = new BufferedReader(fr,200);
		
		String str;
		while((str=buffRead.readLine()) != null) {
			System.out.println(str);
		}

	}

}
