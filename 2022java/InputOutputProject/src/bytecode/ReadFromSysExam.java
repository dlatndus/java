package bytecode;

import java.io.IOException;

public class ReadFromSysExam {
	public static void main(String args[]) {
	
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b);
			//�迭 b�� �Է��� �����͵��� �����ϴµ� �Է��� ��������
			//���̰��� �����ؼ� len�� ����
			System.out.write(b, 0, len);
			//�� b�� ����Ǿ� �ִ� �����͸� 0��°���� �����Ͽ�
			//len ���� ��ŭ ����ض�
		}
		catch(IOException e) 
		{
			System.err.println("�Է½���");
		}
	}
}

