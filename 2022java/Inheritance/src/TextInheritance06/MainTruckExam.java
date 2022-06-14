package TextInheritance06;

public class MainTruckExam {

	public static void main(String[] args) {
		Truck mytruck = new Truck();
		//mytruck은 truck클래스를 가리키는 객체변수
		
		mytruck.speedUp();
		//truck 클래스에 있는 speedup()메소드 호출
		
		mytruck.speedDown();
		//car 클래스에 있는 메소드 호출

	}

}
