import java.util.Scanner;
public class Deposit_1213_3{
	public static void main(String args[]){

	final double c = 0.012;
	
	Scanner scan = new Scanner(System.in);
	System.out.print("����(��) : ");
	int a=scan.nextInt();

	System.out.print("���ݱⰣ(��) : ");
	int b=scan.nextInt();
	
	System.out.println("");

	int d = (int)(a*c*b);

	System.out.println("���� = " + d + "        " + "���� �հ� = " + (a + d));
	}
}