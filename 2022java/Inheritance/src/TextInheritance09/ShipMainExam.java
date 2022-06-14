package TextInheritance09;

public class ShipMainExam {

	public static void main(String[] args) {
		Ship myship = new MyShip(); // myship객체변수는 MyShip클래스로 형변환
		Ship yourship = new YourShip(); // yourship객체변수는 YourShip클래스로 형변환
		ShipName.search(myship);
		//1.search(myship); 메소드를 호출할 때 인자값으로 myship이 전달
		//ShipName클래스에서 search(Ship s)이 문장이 실행될때
		//ship s = myship이 문장과 같다. 따라서 s객체변수는 MyShip클래스로 형변환
		//그래서 s는 MyShip 클래스 객체 타입이다.
		
		ShipName.search(yourship);
		//2.search(yourship); 메소드를 호출할 때 인자값으로 yourship이 전달
		//ShipName클래스에서 search(Ship s)이 문장이 실행될때
		//ship s = yourship이 문장과 같다. 따라서 s객체변수는 YourShip클래스로 형변환
		//그래서 s는 MyShip 클래스 객체 타입이다.

	}

}
