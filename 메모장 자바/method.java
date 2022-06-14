import java.util.Scanner;
public class method{
	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=1;
		int i;
		System.out.print(a+ "!"+"=");
		
		for(i =1; i<= a; i++){
			sum= sum*i;
			if(a==i)
				System.out.print(i);
			else
				System.out.print(i+"*");
		}
		System.out.print("="+sum);


				
	}
}