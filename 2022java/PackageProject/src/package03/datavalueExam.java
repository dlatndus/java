package package03;

import java.util.StringTokenizer;

public class datavalueExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String tmpStr = "hong ��걸 10.5 20.5";
		//�⺻������ ���(������)�� �������� �����Ǿ� �ִ�
		//��ū�� , �� �����ȴ� �����͸� �и��Ҷ� ,�� ����
		//StringTokenizer parse = new StringTokenizer(tmpStr, ",");
		
		StringTokenizer parse = new StringTokenizer(tmpStr);
		
		String name;
		String address;
		double math;
		double english;
		double total;
		double avg;
		
		name = parse.nextToken();
		//parese�� hong -- ���ڿ����� hong�� ����Ų��
		//hong���ڿ��� name �� ������ �Ŀ� parse�� ��걸 ���ڿ��� ����Ų��
		address = parse.nextToken();
		//address�� ��걸 ���ڿ��� ������ �Ŀ� parse�� 10.5�� ����Ų��
		math = Double.valueOf(parse.nextToken()).doubleValue();
		//1. parse.nextToken()�� 10.5f�� �̾Ƴ��� pares�� 20.5�� ����Ų��
		//2.Double.valueOf(parse.nextToken())�� "20.5"�� Wrapper �� �Ǽ������� ��ȯ
		//3. doubleValue();�� �⺻�Ǽ���(double)���� ��ȯ
		//english = 20.5�� ���� 
		
		english = Double.valueOf(parse.nextToken()).doubleValue();
		total = math + english;
		avg = total/2.0;
		System.out.println(name + "\t" + address + "\t" + math + "\t"
		 + english + "\t" + total + "\t" +avg);
		
	
	
	}

}
