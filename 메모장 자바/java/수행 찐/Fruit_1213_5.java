import java.util.Scanner;
public class Fruit_1213_5{
	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	System.out.println("구입한 과일의 갯수를 입력하세요.");
	System.out.print("사과 참외 오렌지 포도 : ");
	int a=scan.nextInt();
	int c=scan.nextInt();
	int o=scan.nextInt();
	int g=scan.nextInt();

	int b=(a*1200)+(c*950)+(o*500)+(g*2000);
	
	System.out.println("");
	System.out.println("총 지불금액은 "+b+"원입니다.");
	System.out.println("");

	System.out.print("지급금액 : ");
	int d=scan.nextInt();

	String q=(d + "원을 받아 거스름돈은 "+(d-b)+"원입니다.");
	String w=(d + "원을 받아 금액이 부족합니다.");
	
	String e = (b<=d) ? q : w ;
	System.out.println(e);
	}
}