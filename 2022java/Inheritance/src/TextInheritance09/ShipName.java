package TextInheritance09;

public class ShipName { //Ŭ���� �޼ҵ��̰�(Ŭ���� �̸����� ����)
	//serahc(Ship s)�޼ҵ尡 ���ڰ����� �޴� ��ü���� s�� �� ��ȯ�� �����͸� �ޱ� ������
	//s�� ��ĳ���� �ȴ�.
	public static void search(Ship s) 
	{ //Ŭ���� �޼ҵ�(static ������)�̰�(Ŭ���� �̸����� ����)
		if (s instanceof MyShip) {
			MyShip b = (MyShip)s;//��ü���� s�� ������ �ٿ��ɽ��� �� �� �ִ�
			System.out.println("MyShip �̸� : "+ b.Name());
		}
		else if(s instanceof YourShip) {
			YourShip b = (YourShip)s;//��ü���� s�� ������ �ٿ��ɽ��� �� �� �ִ�
			System.out.println("YourShip �̸� : "+ b.Name());
		}
	}
}
