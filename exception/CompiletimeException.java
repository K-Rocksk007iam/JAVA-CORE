package exception;

import java.io.*;

public class CompiletimeException {

//	public static void main(String[] args)  {
//		
//		try {
//			FileInputStream fs = new FileInputStream("D:\\cdac\\myFile.txt");
//			int k;
//			while((k=fs.read())!=-1) {
//				System.out.print((char)k);
//			}
//		} catch (IOException e) {
//			System.out.println("THIS IS A ERROR:");
//			e.printStackTrace();
//		}
//		
//		
//	}

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("D:\\cdac\\myFile.txt");
		int k;
		while ((k = fs.read()) != -1) {
			System.out.print((char) k);

		}
	}
}
