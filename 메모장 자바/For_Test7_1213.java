import java.util.Scanner;
public class For_Test7_1213{
	public static void main (String args[]){
		
		System.out.print("숫자를 입력하시오. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i =1; i<=a; i++){
			for(int j =1; j<=i; j++)
			System.out.print((char)(91-j));
		System.out.println();
		}
	}
}