package CharacterCode;

import java.io.*;

public class FileExam {

	public static void main(String[] args) {
		char buffer[] = new char[100];
		try {
			FileReader fr = new FileReader("src/CharacterCode/datar.txt");
			//fr��ü������ datar.txt.������ ����Ų��
			
			FileWriter fw = new FileWriter("src/CharacterCode/dataw.txt");
			//fw��ü������ dataw.txt������ ����Ų��
			
			fr.read(buffer, 0, 100);
			//fr�� ����Ű�� datar.txt������ ������ �о buffer�迭�� ����
			
			String str = new String(buffer);
			//String(buffer)�� buffer�迭�� ����Ǿ� �ִµ����͸� ���ڿ��� ����
			
			System.out.println(str);
			fw.write(buffer);
			//buffer�迭�� ����Ǿ� �ִ� �����͸� �ӽñ�������  ���
			fw.flush();
			//����(�ӽñ�����)�� ����Ǿ� �ִ� �����͸� �Ѳ����� ��� dataw.txt���Ͽ� ���
		}
		catch(Exception e) 
		{
			System.err.println(e.toString());
		}
	}

}
