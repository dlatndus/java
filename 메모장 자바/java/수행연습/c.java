import java.util.Scanner;
public class c{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();


		int e = (a+b+c+d);
		double f =0.0;
		f= (e/4.0);
		
		char g;

		System.out.println("국어 점수 : "+a);
		System.out.println("수학 점수 : "+b);
		System.out.println("자바 점수 : "+c);
		System.out.println("영어 점수 : "+d);
		System.out.println("점수 합계 : "+e);
		System.out.println("점수 평균 : "+f);
		
		if (f>=90) g='A';
		else if (f>=80) g='B';
		else g='c';
		
		System.out.println("평점 : "+g);
		
	}
}