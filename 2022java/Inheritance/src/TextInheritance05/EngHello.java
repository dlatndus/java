package TextInheritance05;

public class EngHello extends Greeting{
	public String name = "Mr.Hong";

	public void sayHello() {
		System.out.println(name+" Nice to meet you");
	}
	
	public void test() {
		System.out.println(super.name);//super.name는 부모클래스의 name 을 출력
		super.sayHello(); //부모클래스에 있는 sayHello()메소드를 호출
	}
	
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.test();
		
	}

}
