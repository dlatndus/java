import java.util.Scanner;
public class j{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		
		System.out.print(a);
		for(int i=1; i<=a; i++){
			if(a%i==0) sum++;
		}

			if (sum==2) System.out.print("소수이다");
			else System.out.print("소수가 아니다");
	}
}