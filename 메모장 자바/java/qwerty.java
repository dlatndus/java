import java.util.Scanner;
public class qwerty{
public static void main(String args[]){
	System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();

	if(a==1) System.out.println("당신은 가위를 내셨습니다.");
	else if(a==2) System.out.println("당신은 바위를 내셨습니다.");
	else if(a==3) System.out.println("당신은 보를 내셨습니다.");
	else System.out.println("잘못 내셨습니다.");

}
}