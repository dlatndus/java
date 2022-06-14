import java.util.Scanner;
public class Summer1213_2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		char key = sc.next().charAt(0);		
		
		if (key=='w')
			System.out.println("앞으로 한칸");
		else if (key=='a')
			System.out.println("왼쪽으로 한칸");
		else if (key=='s')
			System.out.println("뒤로 한칸");
		else if (key=='d')
			System.out.println("오른쪽으로 한칸");
		else
			System.out.println("잘못 누르셨습니다");
		
	}
}