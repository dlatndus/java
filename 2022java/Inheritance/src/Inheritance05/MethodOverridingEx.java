package Inheritance05;

public class MethodOverridingEx {
	static void paint(Shape p) { //�̹��忡�� ��ĳ������ �Ǵ� ����Ŭ������ �������̵�(������)�� �޼ҵ尡ȣ��ȴ�
		p.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line(); //line ��ü ����
		paint(line);
		paint(new Shape()); //shape Ŭ������ ������ �� �޼ҵ尡 ȣ��Ǵ� ��Ȳ�̴�
		paint(new Line()); //line Ŭ������ ������ �� �޼ҵ尡 ȣ��Ǵ� ��Ȳ�̴�
		paint(new Rect()); //rect Ŭ������ ������ �� �޼ҵ尡 ȣ��Ǵ� ��Ȳ�̴�
		paint(new Circle()); //circle Ŭ������ ������ �� �޼ҵ尡 ȣ��Ǵ� ��Ȳ�̴�
		
	}

}
