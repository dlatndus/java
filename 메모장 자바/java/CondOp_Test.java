import java.util.Scanner;
public class CondOp_Test{
public static void main (String args[]){
	int a;
	Scanner scan = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	a=scan.nextInt();

	
	String b="홀수";
	String d="짝수";
	String e=(a%2==0)?d:b;
	
	System.out.print(a);
	System.out.print("은(는)");
	System.out.print(e);
	System.out.print("입니다.");

	System.out.print(a+"입니다.");
	}
}