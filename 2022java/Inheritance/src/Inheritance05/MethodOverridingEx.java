package Inheritance05;

public class MethodOverridingEx {
	static void paint(Shape p) { //이문장에서 업캐스팅이 되는 하위클래스의 오버랑이딩(재정의)된 메소드가호출된다
		p.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line(); //line 객체 생성
		paint(line);
		paint(new Shape()); //shape 클래스의 재정의 된 메소드가 호출되는 상황이다
		paint(new Line()); //line 클래스의 재정의 된 메소드가 호출되는 상황이다
		paint(new Rect()); //rect 클래스의 재정의 된 메소드가 호출되는 상황이다
		paint(new Circle()); //circle 클래스의 재정의 된 메소드가 호출되는 상황이다
		
	}

}
