package package03;

public class WrapExam {

	public static void main(String[] args) {
		Integer wrapi = new Integer(100);
		Double wrapd = new Double(55.7);
		
		int i = 100;
		double d = 55.7;
		double di;
		di = d+i;
		System.out.println(di);
		
		//Integer Ŭ������ �ִ� toString(i)�޼ҵ�� i ���� ���ڿ��� �����ϴ� �޼ҵ��̴�
		//Double Ŭ������ �ִ� toString(d)�޼ҵ�� d ���� ���ڿ��� �����ϴ� �޼ҵ��̴�
		//���ڿ� + ���ڿ��� ���ڿ��̴�
		System.out.println(Integer.toString(i)+Double.toString(d));
		
		//wrapi�� Intger��ü�����̱� ������ toString(i)�� ����� �� �ְ� i���� ���ڿ��� ����
		//wrapd�� Double��ü�����̱� ������ toString(d)�� ����� �� �ְ� d���� ���ڿ��� ����
		System.out.println(wrapi.toString(i) + wrapd.toString(d));

	}

}
