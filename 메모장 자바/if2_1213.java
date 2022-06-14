import java.util.Scanner;
public class if2_1213{
public static void main(String args[]) {	
	System.out.print("오늘의 요일을 입력하세요. SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) : ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();

	
	if(a == 0) System.out.print("오늘은 SUNDAY입니다.");
	else if(a == 1) System.out.print("오늘은 MONDAY입니다.");
	else if(a == 2) System.out.print("오늘은 TUESDAY입니다.");
	else if(a == 3) System.out.print("오늘은 WEDNESDAY입니다.");
	else if(a == 4) System.out.print("오늘은 THURSDAY입니다.");
	else if(a == 5) System.out.print("오늘은 FRIDAY입니다.");
	else if(a == 6) System.out.print("오늘은 SATURDAY입니다."); 
	else System.out.print("요일을 잘못 입력하셨습니다.");
	
	
}
}