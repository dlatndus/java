package TextInheritance09;

public class ShipMainExam {

	public static void main(String[] args) {
		Ship myship = new MyShip(); // myship��ü������ MyShipŬ������ ����ȯ
		Ship yourship = new YourShip(); // yourship��ü������ YourShipŬ������ ����ȯ
		ShipName.search(myship);
		//1.search(myship); �޼ҵ带 ȣ���� �� ���ڰ����� myship�� ����
		//ShipNameŬ�������� search(Ship s)�� ������ ����ɶ�
		//ship s = myship�� ����� ����. ���� s��ü������ MyShipŬ������ ����ȯ
		//�׷��� s�� MyShip Ŭ���� ��ü Ÿ���̴�.
		
		ShipName.search(yourship);
		//2.search(yourship); �޼ҵ带 ȣ���� �� ���ڰ����� yourship�� ����
		//ShipNameŬ�������� search(Ship s)�� ������ ����ɶ�
		//ship s = yourship�� ����� ����. ���� s��ü������ YourShipŬ������ ����ȯ
		//�׷��� s�� MyShip Ŭ���� ��ü Ÿ���̴�.

	}

}
