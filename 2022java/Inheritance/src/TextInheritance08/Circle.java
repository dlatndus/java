package TextInheritance08;

public class Circle extends Shape {
	private String type = "원";
			
	//재정의 오버라이딩		
	public void draw() {
		System.out.println(type + "그리기");
	}
	
	public void painting() {
		System.out.println("색칠하기");
	}
}
