package package04;

public class TestExam {

	public static void main(String[] args) {
		//�ֻ����� 10�� ������
		//1�� ���� ������ 500��
		//2�� ���� ������ 1000��
		//3�� ���� ������ 1500��
		//4�� ���� ������ 2000��
		//5�� ���� ������ 2500��
		//6�� ���� ������ 3000��
		
		int rand = 0;
		int money = 0;
		for(int i =1;i<=10; i++) {
			rand = (int)(Math.random()*6)+1;
			money += i*500;
			System.out.println(i + "��° "+rand+ "������ " + money + "�� �ִ�");
		}
		System.out.println("��ü�ݾ��� " + money);
		
	}

}
