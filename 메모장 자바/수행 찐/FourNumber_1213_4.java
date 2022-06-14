import java.util.Scanner;
public class FourNumber_1213_4{
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	System.out.print("데이타 입력 : ");
	int a=scan.nextInt();

	System.out.println("");

	int b=a/1000;
	int c =a%1000/100;
	int d =a%100/10;
	int e=a%10;
		

	System.out.println("1000의 자리 = "+b);
	System.out.println("100의 자리 = "+c);
	System.out.println("10의 자리 = "+d);
	System.out.println("1의 자리 = "+e);
	}
}