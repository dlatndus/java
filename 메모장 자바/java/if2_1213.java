import java.util.Scanner;
public class if2_1213{
public static void main(String args[]) {	
	System.out.print("������ ������ �Է��ϼ���. SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6) : ");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();

	
	if(a == 0) System.out.print("������ SUNDAY�Դϴ�.");
	else if(a == 1) System.out.print("������ MONDAY�Դϴ�.");
	else if(a == 2) System.out.print("������ TUESDAY�Դϴ�.");
	else if(a == 3) System.out.print("������ WEDNESDAY�Դϴ�.");
	else if(a == 4) System.out.print("������ THURSDAY�Դϴ�.");
	else if(a == 5) System.out.print("������ FRIDAY�Դϴ�.");
	else if(a == 6) System.out.print("������ SATURDAY�Դϴ�."); 
	else System.out.print("������ �߸� �Է��ϼ̽��ϴ�.");
	
	
}
}