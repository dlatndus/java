import java.util.Scanner;
public class a{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if(a%3==0) System.out.println(a+"는 3의 배수입니다.");
		else System.out.println(a+"는 3의 배수가 아닙니다");
	}
}