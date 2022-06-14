import java.util.Scanner;
public class Multiple_3{
	public static void main (String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int in=scan.nextInt();
		if( in % 3 == 0 ) {
			System.out.println(in+"은(는) 3의 배수입니다."); 
			}
			else{
			System.out.println(in+"은(는) 3의 배수가 아닙니다."); 
			}
			
			System.out.println("****************************"); 


			
	}
}