package TextInheritance11;

public class SoundExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sound radio = new Radio();//upcasting �� ������
		//radio ��ü������ radio Ŭ�������� �� ���� �� �޼ҵ忡 ����
		Sound tv = new TV();
		
		radio.SoundUp(5);
		tv.SoundDown(5);
	}

}
