package package02;
//��
public class AppendExam {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(" java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		
		//sb1�� ����Ű�� ���ڿ� �ڿ� " project"�� Ǫ���ȴ� ���� sb1�� ����Ű�� ���ڿ��� �����Ͱ�
		//�߰� �Ǿ��� ������ ������ ������ �߻��ߴ�
		//���� sb1�� str1�� ���� ���ڿ��� �ּҸ� ����Ų��. ����غ��� ���� ����� ���´�
		
		str1 = sb1.append(" Project");
		
		//����� sb1�� ����Ű�� ���ڿ��� sb2���ڿ��� �߰��Ѵ�
		//str2, str1, sb1�� ���� ���ڿ��� ����Ų��
		str2 = sb1.append(sb2);
		
		System.out.println("sb1 = "+sb1);
		System.out.println("sb2 = "+sb2);
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);

	}

}
