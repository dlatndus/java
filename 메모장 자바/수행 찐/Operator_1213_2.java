import java.util.Scanner;
public class Operator_1213_2{
	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		System.out.print("X : ");
		int a=scan.nextInt();

		System.out.print("Y : ");
		int b=scan.nextInt();
	
		System.out.println("");

		String d=("�� = " + (a+b) +" " + "�� = " + (a-b) +" " + "�� = " + (a*b) +" " + "�� = " + (a/b));
		String e=("�� = " + (a+b) +" " + "�� = " + (b-a) +" " + "�� = " + (a*b) +" " + "�� = " + (b/a));

		String c = (a>b) ? d : e; 
		System.out.println(c);
	}
}