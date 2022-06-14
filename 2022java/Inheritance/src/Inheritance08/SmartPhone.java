package Inheritance08;

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
// MobilePhoneInterface의 추상 메소드 구현
	//인터페이스를 구현할 pda클래스를 smartphone클래스가 정의받앗기때문에
	//추상메소드로 선언된 모든 메소드를 여기에서 재정의 해얗나다
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요.");
	}

// MP3Interface의 추상 메소드 구현
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}

// 추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

