package package04;

public class RandExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.random());
		System.out.println(Math.random());
		//0보다는 크고 1보다는 작은 어떤 실수값
		
		System.out.println((int)Math.random()*5);
		//1 Math.random() 값은 0에서 1사이의 값
		//2 (int)Math.random() 은 항상 0이 출력된다
		//0.000001~ 0.9999999 사이의 값이 출력
		//3 (int)Math.random()*5는 0*5이기 때문에 결과는 항상 0이다
		System.out.println((int)(Math.random()*5));
		//0~4사이의 값
		
		System.out.println((int)(Math.random()*10));
		//0~9사이의 값
		
		System.out.println((int)(Math.random()*100));
		//0~99사이의 값
		
		System.out.println((int)(Math.random()*100)+1);
		//1~100사이의 값
	}

}
