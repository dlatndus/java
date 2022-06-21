package exception01;

import java.io.FileReader;
import java.io.FileWriter;

public class FileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("datarr.txt");
		FileWriter fw = new FileWriter("dataww.txt");
		int c;
		while((c = fr.read()) != -1)
			fw.write(c);
	}

}
