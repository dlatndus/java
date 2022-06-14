import java.util.Scanner;
public class Fact_method{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б : ");
		int n = sc.nextInt();
		System.out.print(n+"! = ");

		System.out.print(" = "+fact(n));
	}
	static int fact(int n){
	int sum=1;
		for(int i=1; i<=n; i++){
			if(i==n) System.out.print(i);
			else System.out.print(i+"*");
			sum=sum*i;
		}
		return sum;
	}
}