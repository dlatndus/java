import java.util.Scanner;
public class For_Test9_1213{
	public static void main (String args[]){
		
		System.out.print("줄 수 입력 ==> ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i =1; i<=a*5; i++){
			if(i%5==0) System.out.println(i);
			else System.out.print(i);

		}
	}
}