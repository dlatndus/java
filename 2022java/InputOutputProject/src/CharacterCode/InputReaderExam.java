package CharacterCode;

import java.io.*;
public class InputReaderExam {

	public static void main(String[] args) {
		Reader reader = new InputStreamReader(System.in);
		//reader ��ü������ read()�޼ҵ忡 ���� Ű����κ���
		//�����͸� �Է¹��� �� �ִ� ������ ����
		try {
			while(true) {
				int i = reader.read(); //Ű����κ��� �Է� ����
				if(i==-1) break; //CTRL+Z(-1)
				char c = (char)i;
				System.out.print(c);
			}
		}
		catch(IOException e) 
		{
			System.err.println(e);
		}
		System.out.println();

	}

}
