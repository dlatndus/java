package CharacterCode;

import java.io.*;

public class FileExam2 {

	public static void main(String[] args) {
		char buffer[] = new char[100];
		try {
			FileReader fr = new FileReader("src/CharacterCode/datar2.txt");
			FileWriter fw = new FileWriter("src/CharacterCode/dataw2.txt");
			
			int c;
			while((c = fr.read()) != -1) {
				fw.write(c);
			}
			fw.flush();//dataw2.txt ���Ͽ� ���������� ���
		}
		catch(Exception e) 
		{
			System.err.println(e.toString());
		}
	}

}
