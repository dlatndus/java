import java.util.Scanner;
public class Summer1213_3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수를 입력하시오 : ");
		int a = sc.nextInt();		
		
		for(int i=1; i<=a; i++){
			for(int j=1; j<=i; j++)
			System.out.print(i+"줄");
		System.out.println();
		}
		
	}
}