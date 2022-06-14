import java.util.Scanner;
public class School_1213_1{
	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	System.out.print("학교 : ");
	String a=scan.nextLine();

	System.out.print("학년 : ");
	int b=scan.nextInt();

	System.out.print("반 : ");
	int c=scan.nextInt();

	System.out.print("이름 : ");
	String d=scan.next();
	
	System.out.println("");
	System.out.println(d + "은(는) " + a + "학교 " + b + "학년 " + c + "반입니다.");
	}
}