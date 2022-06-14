import java.util.Scanner;
public class Score_1213{
	public static void  main(String args[]){

		int kor;
		int eng;
		int math;
		int java;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		kor = scan.nextInt();

		System.out.print("영어 점수 : ");
		eng = scan.nextInt();	

		System.out.print("수학 점수 : ");
		math = scan.nextInt();

		System.out.print("자바 점수 : ");
		java = scan.nextInt();

		int a= kor+eng+math+java;
		double b= a/4.0;

		System.out.println("점수 합계 : " + a);
		System.out.println("점수 평균 : " + b);
	
		char grade;	
		//A(90) B(80) C(70) D(60) E 평점
		switch((int)(b/10)){
			case 10 :
			case 9: grade='A'; break;
			case 8: grade='B'; break;
			case 7: grade='C'; break;
			case 6: grade='D'; break;
			default : grade ='E';
		}


		/* char grade;
		if(b >=90 ) grade='A';
		else if(b >=80 ) grade='B';
		else if(b >=70 ) grade='C';
		else if(b >=60 ) grade='D';
		else grade ='E'; */

		System.out.println("평점 : "+grade);









	}
}