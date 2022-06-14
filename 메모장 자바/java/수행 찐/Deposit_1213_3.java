import java.util.Scanner;
public class Deposit_1213_3{
	public static void main(String args[]){

	final double c = 0.012;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("원금(원) : ");
	int a=scan.nextInt();

	System.out.print("예금기간(년) : ");
	int b=scan.nextInt();
	
	System.out.println("");

	int d = (int)(a*c*b);

	System.out.println("이자 = " + d + "        " + "원리 합계 = " + (a + d));
	}
}