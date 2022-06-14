package TextInheritance09;

public class ShipName { //클래스 메소드이고(클래스 이름으로 접근)
	//serahc(Ship s)메소드가 인자값으로 받는 객체변수 s는 형 변환된 데이터를 받기 때문에
	//s는 업캐스팅 된다.
	public static void search(Ship s) 
	{ //클래스 메소드(static 때문에)이고(클래스 이름으로 접근)
		if (s instanceof MyShip) {
			MyShip b = (MyShip)s;//객체변수 s를 가지고 다운케스팅 할 수 있다
			System.out.println("MyShip 이름 : "+ b.Name());
		}
		else if(s instanceof YourShip) {
			YourShip b = (YourShip)s;//객체변수 s를 가지고 다운케스팅 할 수 있다
			System.out.println("YourShip 이름 : "+ b.Name());
		}
	}
}
