package exception01;

import java.io.*;

public class FileExam7 {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:/Temp/test123.java");
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe.toString());
		}
	}
}
