package package02;

public class ToStringExam {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java Programming");
		String str = null;
		
		//sb1�� StringBufferŬ���� Ÿ���� ���ڿ��ε� String Ÿ������
		//�����ؼ� str���� �Ѱ��ش�
		//String str = "java Programming"�� ����
		str = sb1.toString();
		
		System.out.println("str=>"+str);
		System.out.println("str.toUpperCase=>"+str.toUpperCase());
		//str�� ����Ű�� ���ڿ��� �빮�ڷ� �����ؼ� ���
		System.out.println("str=>"+str);
	}
}
