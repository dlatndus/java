import java.util.Scanner;
public class Absolute_Test{
	public static void main(String args[]){
	int a;
	Scanner scan = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	a =scan.nextInt();

	int b = (a>0)?a:a*(-1);
	
	System.out.print(a);
	System.out.print("의 절대값은 ");
	System.out.print(b);
	System.out.print("입니다.");
	}
}