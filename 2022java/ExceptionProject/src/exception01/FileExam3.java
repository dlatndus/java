package exception01;

import java.io.FileReader;
import java.io.FileWriter;

public class FileExam3 {

	public static void main(String[] args) {
		String[] irum = new String[3];
		try {
			for(int i=0; i<=3; i++)
				System.out.println(irum[i]);
			//irum[3]일때 catch문장을 실행하게 된다
		}
		catch(ArrayIndexOutOfBoundsException e) {//모든 예외를 처리해 준다
			System.out.println("예외발생");
		}

	}
}
