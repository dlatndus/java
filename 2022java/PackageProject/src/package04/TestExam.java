package package04;

public class TestExam {

	public static void main(String[] args) {
		//주사위를 10번 던져서
		//1의 눈이 나오면 500원
		//2의 눈이 나오면 1000원
		//3의 눈이 나오면 1500원
		//4의 눈이 나오면 2000원
		//5의 눈이 나오면 2500원
		//6의 눈이 나오면 3000원
		
		int rand = 0;
		int money = 0;
		for(int i =1;i<=10; i++) {
			rand = (int)(Math.random()*6)+1;
			money += i*500;
			System.out.println(i + "번째 "+rand+ "나오고 " + money + "원 있다");
		}
		System.out.println("전체금액은 " + money);
		
	}

}
