package package01;

public class CharAt {
	public static void main(String[] args) {
		String str = "I love Korea";
		
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		//str이 가르키는 문자열의 위치에 해당하는 1개의 문자를 출력
		System.out.println();
	}

}
