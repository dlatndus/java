import java.util.Scanner;
public class FourNumber_1213_4{
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("����Ÿ �Է� : ");
	int a=scan.nextInt();

	System.out.println("");

	int b=a/1000;
	int c =a%1000/100;
	int d =a%100/10;
	int e=a%10;
		

	System.out.println("1000�� �ڸ� = "+b);
	System.out.println("100�� �ڸ� = "+c);
	System.out.println("10�� �ڸ� = "+d);
	System.out.println("1�� �ڸ� = "+e);
	}
}