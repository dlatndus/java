package package01;

public class TrimExam {

	public static void main(String[] args) {
		String strData1 = "  	I Love You  	";//���ڿ�
		String strData2;
		
		//strData1�� ����Ű�� ���ڿ����� �� ���� ������ ����
		strData2 = strData1.trim();
		System.out.println("strData2.trim() ==>" + strData2);
		
		if(strData1.equals(strData2))
			System.out.println("����");
		else
			System.out.println("�ٸ�");

	}

}