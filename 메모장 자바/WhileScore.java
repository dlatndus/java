import java.util.Scanner;
public class WhileScore{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum=0;
		while(i<=i){ //while(true)해도됨
			System.out.print("점수를 입력하시오 :  ");
			int a = sc.nextInt();
			if(a==0) break;
			sum = sum+a;
			i++;
		}
		System.out.println("점수의 합 = "+sum);
		System.out.println("점수의 평균 = "+(double)(sum/i));
	}
}