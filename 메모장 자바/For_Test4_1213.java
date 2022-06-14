import java.util.Scanner;
public class For_Test4_1213{
	public static void main (String args[]){
		
		System.out.print("숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int sum = 1;
		System.out.print("1+");
		
		for(int i =1; i<=a; i++){
			sum=sum+(1/i);
			if (i==a)System.out.print("("+1+"/"+i+")");
			else System.out.print("("+1+"/"+i+")"+"+");
		}
		System.out.println("="+sum);
	}
}