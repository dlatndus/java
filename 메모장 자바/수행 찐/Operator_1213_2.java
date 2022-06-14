import java.util.Scanner;
public class Operator_1213_2{
	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		System.out.print("X : ");
		int a=scan.nextInt();

		System.out.print("Y : ");
		int b=scan.nextInt();
	
		System.out.println("");

		String d=("ÇÕ = " + (a+b) +" " + "Â÷ = " + (a-b) +" " + "°ö = " + (a*b) +" " + "¸ò = " + (a/b));
		String e=("ÇÕ = " + (a+b) +" " + "Â÷ = " + (b-a) +" " + "°ö = " + (a*b) +" " + "¸ò = " + (b/a));

		String c = (a>b) ? d : e; 
		System.out.println(c);
	}
}