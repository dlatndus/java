import java.util.Scanner;
public class Summer1213_7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("밑면의 반지름을 입력하시오 : ");
		int m = sc.nextInt();
		System.out.print("높이를 입력하시오 : ");
		int h = sc.nextInt();		
		
	
		if(h>=100) System.out.println("숫자가 너무 큽니다");
		else System.out.println(su(m, h)+"π");	
	}

	static int su(int m, int h){
		int a = (m*m*h)/3;
		return a;
	}
}