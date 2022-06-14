package Inheritance08;

public interface PhoneInterface {
	final int TIMEOUT = 10000; // 상수필드 - 대문자로 표현

	void sendCall(); // 추상메소드

	void receiveCall(); // 추상메소드

	default void printLogo() { // 추상메소드가 아닌 일반 메소드인데 default를 붙인경우 가능 버전 8이상
		System.out.println("** Phone **");

	}

}
