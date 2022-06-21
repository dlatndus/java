package exception01;

import java.io.FileReader;
import java.io.FileWriter;

public class FileExam2 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("datarr.txt");
		FileWriter fw = new FileWriter("dataww.txt");
		int c;
		while((c = fr.read()) != -1)
			fw.write(c);
		}
		catch(Exception e) {//모든 예외를 처리해 준다
			System.out.println(e.toString());
		}

	}
}
