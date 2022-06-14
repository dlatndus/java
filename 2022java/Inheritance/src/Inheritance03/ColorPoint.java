package Inheritance03;

public class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y); // super메소드는 1개만 기술한다 두개쓰면 오류남
		this.color = color;
		//super은 colorpoint 생성자의 첫번째 줄에 위치해야한다
	}
	public void showColorPoint() { 
		System.out.print(color);
		showPoint(); 
	}
}
