package Inheritance03;

public class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y); // super�޼ҵ�� 1���� ����Ѵ� �ΰ����� ������
		this.color = color;
		//super�� colorpoint �������� ù��° �ٿ� ��ġ�ؾ��Ѵ�
	}
	public void showColorPoint() { 
		System.out.print(color);
		showPoint(); 
	}
}
