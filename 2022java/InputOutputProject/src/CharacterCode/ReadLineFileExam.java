package CharacterCode;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineFileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "C:/Temp/BufferInput.txt";
		try {
			FileReader fr = new FileReader(fname);
			//fr�� BufferInput.txt������ ����Ű�� ��ü����
			BufferedReader br = new BufferedReader(fr);
			//br�� BufferInput.txt������ ����Ű�� ��ü�����̰�
			//����Ŭ������ �ִ� readLine()�޼ҵ带 ����ϱ� ����
			String s = "";
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
			fr.close();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
