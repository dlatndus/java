package TextInheritance11;

public class SoundExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sound radio = new Radio();//upcasting 과 유사함
		//radio 객체변수는 radio 클래스에서 재 정의 된 메소드에 접근
		Sound tv = new TV();
		
		radio.SoundUp(5);
		tv.SoundDown(5);
	}

}
