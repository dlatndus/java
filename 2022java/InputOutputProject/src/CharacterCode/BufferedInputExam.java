package CharacterCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedInputExam {

	public static void main(String[] args) {
		
		//�̰͵� ����
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		
		String s = "";
		try {
			s = in.readLine();//Ű����κ��� ���δ����� �����͸� �Է��� �ϰ� 
			//�Ǹ� ���ۿ� �ӽ������� ����Ǹ鼭 �� ���� s���� �Ѱ��ش�
		}
		catch(Exception e) //���ܰ� �߻��Ǿ��� ��쿡�� ����
		{
			System.err.println("Error : " + e.toString());
		}
		System.out.println(s);
	}

}
