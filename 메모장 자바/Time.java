import java.util.Scanner;
public class Time{
	public static void main(String args[]){
	int a;
	Scanner scan = new Scanner(System.in);
	System.out.print("초 입력 : ");
	a =scan.nextInt();

	int c=a/3600;
	int b=(a-(c*3600))/60;
	//int d=a-((b*60)+(c*3600));
	int d=a%60;
	
	/* System.out.print(a);
	System.out.print("초는  ");
	System.out.print(c);
	System.out.print("시간 ");

	System.out.print(b);
	System.out.print("분 ");

	System.out.print(d);
	System.out.println("초입니다."); */

	System.out.println(a+"초는 "+c+"시간 "+b+"분 "+d+"초입니다.");




	}
}