package package03;

public class ValueOfExam {

	public static void main(String[] args) {
		String stri = "123456";
		String strd = "123.56";
		
		//stri�� ����Ű�� ���ڿ��� ������ ���ڷ� ����
		System.out.println(Integer.valueOf(stri));
		
		//strd�� ����Ű�� ���ڿ��� �Ǽ��� ���ڷ� ����
		//���� valueOf()�޼ҵ�� ���ڿ��� ���ڷ� �����Ѵ�
		System.out.println(Double.valueOf(strd));
		System.out.println(Integer.valueOf(stri) + Double.valueOf(strd));
	}

}
